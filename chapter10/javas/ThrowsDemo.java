class ThrowsDemo{
	
	static void throwone() throws IllegalAccessException{
		System.out.println("В теде метода throwsone");
		throw new IllegalAccessException("Демонстрация");
	}
	
	public static void main(String args[]){
		try{
			throwone();
		}
		catch (IllegalAccessException e){
			System.out.println("В теле метода main " + e);
		}
	}
}