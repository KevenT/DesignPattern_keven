package com.keven.dp.chainofresponsibility;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午1:23:18 
* 说明 :
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
