package com.keven.dp.adapter_1inteface;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����2:51:30 
* ˵�� :����������
* ������ģʽ��ĳ����Ľӿ�ת���ɿͻ�����������һ���ӿڱ�ʾ��Ŀ�����������ڽӿڲ�ƥ������ɵļ��������⡣
* ��Ҫ��Ϊ���ࣺ���������ģʽ�������������ģʽ���ӿڵ�������ģʽ��
*/
public class InterfaceAdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sourceable ss1 = new SourceSub1();
		Sourceable ss2 = new SourceSub2();
		ss1.method1();
		ss1.method2();
		ss2.method1();
		ss2.method2();

	}

}
