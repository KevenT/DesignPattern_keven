package com.keven.dp.memento;

import java.time.chrono.ThaiBuddhistEra;

/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����2:26:33 
* ˵�� :
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
