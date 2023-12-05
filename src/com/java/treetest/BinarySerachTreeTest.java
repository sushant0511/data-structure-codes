package com.java.treetest;

import java.util.Scanner;

public class BinarySerachTreeTest {

	TreeNewNode node;  // step 1
	
	public BinarySerachTreeTest() {
	
		node=createTree();
	}

	public TreeNewNode createTree() {  // step 2
		Scanner scanner=new Scanner(System.in);
		int data=scanner.nextInt();
		while(data!=0)
		{
			node=addData(node,data);  // step 3
			data=scanner.nextInt();
		}
		return node;
	}

	 TreeNewNode addData(TreeNewNode node, int data) {
		if(node==null)
		{
			return new TreeNewNode(data); // root 
		}
		if(data<node.data)
		{
			node.left=addData(node.left, data);
		}
		else
		{
			node.right=addData(node.right, data);
		}
		return node;
			
	}
	 
	 void show()
	 {
		 //preOrderTraverse(node);
		 inOrderTraverse(node);
	 }

	 void preOrderTraverse(TreeNewNode node) {
		
		if(node==null)
		{
			return;
		}
		System.out.println(node.data);
		preOrderTraverse(node.left);
		preOrderTraverse(node.right);
		
		
	}
	 void inOrderTraverse(TreeNewNode node) {
			
			if(node==null)
			{
				return;
			}
			inOrderTraverse(node.left);
			System.out.println(node.data);
			inOrderTraverse(node.right);
			
			
		}
	 
	 
	 String serachInBST(int data)
	 {
		 return searchData(node,data);
	 }

	 String searchData(TreeNewNode node, int data) {
		 if(node==null)
		 {
			 return "Not found"; 
		 }
		if(node.data==data)
		{
			return "Found";
		}
		if(node.data>=data)
		{
			return searchData(node.left, data);
		}
		
		return searchData(node.right, data);
	}
	 
	 
	 
	 
	 
	 
	 
}
