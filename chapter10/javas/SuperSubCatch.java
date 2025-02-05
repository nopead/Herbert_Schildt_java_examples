class SuperSubCatch{
	public static void main(String args[]){
		try{
			int d = 0;
			int a = 42 / d;
			System.out.println("Не будет выведено");
		}
		catch (Exception e){
			System.out.println(e);
		}
		catch (ArithmeticException e){
			// Недостижимый catch
			System.out.println(e);
		}
		System.out.println("После блока try/catch");
	}
	
}