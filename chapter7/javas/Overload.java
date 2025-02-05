package chapter7.classes;

class OverloadDemo{
	void test(){
		System.out.println("Метод test без параметров");
	}
	void test(int a){
		System.out.println("Метод test с параметром типа int");
		System.out.println("Значение параметра а = " + a);
	}
	void test(int a, int b){
		System.out.println("Метод test с двумя параметрами типа int");
		System.out.println("Значение параметра а = " + a);
		System.out.println("Значение параметра b = " + b);
	}
	double test(double d){
		System.out.println("Метод тест с параметром типа double");
		System.out.println("Значение параметра d = " + d);
		return d * d;
	}
}

class Overload {
	public static void main(String[] args){
		OverloadDemo od = new OverloadDemo();
		od.test();
		od.test(1);
		od.test(1,3);
		double square = od.test(2.0);
		System.out.println("Квадрат чилса 2.0 = " + square);
	}
}