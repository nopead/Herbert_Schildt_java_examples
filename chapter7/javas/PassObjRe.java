package chapter7.classes;

import chapter7.classes.Test3;

class PassObjRe{
	public static void main(String[] args){
		Test3 obj = new Test3(15, 20);
		System.out.println("a и b до вызова meth: " + obj.a + " " + obj.b);
		
		obj.meth(obj);
		
		System.out.println("a и b до вызова meth: " + obj.a + " " + obj.b);
	}
}