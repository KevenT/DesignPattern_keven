package com.keven.dp.visitor;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����3:31:59 
* ˵�� :
*/
public class RealSubject implements Subject{

	@Override
	public void acceptVisitor(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		// TODO Auto-generated method stub
		return "love";
	}

}
