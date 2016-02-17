package com.zn.xsx.maven.design.proxy;
/**
 * 动态代理模式：
 * 需要被代理的类
 * <li>实现接口中的方法
 * @author xsx
 * @date 2016年2月4日
 */
public class Source implements SourceInterface {

	public void method() {
		System.out.println("this is method of source!");
	}

}
