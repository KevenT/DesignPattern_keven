package com.keven.dp.interpreter;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����4:37:06 
* ˵�� :
*/
public class Minus implements Expression{

	@Override
	public int interpret(InterpreterContext context) {
		
		return context.getNum1()-context.getNum2();
	}

}
