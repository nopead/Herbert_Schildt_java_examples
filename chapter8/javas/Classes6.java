package chapter8.classes;

class A6{
	void callMe(){
		System.out.println("Метод класса A");
	}
}


class B6 extends A6{
	void callMe(){
		System.out.println("Метод класса B");
	}
}


class C6 extends A6{
	void callMe(){
		System.out.println("Метод класса C");
	}
}