package tenthedition2018.chapter8.classes;

import tenthedition2018.chapter8.classes.A6;
import tenthedition2018.chapter8.classes.B6;
import tenthedition2018.chapter8.classes.C6;


class Dispatch{
	public static void main(String[] args){
		A6 a = new A6();
		B6 b = new B6();
		C6 c = new C6();
		
		A6 r;
		
		r = a;
		r.callMe();
		
		r = b;
		r.callMe();
			
		r = c;
		r.callMe();
	}
}