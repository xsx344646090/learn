package com.zn.xsx.maven.design.builder;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.zn.xsx.maven.design.factory.SendMail;
import com.zn.xsx.maven.design.factory.SendMessage;

public class InstanceBuilderTest {

	@Test
	public void testGetInstanceMap() {
		InstanceBuilder builder = new InstanceBuilder();
		List<Object> list = null;
		try {
			builder.getInstances(10, SendMail.class.getName());
			list = builder.getInstances(10, SendMessage.class.getName());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Object object : list) {
			try {
				object.getClass().getMethod("send").invoke(object);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Assert.assertEquals(true, list.size()==20);
	}

}
