enum Apple{
	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
	
	private int price;
	
	Apple(int p) { price = p; }
	
	int getPrice() { return price; }
}

class EnumDemo3{
	public static void main(String args[]){
		Apple ap;
		
		System.out.println("Яблоко сорта Winesap стоит" + Apple.Winesap.getPrice() + " центов.");
		
		System.out.println("Цены на все сорта яблок:");
		
		for(Apple apple : Apple.values()){
			System.out.println("Сорт: " + apple + ". Цена: " + apple.getPrice() + " центов.");
		}
	}
}