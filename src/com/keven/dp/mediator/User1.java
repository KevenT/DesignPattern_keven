package com.keven.dp.mediator;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����4:11:06 
* ˵�� :
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
