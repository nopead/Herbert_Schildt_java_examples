package chapter9.classes;

interface A2 {
	void meth1();
	void meth2();
}

interface B2 extends A2 {
	void meth3();
}

class MyClass implements B2{
	public void meth1(){
		System.out.println("meth1");
	}
	public void meth2(){
		System.out.println("meth2");
	}
	public void meth3(){
		System.out.println("meth3");
	}
}

class IFExtend {
	public static void main(String[] args){
		MyClass obj = new MyClass();
		
		obj.meth1();
		obj.meth2();
		obj.meth3();
	}
}