package com.keven.dp.stategy_01;
/** 
 * @author Keven  Email:tv2014@126.com
 * @version 创建时间：2019-3-19 下午3:54:30 
 * 说明 :辅助类，实现一些功能的方法。解析等方法
 */
public abstract class Calculator {
	
	public int [] parser(String exp,String opt){
		String array[] = exp.split(opt);
		int arrayInt [] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}

}
