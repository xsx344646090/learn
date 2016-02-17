package com.zn.xsx.maven.design.decorator;
/**
 * 装饰模式：
 * 另一个被装饰类
 * <li>实现接口的功能
 * @author xsx
 * @date 2016年2月4日
 */
public class SourceOther implements SourceInterface {

	public void method() {
		System.out.println("this is method of sourceother!");
	}

}
