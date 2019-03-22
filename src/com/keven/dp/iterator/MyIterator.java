package com.keven.dp.iterator;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 上午11:01:19 
* 说明 :
*/
public class MyIterator implements Iterator{

	private Collection collection;
	private int pos = -1;
	
	
	public MyIterator(Collection collection) {
		this.collection = collection;
	}
	
	@Override
	public Object previous() {
		if (pos>0&& pos<=collection.size()) {
			pos --;
			return collection.get(pos);
		}else{
			System.out.println("没有前者了");
			return null;
		}
		
		
	}
	@Override
	public boolean hasPrevious() {
		if (pos > 0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Object next() {
		if (pos>=-1&& pos<collection.size()-1) {
			pos ++;
			return collection.get(pos);
		}else{
			System.out.println("没有后者了");
			return null;
		}
	}

	@Override
	public boolean hasNext() {
		if (pos >=-1 && pos<collection.size()-1) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		pos = 0;
		if (collection.size()>0) {
			return collection.get(0);
		}else{
			System.out.println("空集合没有第一个");
			return null;
		}
	}

}
