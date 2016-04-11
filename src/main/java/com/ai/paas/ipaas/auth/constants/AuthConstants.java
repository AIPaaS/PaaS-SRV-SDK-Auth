package com.ai.paas.ipaas.auth.constants;

public class AuthConstants {
	public static final String AUTH_WEB_USER = "WEB";
	public static final String AUTH_SDK_USER = "SDK";
	public static final String SPLITER = "\\|";
	public static final String AUTH_FAILURE_MSG = "username or password is wrong";
	public static final String SYSTEM_ERROR_MSG = "System error...";
	public static final String PARAM_ERROR_MSG = "param error...";
	public static final String SECURITY_KEY = "7331c9b6b1a1d521363f7bca8acb095f";// md5
	public static final String AUTH_STATE_NOT_ACTIVED = "1";
	public static final String AUTH_STATE_ACTIVED = "2";
	/**
	 * 认证返回结果
	 * @author mapl
	 */
	public static class AuthResult{
		public final static String SUCCESS = "000000"; //成功
		public final static String FAIL = "999999"; //失败
	}
}
