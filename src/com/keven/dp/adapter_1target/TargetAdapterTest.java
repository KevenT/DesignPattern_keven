package com.keven.dp.adapter_1target;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����2:51:30 
* ˵�� :����������
* ������ģʽ��ĳ����Ľӿ�ת���ɿͻ�����������һ���ӿڱ�ʾ��Ŀ�����������ڽӿڲ�ƥ������ɵļ��������⡣
* ��Ҫ��Ϊ���ࣺ���������ģʽ�������������ģʽ���ӿڵ�������ģʽ��
*/
public class TargetAdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source source = new Source();
		Targetable targetable = new TargetAdapter(source);
		targetable.method1();
		targetable.method2();

	}

}
