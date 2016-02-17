package com.zn.xsx.maven.design.adapter;
/**
 * 适配器模式：
 * 扩展接口
 * <li>需要兼容原类中的方法，并扩展
 * @author xsx
 * @date 2016年2月3日
 */
public interface Targetable {
	/**
	 * 原类中的方法
	 */
	public void method();
	
	/**
	 * 扩展的方法
	 */
	public void method2();
}
