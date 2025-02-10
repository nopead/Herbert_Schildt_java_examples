package ninthedition2015.chapter12.classes;

class UnboxError{
	public static void main(String args[]){
		Integer iObj = 1000;
		
		int i = iObj.byteValue();
		
		System.out.println(i);
	}
}