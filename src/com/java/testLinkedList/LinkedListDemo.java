package com.java.testLinkedList;

public class LinkedListDemo {  // cons will call everytime

	NewNode head;
	NewNode tail;
	int size;
	
	
	public int getSize() {
		return size;
	}

	public LinkedListDemo() {
		head=null;
		tail=null;
		size=0;
	}
	
	public void addFirstNode(int data)
	{
		NewNode node=new NewNode(data);
		node.next=head;
		head=node;
		if(size==0)
		{
			tail=node;
		}
		
		size++;
	}

	
	
	public void addLastNode(int data)
	{
		NewNode node=new NewNode(data);
		if(size==0)
		{
			head=tail=node;
		}
		tail.next=node;
		tail=tail.next;
		
		size++;
	}
	
	
	public void addAtPosition(int index,int data) {
		if(index<0 || index>size)
		{
			throw new ArrayIndexOutOfBoundsException("Verify Size before insterion");
		}
		if(index==0)
		{
			addFirstNode(data);
		}
		else if(index==size)
		{
			addLastNode(data);
		}
		else
		{
			NewNode temp=head;
			for(int traverse=1;traverse<=index-1;traverse++)
			{
				temp=temp.next;
			}
			NewNode node=new NewNode(data);
			node.next=temp.next;
			temp.next=node;
			size++;
		}
		
	}
	
	
	public String removeDataFirst() throws Exception
	{
		if(size==0)
		{
			throw new Exception("No element");
		}
		
		else if(size==1)
		{
			head=null;
			tail=null;
			size=0;
		}
		else
		{
			head=head.next;
			size--;
		}
		return "Node Deleted";
	}
	
	public String removeDataLast() throws Exception
	{
		if(size==0)
		{
			throw new Exception("No element");
		}
		
		else if(size==1)
		{
			head=null;
			tail=null;
			size=0;
		}
		else
		{
			NewNode node=head;
			while(node.next!=tail)
			{
				node=node.next;
			}
			node.next=null;// tail 
			tail=node;
			size--;
		}
		return "Node Deleted";
	}
	
	public String removeDataAtIndex(int index) throws Exception
	{
		if(size==0)
		{
			throw new Exception("No element");
		}
		
		else if(size==1)
		{
			head=null;
			tail=null;
			size=0;
		}
		else
		{
			NewNode node=head;
			for(int i=1;i<index;i++)
			{
				node=node.next;
			}
			// 2  3  4 (2->4)
			node.next=node.next.next;
			size--;
		}
		return "Node Deleted";
	}
	

	
	public int getFirstElement() throws Exception {
	
		if(size==0)
		{
			throw new Exception("No ELement");
		}
		
		return head.data;
	}
	
	public int getLastElement() throws Exception {
		
		if(size==0)
		{
			throw new Exception("No ELement");
		}
		
		return tail.data;
	}
	
	
	
public int getIndexElement(int index) throws Exception
{
	if(index<0 || index>size)
	{
		throw new Exception("Enter index between range");
	}
	else if(index==0)
	{
		return head.data;
	}
	else if(index==size-1)
	{
		return tail.data;
	}
	else
	{
		NewNode node=head;
		for(int i=0;i<index;i++)
		{
			node=node.next;
		}
		return node.data;
	}
}
	
	
	public void show() {
		
		NewNode refTemp=head;
		while(refTemp!=null)
		{
			System.out.print(refTemp.data+" ");
			refTemp=refTemp.next;
		}
		System.out.println();
	}
	
	
	
}
