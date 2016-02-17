package com.zn.xsx.maven.design.adapter;
/**
 * 类适配器模式：
 * 适配器类
 * <li>继承原类并实现目标接口
 * @author xsx
 * @date 2016年2月3日
 */
public class ClassAdapter extends Source implements Targetable {

	public void method2() {
		System.out.println("this is new method!");
	}

}
