package com.keven.dp.iterator;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����10:51:42 
* ˵�� :
*/
public interface Iterator {

	public Object previous();
	
	public boolean hasPrevious();
	
	public Object next();
	
	public boolean hasNext();
	
	public Object first();
}
