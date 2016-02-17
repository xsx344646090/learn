package com.zn.xsx.maven.design.adapter;
/**
 * 接口适配器模式：
 * 接口适配器子类
 * <li>覆写需要的方法
 * @author xsx
 * @date 2016年2月3日
 */
public class InterfaceAdapterImpl extends InterfaceAdapter {
	
	public void method(){
		System.out.println("this is implements method！");
	}
}
