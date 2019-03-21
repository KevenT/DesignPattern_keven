package com.keven.dp.observer;

public class ObserverTest {

	public static void main(String[] args) {
		Subject subject = new MySubject();
		subject.add(new ObserverSub1());
		subject.add(new ObserverSub2());
		subject.operation();

	}

}
