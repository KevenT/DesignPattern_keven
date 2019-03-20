package com.keven.dp.factorymethod;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 上午10:21:46 
* 说明 :
*/
public class FactoryTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SenderFactory_01  senderFactor_01 = new SenderFactory_01();
		Sender sender = senderFactor_01.produce("sms");
		sender.send();

	}

}
