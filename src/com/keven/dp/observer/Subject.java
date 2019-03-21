package com.keven.dp.observer;

public interface Subject {
	public void add(Observer observer);
	
	public void del(Observer server);
	
	public void notifyObservers();
	
	public void operation();

}
