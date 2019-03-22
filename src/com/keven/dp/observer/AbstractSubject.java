package com.keven.dp.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject{
	private Vector<Observer> vector = new Vector<Observer>();
	@Override
	public void add(Observer observer){
		if (vector.contains(observer)) {
			System.out.println("已经添加了，无序重复添加");
		}else{
			vector.add(observer);
		}
	}
	
	@Override
	public void del(Observer observer){
		if (vector.contains(observer)) {
			vector.remove(observer);
		}else{
			System.out.println("已经不在列表中了，无序重复删除");
		}
	}
	
	@Override
	public void notifyObservers(){
		Enumeration<Observer> enumeration = vector.elements();
		while(enumeration.hasMoreElements()){
			enumeration.nextElement().update();
		}
	}

//	@Override
//	public void operation() {
//	}
	

}
