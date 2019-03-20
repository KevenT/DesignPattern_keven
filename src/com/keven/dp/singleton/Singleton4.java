package com.keven.dp.singleton;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����12:08:57 
* ˵�� :
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
	
	//����"Ӱ��ʵ��"�İ취Ϊ�������������ͬ������
	public void updateProperties(){
		Singleton4 shadow = new Singleton4();
		properties = shadow.getProperties();
	}
	

}
