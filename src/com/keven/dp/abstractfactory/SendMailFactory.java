package com.keven.dp.abstractfactory;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����10:47:35 
* ˵�� :
*/
public class SendMailFactory implements Provider{
	
	@Override
	public Sender produce(){
		return new MailSender();
	}
}
