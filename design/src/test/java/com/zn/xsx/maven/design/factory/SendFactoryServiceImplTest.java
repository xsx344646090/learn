package com.zn.xsx.maven.design.factory;


import org.junit.Assert;
import org.junit.Test;

import com.zn.xsx.maven.design.factory.SendFactoryService;
import com.zn.xsx.maven.design.factory.SendFactoryServiceImpl;
import com.zn.xsx.maven.design.factory.SendMail;
import com.zn.xsx.maven.design.factory.SendService;

public class SendFactoryServiceImplTest {

	@Test
	public void testGetSendServiceInstance() {
		SendFactoryService sendFactoryService = new SendFactoryServiceImpl();
		SendService sendService = sendFactoryService.getSendServiceInstance(SendMail.class.getName());
		sendService.send();
		Assert.assertEquals(true, sendService instanceof SendMail);
	}

}
