package com.keven.dp.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午1:02:58 
* 说明 :
*/
public class Prototype implements Cloneable,Serializable{
	
	private Integer age;
	private String name;
	
	
	
	public Prototype(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
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
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public Object deepClone() throws IOException,ClassNotFoundException{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
		
	}
	
	

}
