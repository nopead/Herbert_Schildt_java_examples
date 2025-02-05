class BoolTest{
	public static void main(String args[]){
		boolean b;
		
		b = false;
		System.out.println("b равно " + b);
		b = true;
		System.out.println("b равно " + b);
		
		// Значение типа boolean может управлять оператором if
		if (b) System.out.println("Этот код выполнится, потому что b сейчас true");
		
		b = false;
		if (b) System.out.println("Этот код не выполнится, потому что b сейчас false");
		
		//результат сравнения - значение типа boolean
		System.out.println("10 > 9 is " + (10 > 9));
	}
}