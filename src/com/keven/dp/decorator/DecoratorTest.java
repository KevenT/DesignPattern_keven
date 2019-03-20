package com.keven.dp.decorator;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月20日 下午3:21:24 
* 说明 :装饰模式：给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
*/
public class DecoratorTest {

	public static void main(String[] args) {
		Source source = new Source();
		Sourceable sourceable= new Decorator(source);
		sourceable.method();

	}

}
