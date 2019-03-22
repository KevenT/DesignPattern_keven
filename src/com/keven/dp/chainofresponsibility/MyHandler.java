package com.keven.dp.chainofresponsibility;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午1:25:03 
* 说明 :
*/
public class MyHandler extends AbstractHandler implements Handler{

	
	private String name;
	
	public MyHandler(String name) {
		this.name = name;
	}
	
	@Override
	public void operator() {
		System.out.println(name+"  deal");
		if (getHandler()!=null) {
			getHandler().operator();
		}
	}

}
