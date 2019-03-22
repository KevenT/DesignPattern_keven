package com.keven.dp.iterator;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����11:01:19 
* ˵�� :
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
			System.out.println("û��ǰ����");
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
			System.out.println("û�к�����");
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
			System.out.println("�ռ���û�е�һ��");
			return null;
		}
	}

}
