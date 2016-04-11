package com.ai.paas.ipaas.auth.service.dto;

import java.io.Serializable;

public class AuthDescriptor implements Serializable {
	private static final long serialVersionUID = 5830430155485771066L;
	// 用户编码
	private String authUserName = null;
	private String password = null;
	private String serviceId = null;

	public AuthDescriptor() {

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthUserName() {
		return authUserName;
	}

	public void setAuthUserName(String authUserName) {
		this.authUserName = authUserName;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}


}