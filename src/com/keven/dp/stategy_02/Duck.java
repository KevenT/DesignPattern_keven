package com.keven.dp.stategy_02;
/** 
 * @author Keven  Email:tv2014@126.com
 * @version 创建时间：2019-3-19 下午4:25:30 
 * 说明 :
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck(){
		
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	private void swim() {
		System.out.print("All ducks float,even decoys!");
	}

}
