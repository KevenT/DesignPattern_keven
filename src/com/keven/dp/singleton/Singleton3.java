package com.keven.dp.singleton;

import java.util.Vector;

/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����11:13:48 
* ˵�� :��Ϊ����ֻ��Ҫ�ڴ������ʱ�����ͬ��������ֻҪ��������getInstance()�ֿ�������Ϊ������synchronized�ؼ��֣�Ҳ�ǿ��Եģ�
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
