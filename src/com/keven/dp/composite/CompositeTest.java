package com.keven.dp.composite;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��21�� ����2:39:31 
* ˵�� :����Ͳ��ֵ�  ���ģʽ
*/
public class CompositeTest {

	
	public static void main(String[] args) {
		 Tree tree  = new Tree("a");
		 TreeNode treeNode1 = new TreeNode("b");
		 TreeNode treeNode2 = new TreeNode("c");
		 
		 tree.getRoot().add(treeNode1);
		 treeNode1.add(treeNode2);		 	

	}

}
