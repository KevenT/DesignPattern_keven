package com.keven.dp.proxy;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����3:17:13 
* ˵�� :
*/
public class Proxy implements Sourceable{

	private Source source;
	
	public Proxy() {
		super();
		this.source = new Source();
	}
	
	@Override
	public void method() {
		System.out.println("befor proxy");
		source.method();
		System.out.println("after proxy");
	}

}
