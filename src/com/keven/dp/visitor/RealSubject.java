package com.keven.dp.visitor;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午3:31:59 
* 说明 :
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
