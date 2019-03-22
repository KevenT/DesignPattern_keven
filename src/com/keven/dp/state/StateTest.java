package com.keven.dp.state;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午3:03:19 
* 说明 :
* 1、可以通过改变状态来获得不同的行为。2、别人能同时看到你的变化。
*/
public class StateTest {

	public static void main(String[] args) {
		
		State state = new State("state1");
		
		Context context = new Context(state);
		
		context.method();
		
		state.setState("state2");
		
		context.method();

	}

}
