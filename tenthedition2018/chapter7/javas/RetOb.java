package tenthedition2018.chapter7.classes;

import tenthedition2018.chapter7.classes.Test4;

class RetOb{
	public static void main(String[] args){
		Test4 ob1 = new Test4(2);
		Test4 ob2;
		
		ob2 = ob1.incrByTen();
		System.out.println("ob1.a = " + ob1.a);
		System.out.println("ob2.a = " + ob2.a);
		ob2 = ob2.incrByTen();
		System.out.println("ob2.a после повторного вызова: " + ob2.a);
	}
}