package ninthedition2015.chapter3.classes;

class Area{
	public static void main(String args[]){
		double pi, r, a;
		
		r = 10.8; // Радиус кругаё
		pi = 3.1416; // Приблизительное значение числа pi
		a = pi * r * r; // Вычилсение площади круга
		
		System.out.println("Площадь круга равна " + a);
	}
}