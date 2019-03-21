package com.keven.dp.bridge;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月21日 上午11:12:32 
* 说明 :
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
