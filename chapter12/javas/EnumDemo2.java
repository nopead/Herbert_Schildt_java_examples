enum Apple {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

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
