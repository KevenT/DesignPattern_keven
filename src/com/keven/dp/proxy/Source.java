package com.keven.dp.proxy;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午3:15:55 
* 说明 :
*/
public class Source implements Sourceable{

	@Override
	public void method() {
		System.out.println("This is Original method!");
		
	}

}
