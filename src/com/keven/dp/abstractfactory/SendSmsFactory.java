package com.keven.dp.abstractfactory;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����10:49:52 
* ˵�� :
*/
public class SendSmsFactory implements Provider{

	@Override
	public Sender produce(){
		return new SmsSender();
	}
}
