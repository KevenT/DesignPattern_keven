package com.keven.dp.templatemethod;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��21�� ����5:04:28 
* ˵�� :
*/
public class TemplateMethodTest {

	public static void main(String[] args) {
		String exp = "9+4";
		TemplateCalculator cal = new Plus();
		int result = cal.calculator(exp, "\\+");
		System.out.println(result);

	}

}
