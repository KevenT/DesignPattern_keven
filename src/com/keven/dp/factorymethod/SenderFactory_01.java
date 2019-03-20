package com.keven.dp.factorymethod;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 上午10:17:58 
* 说明 :
*/
public class SenderFactory_01 {
	
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		}else if ("sms".equals(type)) {
			return new SmsSender();
		}else {
			System.out.println("input wrong");
			return null;
		}
	}

}
