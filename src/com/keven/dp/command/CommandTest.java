package com.keven.dp.command;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����1:57:22 
* ˵�� :
* ���������������ݣ�������ʿ�������ʿ��ȥִ�С�������̺��ڣ������໥���
* �κ�һ��������ȥ���������ˣ�ֻ��Ҫ�����Լ����¶����У�˾��ԱҪ���ǽ����
* ����ȥ��ע����ʿ������ôʵ�ֵġ�
*/
public class CommandTest {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		
		Command command = new MyCommand(receiver);
		Invoker invoker = new Invoker(command);
		
		invoker.action();

	}

}
