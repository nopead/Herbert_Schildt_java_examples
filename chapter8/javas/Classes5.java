package chapter8.classes;

import chapter8.classes.A4;

class B5 extends A4{
	
	int k;
	
	B5(int a, int b, int c){
		super(a,b);
		k = c;
	}
	
	void show(String msg){
		System.out.println(msg + k);
	}
}