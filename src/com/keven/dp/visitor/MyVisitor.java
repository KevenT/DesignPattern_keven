package com.keven.dp.visitor;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����3:35:06 
* ˵�� :
*/
public class MyVisitor implements Visitor{

	@Override
	public void visit(Subject subject) {
		System.out.println("----"+subject.getSubject());
	}

}
