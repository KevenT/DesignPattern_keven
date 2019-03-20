package com.keven.dp.singleton;

import java.util.Vector;

/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 上午11:13:48 
* 说明 :因为我们只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字，也是可以的：
*/
public class Singleton3 {
	
	private static Singleton3 instance = null;
	
	
	private Singleton3(){
		
	}
	
	
	private static synchronized void syncInit(){
		if (instance == null) {
			instance = new Singleton3();
		}
	}
	
	public static Singleton3 getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}
	

}
