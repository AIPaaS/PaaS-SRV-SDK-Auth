package com.ai.paas.ipaas.auth.service.dto;

import java.io.Serializable;

public class AuthResult implements Serializable {
	private static final long serialVersionUID = -1064949882761359027L;

	public AuthResult() {
		// test
	}

	private String userId = null;
	private String pid = null;
	private String userName = null;
	private boolean successed = false;
	private String authMsg = null;
	/**
	 * 配置地址，ZK模式，IP:PORT;IP:PORT
	 */
	private String configAddr = null;
	private String configUser = null;
	private String configPasswd = null;

	

	public String getConfigAddr() {
		return configAddr;
	}

	public void setConfigAddr(String configAddr) {
		this.configAddr = configAddr;
	}

	public String getConfigUser() {
		return configUser;
	}

	public void setConfigUser(String configUser) {
		this.configUser = configUser;
	}

	public String getConfigPasswd() {
		return configPasswd;
	}

	public void setConfigPasswd(String configPasswd) {
		this.configPasswd = configPasswd;
	}

	public String getAuthMsg() {
		return authMsg;
	}

	public void setAuthMsg(String authMsg) {
		this.authMsg = authMsg;
	}

	public boolean isSuccessed() {
		return successed;
	}

	public void setSuccessed(boolean successed) {
		this.successed = successed;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPid() {
		return pid;
	}
	
	public void setPid(String pid) {
		this.pid = pid;
	}

}
