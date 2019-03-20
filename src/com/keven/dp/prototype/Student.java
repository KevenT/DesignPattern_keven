package com.keven.dp.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午12:56:30 
* 说明 :
*/
public class Student implements Cloneable , Serializable{
	
	private Integer age;
	private String name;
	private Prototype prototype;
	
	public Student(Integer age, String name, Prototype prototype) {
		super();
		this.age = age;
		this.name = name;
		this.prototype = prototype;
	}
	
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Prototype getPrototype() {
		return prototype;
	}
	public void setPrototype(Prototype prototype) {
		this.prototype = prototype;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public Object deepClone () throws IOException,ClassNotFoundException{
		/**
		 *  写入当前对象的二进制流
		 */
		ByteArrayOutputStream bos =  new ByteArrayOutputStream();
		ObjectOutputStream oos =  new ObjectOutputStream(bos);
		oos.writeObject( this );
		
		/**
		 * 写出当前对象二进制流
		 */
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
		

	}
	

}
