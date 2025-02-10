package ninthedition2015.chapter10.classes;

class MyException extends Exception{
	private int detail;
	
	MyException(int a){
		detail = a;
	}
	
	public String toString(){
		return "MyException[" + detail + "]";
	}
}

class ExceptionDemo{
	
	static void compute(int a) throws MyException{
		System.out.println("Вызван метод compute(" + a + ")");
		if (a > 10){
			throw new MyException(a);
		}
		System.out.println("Завершение без ошибки");
	}
	
	public static void main(String args[]){
		try{
			compute(1);
			compute(20);
		}
		catch (MyException e){
			System.out.println(e.toString());
		}
	}
}