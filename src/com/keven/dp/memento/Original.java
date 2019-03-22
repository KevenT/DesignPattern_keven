package com.keven.dp.memento;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午2:30:19 
* 说明 :
*/
public class Original {

	private String value;
	
	public Original(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Memento CreateMemento() {
		return new Memento(value);
	}
	
	public void restoreMementoValue(Memento memento){
		value = memento.getValue();
	}
	
}
