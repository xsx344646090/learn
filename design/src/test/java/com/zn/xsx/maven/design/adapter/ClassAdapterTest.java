package com.zn.xsx.maven.design.adapter;

import org.junit.Test;

public class ClassAdapterTest {

	@Test
	public void testMethod2() {
		Targetable target = new ClassAdapter();
		target.method2();
	}

	@Test
	public void testMethod() {
		Targetable target = new ClassAdapter();
		target.method();
	}

}
