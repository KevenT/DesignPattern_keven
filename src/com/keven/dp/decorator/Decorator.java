package com.keven.dp.decorator;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����3:17:13 
* ˵�� :
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
