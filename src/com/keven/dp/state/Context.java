package com.keven.dp.state;

import org.w3c.dom.css.ElementCSSInlineStyle;

/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午3:00:17 
* 说明 :
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
