package com.keven.dp.factorymethod;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����10:21:46 
* ˵�� :
*/
public class FactoryTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SenderFactory_01  senderFactor_01 = new SenderFactory_01();
		Sender sender = senderFactor_01.produce("sms");
		sender.send();

	}

}
