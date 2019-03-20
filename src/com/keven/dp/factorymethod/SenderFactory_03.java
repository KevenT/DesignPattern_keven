package com.keven.dp.factorymethod;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����10:34:53 
* ˵�� :
*/
public class SenderFactory_03 {
	public static Sender produceMail() {
		return new MailSender();
	}
	public static Sender produceSms(){
		return new SmsSender();
	}
}
