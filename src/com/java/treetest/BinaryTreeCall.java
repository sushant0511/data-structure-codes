package com.java.treetest;

import java.util.Scanner;

public class BinaryTreeCall {

	TreeNewNode rootNode;
	
	public BinaryTreeCall() {
	
		Scanner scanner=new Scanner(System.in);
		rootNode=generateTree(scanner);
	}
	
	TreeNewNode generateTree(Scanner scanner)
	{
		int data=scanner.nextInt();
		if(data==0)
		{
			return null;
		}
		TreeNewNode node=new TreeNewNode(data);
		node.left=generateTree(scanner);
		node.right=generateTree(scanner);
		return node;
		
	}
	
	public void show()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Which Traversing you want?");
		System.out.println("1--> Pre Order");
		System.out.println("2--> In Order");
		System.out.println("3--> Post Order");
		int choice=scanner.nextInt();
		if(choice==1)
		preOrderTraverse(rootNode);
		else if(choice==2)
		inOrderTraverse(rootNode);
		else if(choice==3)
			postOrderTraverse(rootNode);
		else
			System.exit(0);
	}
	void preOrderTraverse(TreeNewNode rootNode)
	{
		if(rootNode==null)
		{
			return;
		}
		System.out.println(rootNode.data);
		preOrderTraverse(rootNode.left);
		preOrderTraverse(rootNode.right);
	}
	
	void inOrderTraverse(TreeNewNode rootNode)
	{
		if(rootNode==null)
		{
			return;
		}
		inOrderTraverse(rootNode.left);
		System.out.println(rootNode.data);
		inOrderTraverse(rootNode.right);
	}
	void postOrderTraverse(TreeNewNode rootNode)
	{
		if(rootNode==null)
		{
			return;
		}
		inOrderTraverse(rootNode.left);
		inOrderTraverse(rootNode.right);
		System.out.println(rootNode.data);
	}
	
}
