package com.keven.dp.chainofresponsibility;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����1:23:18 
* ˵�� :
*/
public abstract class AbstractHandler {
	
	private Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	

}
