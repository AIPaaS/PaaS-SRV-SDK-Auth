package com.ai.paas.ipaas.auth.dao.mapper.bo;

import java.sql.Timestamp;

public class AuthCenter {
    private Long authId;

    private String authPid;

    private String authPassword;

    private String authSource;

    private String authUserId;

    private String authUserName;

    private String authParam;

    private String authState;

    private Timestamp authRegisterTime;

    private Timestamp authActiveTime;

    private Timestamp authCancelTime;

    public Long getAuthId() {
        return authId;
    }

    public void setAuthId(Long authId) {
        this.authId = authId;
    }

    public String getAuthPid() {
        return authPid;
    }

    public void setAuthPid(String authPid) {
        this.authPid = authPid == null ? null : authPid.trim();
    }

    public String getAuthPassword() {
        return authPassword;
    }

    public void setAuthPassword(String authPassword) {
        this.authPassword = authPassword == null ? null : authPassword.trim();
    }

    public String getAuthSource() {
        return authSource;
    }

    public void setAuthSource(String authSource) {
        this.authSource = authSource == null ? null : authSource.trim();
    }

    public String getAuthUserId() {
        return authUserId;
    }

    public void setAuthUserId(String authUserId) {
        this.authUserId = authUserId == null ? null : authUserId.trim();
    }

    public String getAuthUserName() {
        return authUserName;
    }

    public void setAuthUserName(String authUserName) {
        this.authUserName = authUserName == null ? null : authUserName.trim();
    }

    public String getAuthParam() {
        return authParam;
    }

    public void setAuthParam(String authParam) {
        this.authParam = authParam == null ? null : authParam.trim();
    }

    public String getAuthState() {
        return authState;
    }

    public void setAuthState(String authState) {
        this.authState = authState == null ? null : authState.trim();
    }

    public Timestamp getAuthRegisterTime() {
        return authRegisterTime;
    }

    public void setAuthRegisterTime(Timestamp authRegisterTime) {
        this.authRegisterTime = authRegisterTime;
    }

    public Timestamp getAuthActiveTime() {
        return authActiveTime;
    }

    public void setAuthActiveTime(Timestamp authActiveTime) {
        this.authActiveTime = authActiveTime;
    }

    public Timestamp getAuthCancelTime() {
        return authCancelTime;
    }

    public void setAuthCancelTime(Timestamp authCancelTime) {
        this.authCancelTime = authCancelTime;
    }
}