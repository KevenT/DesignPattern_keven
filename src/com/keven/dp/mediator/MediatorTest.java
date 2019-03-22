package com.keven.dp.mediator;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午4:18:32 
* 说明 :
* 降低类类之间的耦合的
*/
public class MediatorTest {
	
	public static void main(String[] args){
		Mediator mediator = new MyMediator();
		mediator.craeteMediator();
		mediator.workAll();
	}

}
