package com.zn.xsx.maven.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 动态代理模式：
 * 动态代理类
 * <li>提供需代理类的实例对象
 * @author xsx
 * @date 2016年2月4日
 */
public class DynamicProxy implements InvocationHandler{
	/**
	 * 被代理对象
	 */
	private Object object;
	
	/**
	 * 获取被代理对象实例
	 * @param object 被代理对象
	 * @return 返回被代理对象实例
	 */
	public Object getInstance(Object object){
		this.object = object;
		return java.lang.reflect.Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object obj = null;
		try {
			System.out.println("******************** method before ********************");
			obj = method.invoke(object, args);
			System.out.println("******************** method after *********************");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}
