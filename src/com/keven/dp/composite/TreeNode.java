package com.keven.dp.composite;

import java.util.Enumeration;
import java.util.Vector;
import java.util.jar.Attributes.Name;

/** 
* @author Keven  Email:tv2014@126.com
* @version ����ʱ�䣺2019��3��21�� ����2:29:45 
* ˵�� :
*/
public class TreeNode {
	private String Name;
	

	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<TreeNode>();

	public TreeNode(String name) {
		
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	public TreeNode getParent() {
		return parent;
	}
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public void add(TreeNode treeNode) {
		children.add(treeNode);
	}
	public void romove(TreeNode treeNode){
		children.remove(treeNode);
	}
	
	public Enumeration<TreeNode> getChildren(){
		return children.elements();
	}
}
