package com.keven.dp.memento;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����2:34:10 
* ˵�� :����¼ģʽ
* ԭʼ��A��A���и������ԣ�A���Ծ�����Ҫ���ݵ����ԣ�����¼��B�������洢A��һЩ�ڲ�״̬��
* ��C�أ�����һ�������洢����¼�ģ���ֻ�ܴ洢�������޸ĵȲ�����������-�ָ���ģʽ
*/
public class MementoTest {
	
	
	public static void main(String[] args){
		Original original = new Original("apple");
		
		Storage storage = new Storage(original.CreateMemento());
		System.out.println("Original��"+original.getValue());
		
		original.setValue("orange");
		
		System.out.println("Edit :"+original.getValue());
		
		original.restoreMementoValue(storage.getMemento());
		
		System.out.println("reStore :"+original.getValue());
		
		
		
		
	}
	
	

}
