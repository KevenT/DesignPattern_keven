package com.keven.dp.factorymethod;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 上午10:28:53 
* 说明 :
*/
public class FactoryTest_02 {

	public static void main(String[] args) {
		SenderFactory_02 senderFactory_02 = new SenderFactory_02();
		senderFactory_02.produceMali().send();
		senderFactory_02.produceSms().send();
	}
}
