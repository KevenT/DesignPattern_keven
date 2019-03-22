package com.keven.dp.mediator;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午4:08:16 
* 说明 :
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
