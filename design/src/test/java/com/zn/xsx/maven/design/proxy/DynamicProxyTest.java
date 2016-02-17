package com.zn.xsx.maven.design.proxy;

import org.junit.Test;

public class DynamicProxyTest {

	@Test
	public void test() {
		SourceInterface sourceInterface = (SourceInterface) new DynamicProxy().getInstance(new Source());
		sourceInterface.method();
	}
}
