package com.keven.dp.bridge;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��21�� ����11:16:09 
* ˵�� :
*/
public class BridgeTest {
	
	public static void main(String[] args) {
		Sourceable sourceable = new SourceSub1();
		
		Bridge bridge = new MyBridge();
		
		bridge.setSourceable(sourceable);
		
		bridge.method();
	}

}
