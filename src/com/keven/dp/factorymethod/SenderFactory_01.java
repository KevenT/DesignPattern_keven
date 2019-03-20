package com.keven.dp.factorymethod;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����10:17:58 
* ˵�� :
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
