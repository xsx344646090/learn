package com.zn.xsx.maven.design.singleton;

/**
 * 单例模式：
 * 用于只需产生一个对象情况
 * <li>提供一个获取对象的方法
 * @author xsx
 * @date 2016年2月3日
 */
public class Sigle {
	
	/**
	 * 对象实例
	 */
	private static Sigle instance = null;
	
	/**
	 * 构造方法私有化
	 */
	private Sigle(){}
	
	/**
	 * 对象实例化
	 * <li>进行同步操作 ，防止程序出错
	 */
	private static synchronized void init(){
		if(instance == null){
			instance = new Sigle();
		}
	}
	
	/**
	 * 获取对象实例
	 * @return 返回对象实例
	 */
	public static Sigle getInstance(){
		if(instance == null){
			init();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		
	}
}
