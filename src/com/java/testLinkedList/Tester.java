package com.java.testLinkedList;

public class Tester {

	public static void main(String[] args) throws Exception {
		LinkedListDemo list=new LinkedListDemo();
		list.addFirstNode(12);
		list.addFirstNode(33);
		list.addFirstNode(11);
		list.show();
		list.addLastNode(44);
		list.show();
		list.addLastNode(55);
		list.show();
		list.addAtPosition(2, 32);
		list.show();
		System.out.println("First element is="+list.getFirstElement());
		System.out.println("Last element is="+list.getLastElement());
		System.out.println("Index at 3  element is="+list.getIndexElement(3));
//		System.out.println(list.removeDataAtIndex(2));
//		list.show();
//		System.out.println(list.removeDataAtIndex(4));
//		list.show();
	}

}
