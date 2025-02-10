package ninthedition2015.chapter5.classes;

class Continue{
	public static void main(String args[]){
		for (int i = 0; i < 7; i++){
			System.out.println(i);
			if (i % 2 == 0){
				continue;
			}
			System.out.println("Итерация " + i + " не пропустила вывод этой строки");
		}
	}
}