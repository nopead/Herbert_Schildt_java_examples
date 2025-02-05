package classes;

import classes.Stack;

class TestStack{
	public static void main(String[] args){
		Stack myStack1 = new Stack();
		Stack myStack2 = new Stack();
		
		for (int i = 0; i < 10; i++){
			myStack1.push(i);
		}
		for (int i = 10; i < 20; i++){
			myStack2.push(i);
		}
		
		System.out.println("Извлечение значений из первого стека");
		for (int i = 0; i < 10; i++){
			System.out.println(myStack1.pop());
		}
		System.out.println("Извлечение значений из второго стека");
		for (int i = 0; i < 10; i++){
			System.out.println(myStack2.pop());
		}
	}
}