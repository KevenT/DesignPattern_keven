package com.keven.dp.composite;
/** 
* @author Keven  Email:tv2014@126.com
* @version 创建时间：2019年3月21日 下午2:38:08 
* 说明 :
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
