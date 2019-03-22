package com.keven.dp.command;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午1:55:50 
* 说明 :
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
