package com.keven.dp.iterator;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 上午10:58:46 
* 说明 :
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
			System.out.println("越界了哦");
			return null;
		}
	}

	@Override
	public int size() {
		return string.length;
	}

}
