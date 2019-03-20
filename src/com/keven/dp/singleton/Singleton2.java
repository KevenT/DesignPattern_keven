package com.keven.dp.singleton;

import org.omg.CORBA.PRIVATE_MEMBER;

/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����11:05:57 
* ˵�� :��Խ������ĵ���
*/
public class Singleton2 {
	
	/*˽�л����췽������ֹ��ʵ���� */
	private Singleton2(){
		
	}
	
	
	
	/*��һ���ڲ�����ά������*/
	private static class SingletoFactory{
		private static Singleton2 instance = new Singleton2();
	}
	
	
	public static Singleton2 getInstance() {
		return SingletoFactory.instance;
	}
	
	/* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */
	public Object readResolve() {
		return getInstance();
	}
	

}
