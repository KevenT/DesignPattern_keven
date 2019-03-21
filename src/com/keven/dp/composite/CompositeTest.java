package com.keven.dp.composite;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月21日 下午2:39:31 
* 说明 :整体和部分的  组合模式
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
