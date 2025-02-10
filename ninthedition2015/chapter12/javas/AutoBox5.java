package ninthedition2015.chapter12.classes;

class AutoBox5{
	public static void main(String args[]){
		Boolean b = false;
		
		if(b) {System.out.println("b is true");}
		
		Character ch = 'x';
		char ch2 = ch;
		
		System.out.println("ch2 = " + ch2);
	}
}