package com.keven.dp.command;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����1:55:50 
* ˵�� :
*/
public class Invoker {
	
	private Command command;
	
	public Invoker(Command command) {
		this.command = command;
	}
	
	public void action(){
		command.exe();
	}

}
