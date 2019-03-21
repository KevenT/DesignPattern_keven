package com.keven.dp.templatemethod;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月21日 下午5:04:28 
* 说明 :
*/
public class TemplateMethodTest {

	public static void main(String[] args) {
		String exp = "9+4";
		TemplateCalculator cal = new Plus();
		int result = cal.calculator(exp, "\\+");
		System.out.println(result);

	}

}
