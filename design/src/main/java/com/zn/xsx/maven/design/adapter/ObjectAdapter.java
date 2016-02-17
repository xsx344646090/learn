package com.zn.xsx.maven.design.adapter;
/**
 * 对象适配器模式：
 * 对象适配器类
 * <li>持有原类对象，采用对象调用方法的形式
 * @author xsx
 * @date 2016年2月3日
 */
public class ObjectAdapter implements Targetable {
	/**
	 * 原类对象实例
	 */
	private Source source = new Source();
	
	public void method() {
		this.source.method();
	}

	public void method2() {
		System.out.println("this is new method!");
	}

}
