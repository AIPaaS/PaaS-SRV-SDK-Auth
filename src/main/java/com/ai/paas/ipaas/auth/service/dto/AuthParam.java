package com.ai.paas.ipaas.auth.service.dto;

import java.io.Serializable;

public class AuthParam implements Serializable {
	private static final long serialVersionUID = 5830430155485771067L;
	private String pId = null;
	private String password = null;
	private String serviceId = null;

	public AuthParam() {

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	
	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}


}