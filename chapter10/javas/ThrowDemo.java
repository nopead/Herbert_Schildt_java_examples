class ThrowDemo{
	static void demoproc(){
		try{
			throw new NullPointerException("демонстрация");
		}
		catch(NullPointerException e){
			System.out.println(e);
			throw e;
		}
	}
	
	public static void main(String args[]){
		try{
			demoproc();
		}
		catch (NullPointerException e){
			System.out.println("Повторный перехват " + e);
		}
	}
}