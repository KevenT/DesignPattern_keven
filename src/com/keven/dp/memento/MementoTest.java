package com.keven.dp.memento;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午2:34:10 
* 说明 :备份录模式
* 原始类A，A中有各种属性，A可以决定需要备份的属性，备忘录类B是用来存储A的一些内部状态，
* 类C呢，就是一个用来存储备忘录的，且只能存储，不能修改等操作。“备份-恢复”模式
*/
public class MementoTest {
	
	
	public static void main(String[] args){
		Original original = new Original("apple");
		
		Storage storage = new Storage(original.CreateMemento());
		System.out.println("Original："+original.getValue());
		
		original.setValue("orange");
		
		System.out.println("Edit :"+original.getValue());
		
		original.restoreMementoValue(storage.getMemento());
		
		System.out.println("reStore :"+original.getValue());
		
		
		
		
	}
	
	

}
