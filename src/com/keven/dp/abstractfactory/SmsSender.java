package com.keven.dp.abstractfactory;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����10:44:05 
* ˵�� :
*/
public class SmsSender implements Sender{
	
	@Override
	public void send(){
		System.out.println("this is sms sender");
	}
}
