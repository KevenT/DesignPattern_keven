package com.keven.dp.builder;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����12:30:09 
* ˵�� :
*/
public class SmsSender implements Sender{
	@Override
	public void send(){
		System.out.println("This is Sms Sender!");
	}
}
