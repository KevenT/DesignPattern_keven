package com.keven.dp.interpreter;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午4:33:54 
* 说明 :
*/
public class InterpreterContext {
	
	private int num1;
	private int num2;
	
	public InterpreterContext(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	

}
