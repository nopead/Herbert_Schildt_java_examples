package chapter8.classes;

class A3{
	A3(){
		System.out.println("Конструктор A");
	}
}

class B3 extends A3{
	B3(){
		System.out.println("Конструктор B");
	}
}

class C3 extends B3{
	C3(){
		System.out.println("Конструктор C");
	}
}