import java.util.Random;

class HandleError{
	public static void main(String args[]){
		int a = 0, b = 0, c = 0;
		Random r = new Random();
		
		for (int i = 0; i < 32000; i++){
			try {
				b = r.nextInt();
				System.out.println("b = " + b);
				c = r.nextInt();
				System.out.println("c = " + c);
				a = 12345 / (b / c);
			}
			catch (ArithmeticException e){
				System.out.println("Ошибка. Текст ошибки: " + e.getMessage());
				a = 0;
			}
			System.out.println("a: " + a);
		}
		
	}
}