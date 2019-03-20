package com.keven.dp.stategy_01;
/** 
 * @author Keven  Email:tv2014@126.com
 * @version 创建时间：2019-3-19 下午4:07:57 
 * 说明 :
 */
public class StategyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expString = "8+4";
		ICalculator calculator = new Plus();
		System.out.print(calculator.calculate(expString));

	}

}
