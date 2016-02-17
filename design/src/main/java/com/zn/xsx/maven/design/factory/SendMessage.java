package com.zn.xsx.maven.design.factory;

/**
 * 待生产的接口的具体实现
 * <li>发送短信
 * @author xsx
 * @date 2016年2月3日
 */
public class SendMessage implements SendService {

	public void send() {
		System.out.println("send message success!");
	}
}
