package com.keven.dp.decorator;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午3:17:13 
* 说明 :
*/
public class Decorator implements Sourceable{

	private Source source ;
	
	public Decorator(Source source ) {
		super();
		this.source = source;
	}
	
	@Override
	public void method() {
		System.out.println("befor decorator");
		source.method();
		System.out.println("after decorator");
	}

}
