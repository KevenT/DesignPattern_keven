package com.keven.dp.memento;

import java.time.chrono.ThaiBuddhistEra;

/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午2:26:33 
* 说明 :
*/
public class Memento {
	
	private String value;
	
	public Memento(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}
