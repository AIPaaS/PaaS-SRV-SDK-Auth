//package com.ai.paas.ipaas.testauth;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.ai.paas.ipaas.auth.service.IAuthCenterSv;
//import com.ai.paas.ipaas.auth.service.dto.AuthDescriptor;
//import com.ai.paas.ipaas.auth.service.dto.AuthResult;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:context/config-client-consumer.xml", "classpath:context/applicationContext-mybatis.xml"})
//public class AuthCenterTest {
//
//    private static transient final Logger logger = LoggerFactory.getLogger(AuthCenterTest.class);
//
//    @Autowired
//    private IAuthCenterSv authCenterSv;
//
//
//    @Autowired
//    private SqlSessionTemplate sqlSessionTemplate;
//
//    @Test
//    public void testCreateUserNode() throws Exception {
//    	AuthDescriptor ad = new AuthDescriptor();
//    	ad.setAuthSource("SDK");
//    	ad.setAuthUserId("1234|5678");
//    	ad.setPassword("123");
//    	AuthResult ar = authCenterSv.auth(ad);
//    	logger.info(ar.getConfigAddr());
//    	System.out.println(ar.getConfigPasswd());
//    	System.out.println(ar.getConfigUser());
//    	System.out.println(ar.getUserId());
//    	
//    }
//    
//
//
//}