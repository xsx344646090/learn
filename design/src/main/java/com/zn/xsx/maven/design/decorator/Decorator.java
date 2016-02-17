package com.zn.xsx.maven.design.decorator;
/**
 * 装饰模式：
 * 装饰类
 * <li>动态扩展被装饰类的功能
 * <li>与对象适配器模式类似，都是进行功能扩展
 * <li>对象适配器模式：以新方法进行扩展
 * <li>装饰模式：在被装饰类方法基础上进行扩展
 * @author xsx
 * @date 2016年2月4日
 */
public class Decorator implements SourceInterface {
	/**
	 * 被装饰接口
	 */
	private SourceInterface source;
	
	public Decorator(SourceInterface source){
		this.source = source;
	}
	
	/**
	 * 动态扩展被装饰类的功能
	 */
	public void method() {
		System.out.println("before method of "+this.source.getClass().getName()+"!");
		this.source.method();
		System.out.println("after method of "+this.source.getClass().getName()+"!");
	}

}
