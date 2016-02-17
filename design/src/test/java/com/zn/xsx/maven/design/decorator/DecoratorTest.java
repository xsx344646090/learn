package com.zn.xsx.maven.design.decorator;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void testMethod() {
		SourceInterface sourceInterface = new Source();
		SourceInterface sourceInterface2 = new Decorator(new Source());
		SourceInterface sourceInterface3 = new SourceOther();
		SourceInterface sourceInterface4 = new Decorator(new SourceOther());
		sourceInterface.method();
		System.out.println("**********************************************");
		sourceInterface2.method();
		
		System.out.println();
		
		sourceInterface3.method();
		System.out.println("**********************************************");
		sourceInterface4.method();
	}

}
