package com.keven.dp.chainofresponsibility;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����1:33:12 
* ˵�� :
* �ж������ÿ��������ж���һ����������ã������ͻ��γ�һ�������������������ϴ��ݣ�
* ֱ��ĳһ���������������󡣵��Ƿ����߲���������������Ǹ�����ᴦ�������
* ���ԣ�������ģʽ����ʵ�֣��������ͻ��˵�����£���ϵͳ���ж�̬�ĵ�����
* ����ֻ������һ�����󴫸���һ�����󣬶����������������
*/
public class ChainOfResponsibilityTest {

	public static void main(String[] args) {
		
		MyHandler h1 = new MyHandler("a");
		MyHandler h2 = new MyHandler("b");
		MyHandler h3 = new MyHandler("c");
		
		h1.setHandler(h2);
		h2.setHandler(h3);
		
		h1.operator();
		

	}

}
