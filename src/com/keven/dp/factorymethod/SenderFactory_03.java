package com.keven.dp.factorymethod;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 上午10:34:53 
* 说明 :
*/
public class SenderFactory_03 {
	public static Sender produceMail() {
		return new MailSender();
	}
	public static Sender produceSms(){
		return new SmsSender();
	}
}
