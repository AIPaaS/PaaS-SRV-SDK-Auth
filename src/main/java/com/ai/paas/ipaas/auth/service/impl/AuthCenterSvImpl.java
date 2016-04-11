package com.ai.paas.ipaas.auth.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.paas.ipaas.PaaSConstant;
import com.ai.paas.ipaas.auth.constants.AuthConstants;
import com.ai.paas.ipaas.auth.constants.UserClientException;
import com.ai.paas.ipaas.auth.dao.interfaces.AuthCenterMapper;
import com.ai.paas.ipaas.auth.dao.interfaces.AuthHistoryMapper;
import com.ai.paas.ipaas.auth.dao.mapper.bo.AuthCenter;
import com.ai.paas.ipaas.auth.dao.mapper.bo.AuthCenterCriteria;
import com.ai.paas.ipaas.auth.dao.mapper.bo.AuthHistory;
import com.ai.paas.ipaas.auth.service.IAuthCenterSv;
import com.ai.paas.ipaas.auth.service.dto.AuthDescriptor;
import com.ai.paas.ipaas.auth.service.dto.AuthParam;
import com.ai.paas.ipaas.auth.service.dto.AuthResult;
import com.ai.paas.ipaas.auth.service.dto.ConfigInfo;
import com.esotericsoftware.minlog.Log;
import com.google.gson.Gson;
@Transactional(rollbackFor = Exception.class)
@Service
public class AuthCenterSvImpl implements IAuthCenterSv {

	@Autowired
	private SqlSessionTemplate template;

	@Override
	public AuthResult authLogin(AuthDescriptor authDes) throws UserClientException  {
		AuthResult result = new AuthResult();
		try {
			String authUserName = authDes.getAuthUserName();
			String password = authDes.getPassword();
			// restful链接、用户编码、密码、账户来源
			AuthCenterMapper mapper = template.getMapper(AuthCenterMapper.class);
			AuthCenterCriteria authCenterCriteria = new AuthCenterCriteria();

			authCenterCriteria.createCriteria().andAuthUserNameEqualTo(authUserName).andAuthPasswordEqualTo(password);

			List<AuthCenter> authResults = mapper.selectByExample(authCenterCriteria);
			
			if (authResults.size() == 1) {
				
				AuthCenter authResult = authResults.get(0);
				result.setSuccessed(true);
				result.setUserId(authResult.getAuthUserId());
			}else{
				result.setSuccessed(false);
				result.setAuthMsg(AuthConstants.AUTH_FAILURE_MSG);
			}

		} catch (Exception e) {
			Log.error("authLogin:"+e.getMessage(), e);
			throw new UserClientException(PaaSConstant.ExceptionCode.SYSTEM_ERROR, e);
		}
		return result;
	}


	@Override
	public AuthResult auth(AuthParam authParam) throws UserClientException {
		AuthResult result = new AuthResult();
		String userId = null, authUserName = null;
		try {
			String pId = authParam.getpId();
			String serviceId = authParam.getServiceId();
			
			//根据pid查询userId
			AuthCenterMapper mapper = template.getMapper(AuthCenterMapper.class);
			AuthCenterCriteria acc = new AuthCenterCriteria();
			acc.createCriteria().andAuthPidEqualTo(pId).andAuthSourceEqualTo(AuthConstants.AUTH_WEB_USER);
			List<AuthCenter> acRes = mapper.selectByExample(acc);
			if(acRes.size() > 0){
				userId = acRes.get(0).getAuthUserId();
				authUserName = acRes.get(0).getAuthUserName();
			}
			if(userId != null && authUserName != null){
				String password = authParam.getPassword();
				// restful链接、用户编码、密码、账户来源
				AuthCenterCriteria authCenterCriteria = new AuthCenterCriteria();
				
				authCenterCriteria.createCriteria().andAuthUserNameEqualTo(serviceId).andAuthPidEqualTo(pId).andAuthPasswordEqualTo(password);
				List<AuthCenter> authResults = mapper.selectByExample(authCenterCriteria);
				
				if (authResults.size() == 1) {
					
					AuthCenter authResult = authResults.get(0);
					Gson son = new Gson();
					ConfigInfo info = son.fromJson(authResult.getAuthParam(), ConfigInfo.class);
					result.setSuccessed(true);
					result.setConfigAddr(info.getConfigAddr());
					result.setConfigPasswd(info.getConfigPwd());
					result.setConfigUser(info.getConfigUser());
					result.setUserId(userId);
					result.setUserName(authUserName);
					
					//put history add by jianhua.ma 20151105
					AuthHistoryMapper hisMapper = template.getMapper(AuthHistoryMapper.class);
					AuthHistory his = new AuthHistory();
					his.setAuthPid(pId);
					his.setAuthServiceid(serviceId);
					his.setAuthDate(new Timestamp(new Date().getTime()));
					hisMapper.insert(his);
					
				}else{
					result.setSuccessed(false);
					result.setAuthMsg(AuthConstants.AUTH_FAILURE_MSG);
				}
				
			}

		} catch (Exception e) {
			Log.error("authService:"+e.getMessage(), e);
			throw new UserClientException(PaaSConstant.ExceptionCode.SYSTEM_ERROR, e);
		}
		return result;
	}
	@Override
	public AuthResult authService(AuthDescriptor authDes) throws UserClientException {
		AuthResult result = new AuthResult();
		String userId = null;
		try {
			String authUserName = authDes.getAuthUserName();
			//根据用户名查询userId
			AuthCenterMapper mapper = template.getMapper(AuthCenterMapper.class);
			AuthCenterCriteria authCenterCriteriaUserId = new AuthCenterCriteria();
			authCenterCriteriaUserId.createCriteria().andAuthUserNameEqualTo(authUserName);
			List<AuthCenter> authResultsUserId = mapper.selectByExample(authCenterCriteriaUserId);
			if(authResultsUserId.size() > 0){
				userId = authResultsUserId.get(0).getAuthUserId();
			}
			if(userId != null){
				String password = authDes.getPassword();
				// restful链接、用户编码、密码、账户来源
				AuthCenterCriteria authCenterCriteria = new AuthCenterCriteria();
				authCenterCriteria.createCriteria().andAuthUserNameEqualTo(authDes.getServiceId()).andAuthUserIdEqualTo(userId).andAuthPasswordEqualTo(password);
				List<AuthCenter> authResults = mapper.selectByExample(authCenterCriteria);
				
				if (authResults.size() == 1) {
					
					AuthCenter authResult = authResults.get(0);
					Gson son = new Gson();
					ConfigInfo info = son.fromJson(authResult.getAuthParam(), ConfigInfo.class);
					result.setSuccessed(true);
					result.setConfigAddr(info.getConfigAddr());
					result.setConfigPasswd(info.getConfigPwd());
					result.setConfigUser(info.getConfigUser());
					result.setUserId(userId);
					result.setUserName(authUserName);
					result.setPid(authResult.getAuthPid());
				}else{
					result.setSuccessed(false);
					result.setAuthMsg(AuthConstants.AUTH_FAILURE_MSG);
				}
			}
			
		} catch (Exception e) {
			Log.error("authService:"+e.getMessage(), e);
			throw new UserClientException(PaaSConstant.ExceptionCode.SYSTEM_ERROR, e);
		}
		return result;
	}



}
