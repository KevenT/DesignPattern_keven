package com.keven.dp.prototype;

import java.io.IOException;

/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午1:19:57 
* 说明 :原型模式
* 将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
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
