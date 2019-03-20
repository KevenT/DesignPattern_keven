package com.keven.dp.adapter_1target;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午2:45:57 
* 说明 :
*/
public class TargetAdapter  implements Targetable{
	
	private Source source;
	
	public TargetAdapter(Source source) {
		super();
		this.source = source;
		
	}
	
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}
	
	@Override
	public void method2(){
		System.out.println("this is the targetable method2");
		
	}

}
