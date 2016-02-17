package com.zn.xsx.maven.design.proxy;

import org.junit.Test;

public class StaticProxyTest {

	@Test
	public void testMethod() {
		SourceInterface sourceInterface = new StaticProxy();
		sourceInterface.method();
	}

}
