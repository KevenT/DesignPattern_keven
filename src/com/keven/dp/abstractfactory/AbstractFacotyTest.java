package com.keven.dp.abstractfactory;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����10:51:42 
* ˵�� :
*/
public class AbstractFacotyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Provider provider = new SendMailFactory();
		provider.produce().send();

	}

}
