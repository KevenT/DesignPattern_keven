package com.keven.dp.memento;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午2:28:31 
* 说明 :
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
