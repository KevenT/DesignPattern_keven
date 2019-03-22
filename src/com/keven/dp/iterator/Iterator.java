package com.keven.dp.iterator;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 上午10:51:42 
* 说明 :
*/
public interface Iterator {

	public Object previous();
	
	public boolean hasPrevious();
	
	public Object next();
	
	public boolean hasNext();
	
	public Object first();
}
