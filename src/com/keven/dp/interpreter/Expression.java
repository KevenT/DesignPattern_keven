package com.keven.dp.interpreter;

import com.keven.dp.state.Context;

/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����4:32:53 
* ˵�� :
*/
public interface Expression {
	int interpret(InterpreterContext context);
}
