package com.keven.dp.abstractfactory;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 上午10:41:47 
* 说明 :
*/
public class MailSender implements Sender{

	@Override
	public void send(){
		System.out.println("This is mail sender!");
	}
	

}
