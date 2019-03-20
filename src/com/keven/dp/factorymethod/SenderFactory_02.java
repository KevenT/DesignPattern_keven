package com.keven.dp.factorymethod;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 上午10:25:59 
* 说明 :
*/
public class SenderFactory_02 {
	public Sender produceMali() {
		return new MailSender();
	}
	
	public Sender produceSms() {
		return new SmsSender();
	}

}
