package com.keven.dp.factorymethod;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����10:25:59 
* ˵�� :
*/
public class SenderFactory_02 {
	public Sender produceMali() {
		return new MailSender();
	}
	
	public Sender produceSms() {
		return new SmsSender();
	}

}
