package com.java.stackTest;

public class StackDSTest {
	
	int[] stackData;  // element of stack
	int pos;// pointer 
	int stackSize=5;
	
	public StackDSTest() {
		stackData=new int[stackSize];
		pos=-1;// stack empty
	}
	public StackDSTest(int userDefineSize) {
		stackData=new int[userDefineSize];
		pos=-1;// stack empty
	}
	
	public int fetchSize()
	{
		return pos+1;// -1
	}
	
	
	public String pushStack(int value) throws Exception
	{
		if(fetchSize()==stackData.length)
		{
			throw new Exception("Size issuein stack");
		}
		pos++;
		stackData[pos]=value;
		return "data added successfully";
	}
	
	
	public String popStack()
	{
		if(fetchSize()==0)
		{
			return "Stack in empty";
		}
		System.out.println("Item removed "+stackData[pos]);
		pos--;
		return "Item removed";
	}
	
	public void peekElement()
	{
		if(fetchSize()==0)
		{
			System.out.println("Nothing");
		}
		System.out.println("Peek element is="+stackData[pos]);
	}
	
	public void show()
	{
		for(int i=pos;i>=0;i--)
		{
			System.out.println(stackData[i]);
		}
	}
	
	
	

}
