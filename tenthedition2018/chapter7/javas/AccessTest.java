package tenthedition2018.chapter7.classes;

import tenthedition2018.chapter7.classes.Test5;

class AccessTest{
	public static void main(String[] args){
		Test5 test = new Test5();
		
		test.a = 10;
		test.b = 20;
		test.setC(100);
		
		System.out.println("a, b, c: " + test.a + " " + test.b + " " + test.getC());
	}
}