package com.keven.dp.abstractfactory;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 上午10:47:35 
* 说明 :
*/
public class SendMailFactory implements Provider{
	
	@Override
	public Sender produce(){
		return new MailSender();
	}
}
