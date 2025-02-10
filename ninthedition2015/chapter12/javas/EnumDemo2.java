package ninthedition2015.chapter12.classes;

import ninthedition2015.chapter12.classes.Apple;

class EnumDemo2{
	public static void main(String args[]){
		Apple ap;
		
		System.out.println("Константы перечислимого типа Apple: ");
		Apple allapples[] = Apple.values();
		
		for (Apple appletype : allapples){
			System.out.println(appletype);
		}
		
		System.out.println();
		
		ap = Apple.valueOf("Winesap");
		System.out.println("Переменная ap содержит: "  + ap);
	}
}
