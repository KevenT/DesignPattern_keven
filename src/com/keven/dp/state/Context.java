package com.keven.dp.state;

import org.w3c.dom.css.ElementCSSInlineStyle;

/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����3:00:17 
* ˵�� :
*/
public class Context {

	private State state;
	
	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void method(){
		if ("state1".equals(state.getState())) {
			state.method1();
		}else if ("state2".equals(state.getState())) {
			state.method2();
		}
	}
	
}
