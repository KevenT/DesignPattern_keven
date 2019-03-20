package com.keven.dp.singleton;

import org.omg.CORBA.PRIVATE_MEMBER;

/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 上午11:05:57 
* 说明 :相对较完美的单例
*/
public class Singleton2 {
	
	/*私有化构造方法，防止被实例化 */
	private Singleton2(){
		
	}
	
	
	
	/*用一个内部类来维护单例*/
	private static class SingletoFactory{
		private static Singleton2 instance = new Singleton2();
	}
	
	
	public static Singleton2 getInstance() {
		return SingletoFactory.instance;
	}
	
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve() {
		return getInstance();
	}
	

}
