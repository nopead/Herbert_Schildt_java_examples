package tenthedition2018.chapter8.classes;

abstract class A7 {
	abstract void callme();
	
	void callmeto(){
		System.out.println("Конкретный метод абстрактного класса");
	}
}

class B7 extends A7{
	void callme(){
		System.out.println("Реализация метода callme в классе B");
	}
}
