package com.zn.xsx.maven.design.factory;

/**
 * 简单工厂模式：
 * 生产接口的工厂
 * <li>根据不同方法生产不同的对象
 * @author xsx
 * @date 2016年2月3日
 */
public class SendFactoryByMoreMethod {
	
	/**
	 * 生产发送邮件的对象
	 * @return 返回发送邮件的对象
	 */
	public static SendService getSendMailInstance(){
		return new SendMail();
	}
	
	/**
	 * 生产发送短信的对象
	 * @return 返回发送短信的对象
	 */
	public static SendService getSendMessageInstance(){
		return new SendMessage();
	}
}
