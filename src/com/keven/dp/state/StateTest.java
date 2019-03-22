package com.keven.dp.state;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����3:03:19 
* ˵�� :
* 1������ͨ���ı�״̬����ò�ͬ����Ϊ��2��������ͬʱ������ı仯��
*/
public class StateTest {

	public static void main(String[] args) {
		
		State state = new State("state1");
		
		Context context = new Context(state);
		
		context.method();
		
		state.setState("state2");
		
		context.method();

	}

}
