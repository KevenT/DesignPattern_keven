package com.keven.dp.state;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����2:57:24 
* ˵�� :
*/
public class State {

	private String state;
	
	public State(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void method1(){
		System.out.println("This method is one opt");
	}
	
	public void method2(){
		System.out.println("This method is second opt");
	}
	
}
