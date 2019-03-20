package com.keven.dp.builder;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午12:41:16 
* 说明 :
*/
public class BuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder builder = new Builder();
		builder.produceMailSender(2);
		builder.produceSmsSender(3);
		builder.send();
	
	}

}
