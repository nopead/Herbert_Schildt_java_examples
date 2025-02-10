package ninthedition2015.chapter9.classes;

class A{
	public interface NestedIF {
		boolean isNotNegative(int x);
	}
}

class B implements A.NestedIF{
	public boolean isNotNegative(int x){
		return (x > 0);
	}
}

class NestedIFDemo{
	public static void main(String[] args){
		A.NestedIF nif = new B();
		
		int x = 10;
		if (nif.isNotNegative(x)){
			System.out.println(x + " - положительное число");
		}
		x = -12;
		if (nif.isNotNegative(x)){
			System.out.println(x + " - положительное число");
		}
	}
}
