class ChainExcDemo{
	
	static void demoproc(){
		NullPointerException e = new NullPointerException("Верхний уровень");
		
		e.initCause(new ArithmeticException("Причина ошибки верхнего уровня"));
		
		throw e;
	}
	
	public static void main(String args[]){
		try{
			demoproc();
		}
		catch (NullPointerException e) {
			System.out.println("e: " + e);
			
			System.out.println("e cause: " + e.getCause());
		}
	}
}