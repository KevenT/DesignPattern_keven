package com.keven.dp.stategy_02;
/** 
 * @author Keven  Email:tv2014@126.com
 * @version 创建时间：2019-3-19 下午4:37:16 
 * 说明 :
 */
public class MallardDuck extends Duck {
	
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
		
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("I`m a real Mallard duck");

	}

}
