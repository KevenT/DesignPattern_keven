package com.keven.dp.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject{
	private Vector<Observer> vector = new Vector<Observer>();
	@Override
	public void add(Observer observer){
		if (vector.contains(observer)) {
			System.out.println("�Ѿ�����ˣ������ظ����");
		}else{
			vector.add(observer);
		}
	}
	
	@Override
	public void del(Observer observer){
		if (vector.contains(observer)) {
			vector.remove(observer);
		}else{
			System.out.println("�Ѿ������б����ˣ������ظ�ɾ��");
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
