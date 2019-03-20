package com.keven.dp.adapter_1inteface;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午2:51:30 
* 说明 :对象适配器
* 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的兼容性问题。
* 主要分为三类：类的适配器模式、对象的适配器模式、接口的适配器模式。
*/
public class InterfaceAdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sourceable ss1 = new SourceSub1();
		Sourceable ss2 = new SourceSub2();
		ss1.method1();
		ss1.method2();
		ss2.method1();
		ss2.method2();

	}

}
