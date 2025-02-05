package chapter7.classes;

import chapter7.classes.Test;

class PassOb {
	public static void main(String[] args){
		Test obj1 = new Test(100, 22);
		Test obj2 = new Test(100, 22);
		Test obj3 = new Test(-1, 1);
		
		System.out.println("obj1 == obj2: " + obj1.equalTo(obj2));
		System.out.println("obj1 == obj3: " + obj1.equalTo(obj3));
	}
}
