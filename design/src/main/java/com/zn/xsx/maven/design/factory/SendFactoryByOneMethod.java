package com.zn.xsx.maven.design.factory;

/**
 * 简单工厂模式：
 * 生产接口的工厂
 * <li>根据输入类型生产不同的对象
 * @author xsx
 * @date 2016年2月3日
 */
public class SendFactoryByOneMethod {
	
	/**
	 * 根据对象类型生产对象
	 * @param type 需要生产对象的类型
	 * @return 返回相应的对象
	 */
	public static SendService getSendInstance(String type){
		if("mail".equals(type)){
			return new SendMail();
		}else if ("message".equals(type)) {
			return new SendMessage();
		}else {
			return null;
		}
	}
}
