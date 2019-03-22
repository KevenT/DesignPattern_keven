package com.keven.dp.command;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午1:57:22 
* 说明 :
* 发出口令，口令经过传递，传到了士兵耳朵里，士兵去执行。这个过程好在，三者相互解耦，
* 任何一方都不用去依赖其他人，只需要做好自己的事儿就行，司令员要的是结果，
* 不会去关注到底士兵是怎么实现的。
*/
public class CommandTest {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		
		Command command = new MyCommand(receiver);
		Invoker invoker = new Invoker(command);
		
		invoker.action();

	}

}
