package com.zn.xsx.maven.design.factory;

import org.junit.Assert;
import org.junit.Test;

import com.zn.xsx.maven.design.factory.SendFactoryByOneMethod;
import com.zn.xsx.maven.design.factory.SendMail;
import com.zn.xsx.maven.design.factory.SendService;

public class SendFactoryByOneMethodTest {

	@Test
	public void testGetSendInstance() {
		SendService send = SendFactoryByOneMethod.getSendInstance("mail");
		send.send();
		Assert.assertEquals(true, send instanceof SendMail);
	}

}
