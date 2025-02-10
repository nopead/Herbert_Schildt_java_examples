package ninthedition2015.chapter12.classes;

enum Apple2{
	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
	
	private int price;
	
	Apple2(int p) { price = p; }
	
	int getPrice() { return price; }
}

class EnumDemo3{
	public static void main(String args[]){
		Apple2 ap;
		
		System.out.println("Яблоко сорта Winesap стоит" + Apple2.Winesap.getPrice() + " центов.");
		
		System.out.println("Цены на все сорта яблок:");
		
		for(Apple2 apple : Apple2.values()){
			System.out.println("Сорт: " + apple + ". Цена: " + apple.getPrice() + " центов.");
		}
	}
}