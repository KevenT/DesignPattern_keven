package com.keven.dp.iterator;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 上午11:17:58 
* 说明 :
*/
public class IteratorTest {

	public static void main(String[] args) {
		Collection collection = new Mycollection();
		Iterator iterator = collection.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next()+"  ");
		}
		
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous()+"  ");
			
		}
		

	}

}
