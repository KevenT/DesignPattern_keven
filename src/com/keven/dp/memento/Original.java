package com.keven.dp.memento;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����2:30:19 
* ˵�� :
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
