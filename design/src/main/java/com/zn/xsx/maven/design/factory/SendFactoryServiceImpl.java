package com.zn.xsx.maven.design.factory;

/**
 * 动态工厂模式：
 * 生产接口工厂的接口的实现 
 * <li>完成获取对象的功能
 * @author xsx
 * @date 2016年2月3日
 */
public class SendFactoryServiceImpl implements SendFactoryService {

	public SendService getSendServiceInstance(String className) {
		SendService sendService = null;
		try {
			sendService = (SendService) Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sendService;
	}

}
