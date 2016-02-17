package com.zn.xsx.maven.design.singleton;


import org.junit.Assert;
import org.junit.Test;

public class SigleTest {

	@Test
	public void testGetInstance() {
		Sigle s1 = Sigle.getInstance();
		Sigle s2 = Sigle.getInstance();
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		Assert.assertEquals(true, s1 == s2);
	}

}
