package com.zn.xsx.maven.design.builder;

import java.util.ArrayList;
import java.util.List;
/**
 * 建造者模式：
 * 与动态工厂的区别为，工厂生产单个对象，建造者可以批量生产对象
 * <li>提供批量生成对象的功能
 * @author xsx
 * @date 2016年2月3日
 */
public class InstanceBuilder {
	/**
	 * 存放生产出来的对象
	 */
	private List<Object> list = new ArrayList<Object>();
	
	/**
	 * 获取对象实例集合
	 * @param count 需要生产的数量
	 * @param className 需要生产的对象类名称
	 * @return 返回对象集合
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public List<Object> getInstances(int count, String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		if(count == 0){
			return this.list;
		}
		for (int i = 0; i < count; i++) {
			this.list.add(Class.forName(className).newInstance());
		}
		return this.list;
	}
}
