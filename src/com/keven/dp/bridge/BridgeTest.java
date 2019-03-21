package com.keven.dp.bridge;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月21日 上午11:16:09 
* 说明 :
*/
public class BridgeTest {
	
	public static void main(String[] args) {
		Sourceable sourceable = new SourceSub1();
		
		Bridge bridge = new MyBridge();
		
		bridge.setSourceable(sourceable);
		
		bridge.method();
	}

}
