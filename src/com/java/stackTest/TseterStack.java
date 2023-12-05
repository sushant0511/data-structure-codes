package com.java.stackTest;

public class TseterStack {

	public static void main(String[] args) throws Exception {
		StackDSTest test=new StackDSTest(4);
		test.pushStack(11);
		test.pushStack(22);
		test.pushStack(33);
		test.pushStack(44);
		test.show();
		test.peekElement();
		test.popStack();// pos item delete
		test.show();
		test.peekElement();
		test.popStack();
		test.peekElement();
		test.popStack();
		test.peekElement();
		
		
	}

}
