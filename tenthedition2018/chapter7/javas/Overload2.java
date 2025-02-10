package tenthedition2018.chapter7.classes;

class OverloadDemo2{
	void test(){
		System.out.println("Параметры отсутвтвуют");
	}
	void test(int a, int b){
		System.out.println("Значения a и b:" + a + " " + b);
	}
	void test(double a){
		System.out.println("Внутреннее преобразование при вызове " + " test(double) a: " + a);
	}
}

class Overload2{
	public static void main(String[] args){
		OverloadDemo2 od2 = new OverloadDemo2();
		int i = 88;
		
		od2.test();
		od2.test(10,20);
		od2.test(i);
		od2.test(123.2);
	}
}