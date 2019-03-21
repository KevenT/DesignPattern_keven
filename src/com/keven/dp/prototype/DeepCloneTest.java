package com.keven.dp.prototype;

import java.io.IOException;

/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����1:19:57 
* ˵�� :ԭ��ģʽ
* ��һ�������ƺ󣬲����ǻ����������ͻ����������ͣ��������´����ġ�����˵��������ƽ�������ȫ���׵ĸ��ƣ���ǳ���Ʋ����ס�
*/
public class DeepCloneTest {

	public static void main(String[] args) throws ClassNotFoundException,IOException {
		// TODO Auto-generated method stub
		
		Prototype prototype = new Prototype(12,"kk");
		Student student = new Student(13, "ww", prototype);
		Student stuClone = (Student)student.deepClone();
		
		System.out.println("original student age ----"+student.getAge());
		System.out.println("original student p -----"+student.getPrototype().getAge());

		System.out.println("clone stu age-====="+stuClone.getAge());
		System.out.println("clone stu p ======="+ stuClone.getPrototype().getAge());
		
		stuClone.getPrototype().setAge(22);
		stuClone.setAge(11);
		
		System.out.println("update original student age ----"+student.getAge());
		System.out.println("update original student p -----"+student.getPrototype().getAge());

		System.out.println("update clone stu age-====="+stuClone.getAge());
		System.out.println("update clone stu p ======="+ stuClone.getPrototype().getAge());
		

	}

}
