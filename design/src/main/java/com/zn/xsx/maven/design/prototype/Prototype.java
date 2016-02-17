package com.zn.xsx.maven.design.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式：
 * 用于对象的克隆，产生新对象
 * <li>提供浅复制功能：只复制基本数据类型，引用数据类型在原对象中
 * <li>提供深复制功能：复制基本数据类型及引用数据类型
 * @author xsx
 * @date 2016年2月3日
 */
public class Prototype implements Cloneable, Serializable{

	private static final long serialVersionUID = -2962009956939967782L;
	
	/**
	 * 基本数据类型
	 */
	private int count;
	
	/**
	 * 引用数据类型
	 */
	private SerializableObject object;
	
	/**
	 * 浅度复制对象(不包括引用类型)
	 */
	public Object clone() throws CloneNotSupportedException{
			Prototype prototype = (Prototype) super.clone();
			return prototype;
	}
	
	/**
	 * 深度复制对象(包括引用类型)
	 * @return 返回复制对象
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object deepClone() throws IOException, ClassNotFoundException{
		/**
		 * 将对象写入二进制流中
		 */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		/**
		 * 从二进制流中读取对象并返回
		 */
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public SerializableObject getObject() {
		return object;
	}

	public void setObject(SerializableObject object) {
		this.object = object;
	}
}
