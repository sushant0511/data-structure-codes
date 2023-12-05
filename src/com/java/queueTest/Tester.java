package com.java.queueTest;

public class Tester {

	public static void main(String[] args) throws Exception {
		QueueOperations queue=new QueueOperations(5);
		queue.addQueue(5);
		queue.addQueue(7);
		queue.addQueue(11);
		queue.addQueue(4);
		queue.addQueue(14);
		queue.show();
		queue.removeQueue();
		
		System.out.println("After removal");
		queue.show();
//		queue.addQueue(17);
//		queue.show();
	}

}
