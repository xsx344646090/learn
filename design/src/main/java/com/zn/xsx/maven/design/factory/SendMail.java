package com.zn.xsx.maven.design.factory;

/**
 * 待生产的接口的具体实现
 * <li>发送邮件
 * @author xsx
 * @date 2016年2月3日
 */
public class SendMail implements SendService {

	public void send() {
		System.out.println("send mail success!");
	}
	
	public void getInfo(){
		System.out.println("this is info!");
	}

}
