package com.zn.xsx.maven.design.factory;

/**
 * 生产接口工厂的接口
 * <li>提供根据类名称获取对象实例的功能
 * @author xsx
 * @date 2016年2月3日
 */
public interface SendFactoryService {
	
	/**
	 * 根据类名称获取相应对象
	 * @param className 需要生产的对象类名称
	 * @return 返回相应对象
	 */
	public SendService getSendServiceInstance(String className);
}
