package com.keven.dp.iterator;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����10:58:46 
* ˵�� :
*/
public class Mycollection implements Collection{

	private String [] string = {"a","b","c","d","e"};
	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		if (i<string.length&&i>=0) {
			return string[i];
		}else {
			System.out.println("Խ����Ŷ");
			return null;
		}
	}

	@Override
	public int size() {
		return string.length;
	}

}
