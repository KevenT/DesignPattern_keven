package com.keven.dp.decorator;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����3:21:24 
* ˵�� :װ��ģʽ����һ����������һЩ�µĹ��ܣ������Ƕ�̬�ģ�Ҫ��װ�ζ���ͱ�װ�ζ���ʵ��ͬһ���ӿڣ�װ�ζ�����б�װ�ζ����ʵ��
*/
public class DecoratorTest {

	public static void main(String[] args) {
		Source source = new Source();
		Sourceable sourceable= new Decorator(source);
		sourceable.method();

	}

}
