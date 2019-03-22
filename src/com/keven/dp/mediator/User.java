package com.keven.dp.mediator;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����4:08:16 
* ˵�� :
*/
public abstract class User {
	
	private Mediator mediator;
	
	public User(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	abstract void work();
}
