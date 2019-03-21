package com.keven.dp.bridge;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月21日 上午11:14:59 
* 说明 :
*/
public class MyBridge extends Bridge{
	public void method() {
		getSourceable().method();
	}
}
