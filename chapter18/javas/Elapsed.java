package chapter18.classes;

class Elapsed{
	public static void main(String[] args){
		long start;
		long end;
		
		System.out.println("Измерение времени перебора от 0 до 100000000");
		
		start = System.currentTimeMillis();
		for (long i = 0; i < 100000000L; i++){}
		end = System.currentTimeMillis();
		System.out.println("Время выполнения: " + (end - start) + " миллисек.");
	}
}