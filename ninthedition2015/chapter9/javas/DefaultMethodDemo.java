package ninthedition2015.chapter9.classes;

class MyIFImp implements MyIF {

	public int getNumber(){
		return 100;
	}
}

class MyIFImp2 implements MyIF {
	
	public int getNumber(){
		return 100;
	}
	
	public String getString(){
		return "Переопределенный метод getString()";
	}
	
}

class DefaultMethodDemo{
	
	public static void main(String[] args){
		MyIFImp obj = new MyIFImp();
		MyIFImp2 obj2 = new MyIFImp2();
		
		System.out.println("getNumber(): " + obj.getNumber());
		System.out.println("getString(): " + obj.getString());
		
		System.out.println("getNumber(): " + obj2.getNumber());
		System.out.println("getString(): " + obj2.getString());
	}
}