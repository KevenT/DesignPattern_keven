package com.keven.dp.mediator;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午4:11:06 
* 说明 :
*/
public class User1 extends User{
	
	public User1(Mediator mediator) {
		super(mediator);
		
	}

	@Override
	public void work(){
		System.out.println("user1 exe");
	}
	

}
