package com.zn.xsx.maven.design.proxy;
/**
 * 静态代理模式：
 * 静态代理类
 * <li>提供需代理类的实例对象
 * <li>与动态代理的区别：
 * <li>动态代理：一个类实现所有代理功能
 * <li>静态代理: 一个类对应一个接口
 * @author xsx
 * @date 2016年2月4日
 */
public class StaticProxy implements SourceInterface {
	/**
	 * 需要代理的接口
	 */
	private SourceInterface sourceInterface;
	
	public StaticProxy(){
		this.sourceInterface = new Source();
	}
	
	public void method() {
		System.out.println("******************** method before ********************");
		this.sourceInterface.method();
		System.out.println("******************** method after *********************");
	}

}
