package com.keven.dp.bridge;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��21�� ����11:12:32 
* ˵�� :
*/
public abstract class Bridge {
	private Sourceable sourceable;

	public Sourceable getSourceable() {
		return sourceable;
	}

	public void setSourceable(Sourceable sourceable) {
		this.sourceable = sourceable;
	}
	
	public void method() {
		sourceable.method();
	}

}
