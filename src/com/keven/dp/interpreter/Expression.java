package com.keven.dp.interpreter;

import com.keven.dp.state.Context;

/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午4:32:53 
* 说明 :
*/
public interface Expression {
	int interpret(InterpreterContext context);
}
