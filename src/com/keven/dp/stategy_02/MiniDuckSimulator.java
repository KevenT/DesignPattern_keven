package com.keven.dp.stategy_02;
/** 
 * @author Keven  Email:tv2014@126.com
 * @version 创建时间：2019-3-19 下午4:46:39 
 * 说明 :
 */
public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MallardDuck mallardDuck = new MallardDuck();
//		ModelDuck modelDuck = new ModelDuck();
//		
//		mallardDuck.performQuack();
//		mallardDuck.performFly();
//		mallardDuck.display();
//		
//		modelDuck.performQuack();
//		modelDuck.performFly();
//		modelDuck.setFlyBehavior(new FlyRockerPowered());
//		modelDuck.performFly();
//		modelDuck.display();
		
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.display();
		
		Duck model = new ModelDuck();
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRockerPowered());
		model.performFly();
		model.display();
		
		
		
		

	}

}
