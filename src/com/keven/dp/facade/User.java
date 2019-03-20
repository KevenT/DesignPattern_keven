package com.keven.dp.facade;



/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午4:52:22 
* 说明 :为了解决类与类之家的依赖关系的，像spring一样，可以将类和类之间的关系配置到配置文件中，而外观模式就是将他们的关系放在一个Facade类中，降低了类类之间的耦合度，该模式中没有涉及到接口
*/
public class User {
	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.startup();
		computer.shutDown();
	}

}
