package com.ai.paas.ipaas.auth.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ai.paas.ipaas.auth.service.IAuthCenterSv;
import com.ai.paas.ipaas.auth.service.dto.AuthDescriptor;
import com.ai.paas.ipaas.auth.service.dto.AuthParam;
import com.ai.paas.ipaas.auth.service.dto.AuthResult;
import com.ai.paas.ipaas.util.Assert;
import com.google.gson.Gson;

@Controller
@RequestMapping(value = "/service")
public class ServiceController {
	private static final Logger log = LogManager.getLogger(ServiceController.class
			.getName());

	@Autowired
	IAuthCenterSv authCenterSv;
	
	@RequestMapping(value = "/check", produces = "text/html;charset=UTF-8")
	public @ResponseBody String checkUser(@RequestParam String authUserName,
			@RequestParam String password, @RequestParam String serviceId)  {
		
		AuthResult ar = new AuthResult();
		Gson son = new Gson();
		try {
			Assert.notNull(authUserName, "authUserName is null");
			Assert.notNull(password, "password is null");
			Assert.notNull(serviceId, "serviceId is null");
			
			AuthDescriptor ad = new AuthDescriptor();
			ad.setAuthUserName(authUserName);
			ad.setPassword(password);
			ad.setServiceId(serviceId);
			log.debug("authUserName-----------------" + authUserName);
			log.debug("serviceId-----------------" + serviceId);
			log.debug("password-----------------" + password);
			
			AuthResult queryRes = authCenterSv.authService(ad);
			if (queryRes.isSuccessed()) {
				return son.toJson(queryRes);
			} else {
				ar.setSuccessed(false);
				ar.setAuthMsg(queryRes.getAuthMsg());
				ar.setUserName(authUserName);
				return son.toJson(ar);
			}
		} catch (Exception e) {
			ar.setAuthMsg("System error...Param{authUserName:"+authUserName+"----password:"+password+"----serviceId:"+serviceId+"}");
			ar.setUserName(authUserName);
			ar.setSuccessed(false);
			return son.toJson(ar);
		}
	}
	@RequestMapping(value = "/auth", produces = "text/html;charset=UTF-8")
	public @ResponseBody String auth(@RequestParam String pId,
			@RequestParam String password, @RequestParam String serviceId)  {
		
		AuthResult ar = new AuthResult();
		Gson son = new Gson();
		try {
			Assert.notNull(pId, "pId is null");
			Assert.notNull(password, "password is null");
			Assert.notNull(serviceId, "serviceId is null");
			
			AuthParam ap = new AuthParam();
			ap.setpId(pId);
			ap.setPassword(password);
			ap.setServiceId(serviceId);
			log.debug("pId-----------------" + pId);
			log.debug("serviceId-----------------" + serviceId);
			log.debug("password-----------------" + password);
			
			AuthResult queryRes = authCenterSv.auth(ap);
			if (queryRes.isSuccessed()) {
				return son.toJson(queryRes);
			} else {
				ar.setSuccessed(false);
				ar.setAuthMsg(queryRes.getAuthMsg());
				ar.setUserName(pId);
				return son.toJson(ar);
			}
		} catch (Exception e) {
			ar.setAuthMsg("System error...Param{pId:"+pId+"----password:"+password+"----serviceId:"+serviceId+"}");
			ar.setUserName(pId);
			ar.setSuccessed(false);
			return son.toJson(ar);
		}
	}

}
