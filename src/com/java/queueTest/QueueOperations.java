package com.java.queueTest;

public class QueueOperations {

	int[] queueData;
	int size;
	int queueFront;
	
	public QueueOperations(int queueSize) {  // 2
		if(queueSize<1)
		{
			System.out.println("Nothing in queue");
		}
		queueData=new int[queueSize];
		size=0;
	}
	
	public void addQueue(int value) throws Exception
	{
		
		if(size==queueData.length)
		{
			throw new Exception("Queue is full");
		}
		
		int rearValue=(queueFront+size)%queueData.length;
		queueData[rearValue]=value;
		size++;
			
	}
	
	public void removeQueue()
	{
		queueFront=(queueFront+1)%queueData.length;
		size--;
	}
	
	
	
	public void show()
	{
		for(int i=0;i<size;i++)
		{
			int index=(queueFront+i)%queueData.length;
			System.out.println(queueData[index]);
			
			System.out.println("Size="+size);
		}
	}
	
	
	
	
	
}
