package com.keven.dp.abstractfactory;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����10:41:47 
* ˵�� :
*/
public class MailSender implements Sender{

	@Override
	public void send(){
		System.out.println("This is mail sender!");
	}
	

}
