package com.keven.dp.command;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����1:53:34 
* ˵�� :
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
