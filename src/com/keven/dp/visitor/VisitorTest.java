package com.keven.dp.visitor;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����3:33:35 
* ˵�� :
* ���������ݽṹ����ȶ��㷨���ױ仯��ϵͳ����Ϊ������ģʽʹ���㷨����
* ���ӱ�����ס���ϵͳ���ݽṹ�������ڱ仯���������µ����ݶ������ӽ�����
* ���ʺ�ʹ�÷�����ģʽ��������ģʽ���ŵ������Ӳ��������ף���Ϊ���Ӳ�
* ����ζ�������µķ����ߡ�������ģʽ���й���Ϊ���е�һ�������߶����У�
* ��ı䲻Ӱ��ϵͳ���ݽṹ����ȱ����������µ����ݽṹ�����ѡ�
*/
public class VisitorTest {

	public static void main(String[] args) {
		Subject subject = new RealSubject();
		
		Visitor visitor = new MyVisitor();
		
		subject.acceptVisitor(visitor);
	}

}
