package com.keven.dp.abstractfactory;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 上午10:51:42 
* 说明 :
*/
public class AbstractFacotyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Provider provider = new SendMailFactory();
		provider.produce().send();

	}

}
