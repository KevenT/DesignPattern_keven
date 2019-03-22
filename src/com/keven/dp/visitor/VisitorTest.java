package com.keven.dp.visitor;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月22日 下午3:33:35 
* 说明 :
* 适用于数据结构相对稳定算法又易变化的系统。因为访问者模式使得算法操作
* 增加变得容易。若系统数据结构对象易于变化，经常有新的数据对象增加进来，
* 则不适合使用访问者模式。访问者模式的优点是增加操作很容易，因为增加操
* 作意味着增加新的访问者。访问者模式将有关行为集中到一个访问者对象中，
* 其改变不影响系统数据结构。其缺点就是增加新的数据结构很困难。
*/
public class VisitorTest {

	public static void main(String[] args) {
		Subject subject = new RealSubject();
		
		Visitor visitor = new MyVisitor();
		
		subject.acceptVisitor(visitor);
	}

}
