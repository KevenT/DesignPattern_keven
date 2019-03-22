package com.keven.dp.iterator;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����11:17:58 
* ˵�� :
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
