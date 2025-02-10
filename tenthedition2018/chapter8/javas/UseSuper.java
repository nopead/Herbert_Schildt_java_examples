package tenthedition2018.chapter8.classes;

class A2{
	int i;
}

class B2 extends A2{
	
	int i;
	
	B2(int a, int b){
		super.i = a;
		this.i = b;
	}
	
	void show(){
		System.out.println("super.i and this.i : " + super.i + " " + this.i);
	}
}

class UseSuper{
	public static void main(String[] args){
		B2 subObj = new B2(1, 2);
		
		subObj.show();
	}
}