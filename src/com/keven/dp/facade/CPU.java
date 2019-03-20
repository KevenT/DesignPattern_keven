package com.keven.dp.facade;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午4:45:34 
* 说明 :
*/
public class CPU implements BaseFuntion {

	@Override
	public void startUp() {
		// TODO Auto-generated method stub
		System.out.println("cpu startup!");

	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub
		System.out.println("cpu shutdown!");
	}

}
