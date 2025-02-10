package tenthedition2018.chapter18.classes;

import tenthedition2018.chapter18.classes.TestClone;

class CloneDemo{
	public static void main(String[] args){
		TestClone x1 = new TestClone();
		TestClone x2;
		
		x1.a = 10;
		x1.b = 20.98;
		x2 = x1.cloneTest();
		System.out.println("x1: " + x1.a + " " + x1.b);
		System.out.println("x2: " + x2.a + " " + x2.b);
	}
}