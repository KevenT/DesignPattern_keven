package com.keven.dp.chainofresponsibility;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��22�� ����1:25:03 
* ˵�� :
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
