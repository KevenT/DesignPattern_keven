package com.keven.dp.composite;
/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��21�� ����2:38:08 
* ˵�� :
*/
public class Tree {

	private TreeNode root = null;
	public TreeNode getRoot() {
		return root;
	}
	public void setRoot(TreeNode root) {
		this.root = root;
	}
	public Tree(String name) {
		root = new TreeNode(name);
	}


}
