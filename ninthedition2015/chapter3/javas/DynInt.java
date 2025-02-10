package ninthedition2015.chapter3.classes;

class DynInt{
	public static void main(String args[]){
		double a = 3.0, b = 4.0;
		
		//динамическая инициализация переменной с
		double c = Math.sqrt(a * a + b * b);
		System.out.println("Гипотенуза равна " + c);
	}
}