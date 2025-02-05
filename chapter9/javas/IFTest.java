package chapter9.classes;

import chapter9.classes.FixedStack;

class IFTest{
	public static void main(String[] args){
		FixedStack mystack1 = new FixedStack(5);
		FixedStack mystack2 = new FixedStack(8);
		
		for (int i = 0; i < 5; i++) {
			mystack1.push(i);
		}
		for (int i = 0; i < 8; i++) {
			mystack2.push(i);
		}
		
		for (int i = 0; i < mystack1.Length(); i++) {
			System.out.println(mystack1.pop());
		}
		for (int i = 0; i < mystack2.Length(); i++) {
			System.out.println(mystack2.pop());
		}
	}
}