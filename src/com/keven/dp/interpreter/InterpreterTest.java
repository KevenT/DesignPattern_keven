package com.keven.dp.interpreter;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午4:38:51 
* 说明 :
*/
public class InterpreterTest {

	public static void main(String[] args) {
		InterpreterContext ic1 = new InterpreterContext(4, 5);
		int num1 = new Plus().interpret(ic1);
		System.out.println("4+5="+num1);
		
		InterpreterContext ic2 = new InterpreterContext(num1, 6);
		int num2 = new Minus().interpret(ic2);
		System.out.println("4+5-6="+num2);
		
		

	}

}
