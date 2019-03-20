package com.keven.dp.builder;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午12:32:25 
* 说明 :
*/


import java.util.ArrayList;
import java.util.List;

public class Builder {
	
	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count) {
		for(int i = 0 ; i < count; i++){
			list.add(new SmsSender());
		}
	}
	
	public void send() {
		for(int i = 0 ; i < list.size();i++){
			list.get(i).send();
		}
	}

}
