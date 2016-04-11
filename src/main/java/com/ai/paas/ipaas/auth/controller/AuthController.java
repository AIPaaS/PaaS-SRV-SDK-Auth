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
import com.ai.paas.ipaas.auth.service.dto.AuthResult;
import com.ai.paas.ipaas.util.Assert;
import com.google.gson.Gson;

@Controller
@RequestMapping(value = "/auth")
public class AuthController {
	private static final Logger log = LogManager.getLogger(AuthController.class
			.getName());

	@Autowired
	IAuthCenterSv authCenterSv;
	
	@RequestMapping(value = "/login", produces = "text/html;charset=UTF-8")
	public @ResponseBody String checkUser(@RequestParam String authUserName,
			@RequestParam String password)  {
		
		AuthResult ar = new AuthResult();
		Gson son = new Gson();
		try {
			Assert.notNull(authUserName, "authUserId is null");
			Assert.notNull(password, "password is null");
			
			AuthDescriptor ad = new AuthDescriptor();
			ad.setAuthUserName(authUserName);
			ad.setPassword(password);
			
			log.debug("authSource-----------------WEB" );
			log.debug("authUserName-----------------" + authUserName);
			log.debug("password-----------------" + password);
			
			AuthResult queryRes = authCenterSv.authLogin(ad);
			if (queryRes.isSuccessed()) {
				return son.toJson(queryRes);
			} else {
				ar.setSuccessed(false);
				ar.setAuthMsg(queryRes.getAuthMsg());
				ar.setUserName(authUserName);
				return son.toJson(ar);
			}
		} catch (Exception e) {
			ar.setAuthMsg("System error...Param{authUserName:"+authUserName+"----password:"+password+"----authSource:WEB}");
			ar.setUserName(authUserName);
			ar.setSuccessed(false);
			return son.toJson(ar);
		}
	}
	

}
