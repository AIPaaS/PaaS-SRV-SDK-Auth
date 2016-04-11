package com.ai.paas.ipaas.auth.service.dto;

import java.io.Serializable;

public class ConfigInfo implements Serializable {

	private static final long serialVersionUID = -1834562253426156211L;

	private String userName;

    private String configAddr;

    private String configUser;

    private String configPwd;


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

    public String getConfigPwd() {
        return configPwd;
    }

    public void setConfigPwd(String configPwd) {
        this.configPwd = configPwd;
    }


    @Override
    public String toString() {
        return "ConfigInfo{" +
                "userName='" + userName + '\'' +
                ", configAddr='" + configAddr + '\'' +
                ", configUser='" + configUser + '\'' +
                ", configPwd='" + configPwd + '\'' +
                '}';
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
