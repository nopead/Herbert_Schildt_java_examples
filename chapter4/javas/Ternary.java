class Ternary{
	public static void main(String args[]){
		int i, k;
		
		i = 10;
		k = i < 0 ? -i : i; // получение абсолютного значения i
		
		System.out.print("abs(" + i + ") = ");
		System.out.print(k + "\n");
		
		i = -10;
		k = i < 0 ? -i : i;
		System.out.print("abs(" + i + ") = ");
		System.out.print(k + "\n");
		
	}
}