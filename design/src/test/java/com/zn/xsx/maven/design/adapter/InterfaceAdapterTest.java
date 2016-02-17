package com.zn.xsx.maven.design.adapter;

import org.junit.Test;

public class InterfaceAdapterTest {

	@Test
	public void testMethod() {
		InterfaceAdapter interfaceAdapter1 = new InterfaceAdapterImpl();
		InterfaceAdapter interfaceAdapter2 = new InterfaceAdapterImplOther();
		interfaceAdapter1.method();
		System.out.println("*******************************************");
		interfaceAdapter2.method();
	}

	@Test
	public void testMethod2() {
		InterfaceAdapter interfaceAdapter1 = new InterfaceAdapterImpl();
		InterfaceAdapter interfaceAdapter2 = new InterfaceAdapterImplOther();
		interfaceAdapter1.method2();
		System.out.println("*******************************************");
		interfaceAdapter2.method2();
	}

}
