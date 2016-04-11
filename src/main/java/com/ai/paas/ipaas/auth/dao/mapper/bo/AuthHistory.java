package com.ai.paas.ipaas.auth.dao.mapper.bo;

import java.sql.Timestamp;

public class AuthHistory {
    private Integer id;

    private String authPid;

    private String authServiceid;

    private Timestamp authDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthPid() {
        return authPid;
    }

    public void setAuthPid(String authPid) {
        this.authPid = authPid == null ? null : authPid.trim();
    }

    public String getAuthServiceid() {
        return authServiceid;
    }

    public void setAuthServiceid(String authServiceid) {
        this.authServiceid = authServiceid == null ? null : authServiceid.trim();
    }

    public Timestamp getAuthDate() {
        return authDate;
    }

    public void setAuthDate(Timestamp authDate) {
        this.authDate = authDate;
    }
}