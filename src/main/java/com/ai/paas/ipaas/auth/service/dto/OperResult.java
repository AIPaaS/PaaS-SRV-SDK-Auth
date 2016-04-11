package com.ai.paas.ipaas.auth.service.dto;


import java.io.Serializable;

public class OperResult implements Serializable {
	private static final long serialVersionUID = 7605962371741541169L;
	private String resultCode;
    private String resultMessage;
    private Object data;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
