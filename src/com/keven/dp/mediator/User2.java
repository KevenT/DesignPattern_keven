package com.keven.dp.mediator;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午4:11:06 
* 说明 :
*/
public class User2 extends User{
	
	public User2(Mediator mediator) {
		super(mediator);
		
	}

	@Override
	public void work(){
		System.out.println("user2 exe");
	}
	

}
