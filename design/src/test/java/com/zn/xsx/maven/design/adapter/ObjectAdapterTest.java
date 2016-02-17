package com.zn.xsx.maven.design.adapter;

import org.junit.Test;

public class ObjectAdapterTest {

	@Test
	public void testMethod() {
		Targetable targetable = new ObjectAdapter();
		targetable.method();
	}

	@Test
	public void testMethod2() {
		Targetable targetable = new ObjectAdapter();
		targetable.method2();
	}

}
