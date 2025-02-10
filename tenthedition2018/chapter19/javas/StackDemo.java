package tenthedition2018.chapter19.classes;

import java.util.Stack;
import java.util.EmptyStackException;

class StackDemo{
	static void showPush(Stack<Integer> st, int value){
		st.push(value);
		System.out.println("pushed " + value + " in stack");
		System.out.println("current stack: " + st);
	}
	
	static void showPop(Stack<Integer> st){
		int a = st.pop();
		System.out.println("popped " + a + " from stack");
		System.out.println("current stack: " + st);
	}
	
	public static void main(String[] args){
		Stack<Integer> st = new Stack<Integer>();

		System.out.println("stack: " + st);
		
		showPush(st, 42);
		showPush(st, 66);
		showPush(st, 99);
		showPop(st);
		showPop(st);
		showPop(st);
		
		try{
			showPop(st);
		} catch(EmptyStackException e){
			System.out.println("Пустой стек. Ошибка: " + e);
		}
	}
}