package com.keven.dp.factorymethod;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 上午10:36:49 
* 说明 :
*/
public class FactoryTest_03 {

	public static void main(String[] args){
		SenderFactory_03.produceMail().send();
		SenderFactory_03.produceSms().send();
		
	}

}
