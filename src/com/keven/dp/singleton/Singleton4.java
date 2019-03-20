package com.keven.dp.singleton;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午12:08:57 
* 说明 :
*/

import java.util.Vector;

public class Singleton4 {
	
	private static Singleton4 instance = null;
	
	private Vector properties = null;
	
	private Singleton4 (){
		
	}
	
	public Vector getProperties() {
		return properties;
	}
	
	private static synchronized void  syncInit() {
		if (instance == null) {
			instance = new Singleton4();
		}
	}
	
	public static Singleton4 getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}
	
	//采用"影子实例"的办法为单例对象的属性同步更新
	public void updateProperties(){
		Singleton4 shadow = new Singleton4();
		properties = shadow.getProperties();
	}
	

}
