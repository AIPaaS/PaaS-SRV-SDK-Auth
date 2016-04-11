package com.ai.paas.ipaas.testauth;

public class Test {

	public static void main(String[] args) {
		System.out.println("1234|5678".split("\\|")[0]);
		boolean successed1 =Boolean.valueOf("");
		boolean successed11 =Boolean.valueOf("11");
		boolean successed13 =Boolean.valueOf("false");
		boolean successed24 =Boolean.valueOf("true");
		System.out.println(successed1);
		System.out.println(successed11);
		System.out.println(successed13);
		System.out.println(successed24);
	}

}
