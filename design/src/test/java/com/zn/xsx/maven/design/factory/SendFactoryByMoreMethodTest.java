package com.zn.xsx.maven.design.factory;


import org.junit.Assert;
import org.junit.Test;

import com.zn.xsx.maven.design.factory.SendFactoryByMoreMethod;
import com.zn.xsx.maven.design.factory.SendMail;
import com.zn.xsx.maven.design.factory.SendMessage;
import com.zn.xsx.maven.design.factory.SendService;

public class SendFactoryByMoreMethodTest {

	@Test
	public void testGetSendMailInstance() {
		 SendService send = SendFactoryByMoreMethod.getSendMailInstance();
		 send.send();
		 Assert.assertEquals(true, send instanceof SendMail);
	}

	@Test
	public void testGetSendMessageInstance() {
		SendService send = SendFactoryByMoreMethod.getSendMessageInstance();
		send.send();
		Assert.assertEquals(true, send instanceof SendMessage);
	}

}
