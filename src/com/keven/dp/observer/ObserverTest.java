package com.keven.dp.observer;
//Observer �۲���ģʽ����һ������仯ʱ�����������ö���Ķ��󶼻��յ�֪ͨ���������ű仯������֮����һ��һ�Զ�Ĺ�ϵ��
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
