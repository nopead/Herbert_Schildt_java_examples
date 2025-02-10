package ninthedition2015.chapter10.classes;

class Exc2{
	public static void main(String args[]){
		int d, a;
		
		try{
			d = 0;
			a = 10 / d;
			System.out.println("Не будет выводится, поскольку предшествует ошибка");
		}
		catch (ArithmeticException e){
			System.out.println("Ошибка. Текст ошибки: " + e.getMessage());
		}
		System.out.println("Эта запись выводится после оператора catch");
	}
}