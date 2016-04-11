package com.ai.paas.ipaas.auth.service;

import com.ai.paas.ipaas.PaasException;
import com.ai.paas.ipaas.auth.service.dto.AuthDescriptor;
import com.ai.paas.ipaas.auth.service.dto.AuthParam;
import com.ai.paas.ipaas.auth.service.dto.AuthResult;

public interface IAuthCenterSv {
	AuthResult authLogin(AuthDescriptor authDes) throws PaasException;
	AuthResult auth(AuthParam authParam) throws PaasException;
	AuthResult authService(AuthDescriptor authDes) throws PaasException;
}
