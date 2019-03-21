package com.keven.dp.templatemethod;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月21日 下午4:20:37 
* 说明 :
*/
public abstract class TemplateCalculator {
	
	public final int calculator(String exp,String opt){
		int array[] = stringSplit(exp,opt);
		return calculate(array[0], array[1]);
		
	}
	
	

	private int[] stringSplit(String exp, String opt) {
		String array[] = exp.split(opt);
		int arrayInt [] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
	
	public abstract int calculate(int num1,int num2);
	

}
