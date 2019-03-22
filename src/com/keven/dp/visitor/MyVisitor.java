package com.keven.dp.visitor;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午3:35:06 
* 说明 :
*/
public class MyVisitor implements Visitor{

	@Override
	public void visit(Subject subject) {
		System.out.println("----"+subject.getSubject());
	}

}
