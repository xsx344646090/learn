package com.zn.xsx.maven.design.adapter;
/**
 * 接口适配器模式：
 * 接口适配器子类
 * <li>覆写需要的方法
 * @author xsx
 * @date 2016年2月3日
 */
public class InterfaceAdapterImplOther extends InterfaceAdapter {
	
	public void method2(){
		System.out.println("this is other implements method!");
	}
}
