package com.keven.dp.builder;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��20�� ����12:41:16 
* ˵�� :
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
