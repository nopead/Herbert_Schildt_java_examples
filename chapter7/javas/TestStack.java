package chapter7.classes;

import chapter7.classes.Stack;

class TestStack{
	public static void main(String[] args){
		Stack myStack1 = new Stack();
		Stack myStack2 = new Stack();
		
		for (int i = 0; i < 10; i++) {myStack1.push(i);}
		for (int i = 10; i < 20; i++) {myStack2.push(i);}
		
		System.out.println("Stack1");
		for (int i = 0; i < myStack1.getLength() - 1; i++) {
			System.out.println(myStack1.pop());
		}
		System.out.println("Stack2");
		for (int i = 0; i < myStack2.getLength() - 1; i++) {
			System.out.println(myStack2.pop());
		}
		
	}
}