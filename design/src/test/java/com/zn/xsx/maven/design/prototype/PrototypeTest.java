package com.zn.xsx.maven.design.prototype;


import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class PrototypeTest {

	@Test
	public void testClone() {
		Prototype prototype = new Prototype();
		prototype.setCount(11);
		prototype.setObject(new SerializableObject());
		try {
			Prototype prototype2 = (Prototype) prototype.clone();
			System.out.println("prototype.count = " + prototype.getCount());
			System.out.println("prototype.object = " + prototype.getObject());
			System.out.println("********************************************************************");
			System.out.println("prototype2.count = " + prototype2.getCount());
			System.out.println("prototype2.object = " + prototype2.getObject());
			Assert.assertEquals(true, prototype.getObject() == prototype2.getObject());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testDeepClone() {
		Prototype prototype = new Prototype();
		prototype.setCount(11);
		prototype.setObject(new SerializableObject());
		try {
			Prototype prototype2 = (Prototype) prototype.deepClone();
			System.out.println("prototype.count = "+ prototype.getCount());
			System.out.println("prototype.object = "+ prototype.getObject());
			System.out.println("********************************************************************");
			System.out.println("prototype2.count = " + prototype2.getCount());
			System.out.println("prototype2.object = " + prototype2.getObject() + "\n");
			Assert.assertEquals(false, prototype.getObject() == prototype2.getObject());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
