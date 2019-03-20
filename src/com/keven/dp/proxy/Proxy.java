package com.keven.dp.proxy;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午3:17:13 
* 说明 :
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
