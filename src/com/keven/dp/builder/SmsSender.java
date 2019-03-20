package com.keven.dp.builder;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午12:30:09 
* 说明 :
*/
public class SmsSender implements Sender{
	@Override
	public void send(){
		System.out.println("This is Sms Sender!");
	}
}
