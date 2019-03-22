package com.keven.dp.visitor;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午3:29:12 
* 说明 :
*/
public interface Subject {

	public void acceptVisitor(Visitor visitor);
	public String getSubject();
}
