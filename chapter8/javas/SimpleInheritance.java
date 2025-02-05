package chapter8.classes;

class A {
	int i;
	int j;
	
	void show_i_and_j(){
		System.out.println("i and j = " + i + " " + j);
	}
}

class B extends A{
	
	int k;
	
	void show_k(){
		System.out.println("k = " + k);
	}
	
	void sum(){
		System.out.println("i + j + k = " + (i + j + k));
	}
	
}

class SimpleInheritance{
	public static void main(String[] args){
		A superObj = new A();
		B subObj = new B();
		
		superObj.i = 10;
		superObj.j = 20;
		
		superObj.show_i_and_j();
		
		subObj.i = 7;
		subObj.j = 8;
		subObj.k = 9;
		
		subObj.show_i_and_j();
		subObj.show_k();
		
		subObj.sum();
	}
}