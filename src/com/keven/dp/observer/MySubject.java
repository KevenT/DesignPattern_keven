package com.keven.dp.observer;

public class MySubject extends AbstractSubject{
	@Override
	public void operation(){
		System.out.println("update self,notifyObservers");
		notifyObservers();
	}

}
