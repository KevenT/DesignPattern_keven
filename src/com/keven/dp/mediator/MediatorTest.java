package com.keven.dp.mediator;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����4:18:32 
* ˵�� :
* ��������֮�����ϵ�
*/
public class MediatorTest {
	
	public static void main(String[] args){
		Mediator mediator = new MyMediator();
		mediator.craeteMediator();
		mediator.workAll();
	}

}
