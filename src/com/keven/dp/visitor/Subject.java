package com.keven.dp.visitor;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����3:29:12 
* ˵�� :
*/
public interface Subject {

	public void acceptVisitor(Visitor visitor);
	public String getSubject();
}
