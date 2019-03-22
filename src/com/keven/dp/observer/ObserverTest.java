package com.keven.dp.observer;
//Observer 观察者模式：当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系。
public class ObserverTest {

	public static void main(String[] args) {
		Subject subject = new MySubject();
		Observer observer1 = new ObserverSub1();
		Observer observer2 = new ObserverSub2();
		
		subject.add(observer1);
		subject.operation();
		subject.add(observer2);
		subject.add(observer1);
		subject.operation();
		subject.del(observer1);
		subject.operation();

	}

}
