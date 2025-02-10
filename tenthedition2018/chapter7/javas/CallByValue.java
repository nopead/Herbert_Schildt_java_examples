package tenthedition2018.chapter7.classes;

import tenthedition2018.chapter7.classes.Test2;

class CallByValue{
	public static void main(String[] args){
		int a = 15;
		int b = 20;
		
		System.out.println("а и b до вызова meth: " + a + " " + b);
		
		Test2 obj = new Test2();
		
		obj.meth(a, b);
		
		System.out.println("а и b до вызова meth: " + a + " " + b);
	}
}