package com.keven.dp.memento;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����2:28:31 
* ˵�� :
*/
public class Storage {

	private Memento memento;
	
	public Storage(Memento memento) {
		this.memento = memento;
		
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	
	
}
