package com.keven.dp.prototype;

import java.io.IOException;

/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午1:19:57 
* 说明 :原型模式
* 将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
*/
public class WeakCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Prototype prototype = new Prototype(12,"kk");
		Student student = new Student(13, "ww", prototype);
		Student stuClone = (Student)student.clone();
		
		System.out.println("original student age ----"+student.getAge());
		System.out.println("original student p -----"+student.getPrototype().getAge());
		System.out.println("clone stu age-====="+stuClone.getAge());
		System.out.println("clone stu p ======="+ stuClone.getPrototype().getAge());

		stuClone.getPrototype().setAge(22);
		stuClone.setAge(11);
		
		System.out.println("WeakCloneTest update original student age ----"+student.getAge());
		System.out.println("WeakCloneTest update original student p -----"+student.getPrototype().getAge());
		System.out.println("WeakCloneTest update clone stu age-====="+stuClone.getAge());
		System.out.println("WeakCloneTest update clone stu p ======="+ stuClone.getPrototype().getAge());

	}

}
