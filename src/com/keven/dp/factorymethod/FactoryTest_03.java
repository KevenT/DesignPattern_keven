package com.keven.dp.factorymethod;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����10:36:49 
* ˵�� :
*/
public class FactoryTest_03 {

	public static void main(String[] args){
		SenderFactory_03.produceMail().send();
		SenderFactory_03.produceSms().send();
		
	}

}
