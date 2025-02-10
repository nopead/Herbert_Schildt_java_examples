package ninthedition2015.chapter3.classes;
// вычислить расстояние, проходимое светом
// используя переменные типа long
class Light{
	public static void main(String args[]){
		int lightspeed;
		long days;
		long seconds;
		long distance;
		
		//приблизительная скорость света, миль в секунду
		lightspeed = 186000;
		
		days = 1000; // указатель количества дней
		
		seconds = days * 24 * 60 * 60; //преобразование дней в секунды
		
		distance = lightspeed * seconds; //вычисление расстояния
		
		System.out.print("За " + days);
		System.out.print(" дней свет пройдет около ");
		System.out.print(distance +  " миль");
	}
}