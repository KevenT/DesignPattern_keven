package com.keven.dp.command;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午1:53:34 
* 说明 :
*/
public class MyCommand implements Command{

	private Receiver receiver;
	
	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void exe(){
		receiver.action();
	}
}
