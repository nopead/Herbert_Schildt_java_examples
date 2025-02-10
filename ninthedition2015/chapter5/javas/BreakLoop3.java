package ninthedition2015.chapter5.classes;

class BreakLoop3{
	public static void main(String args[]){
		for (int i = 0; i < 3; i++){
			System.out.println("i: " + i);
			System.out.print("j: ");
			for (int j = 0; j < 100; j++){
				if (j == 10) {
					System.out.println("\nBreaking j loop");
					break;
				}
				
				System.out.print(j + " ");
			}
			System.out.println("\n");
		}
		
	}
}