package com.keven.dp.interpreter;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午4:37:06 
* 说明 :
*/
public class Minus implements Expression{

	@Override
	public int interpret(InterpreterContext context) {
		
		return context.getNum1()-context.getNum2();
	}

}
