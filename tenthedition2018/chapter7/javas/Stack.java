package tenthedition2018.chapter7.classes;

class Stack{
	private int[] stck = new int[10];
	private int tos;
	
	Stack(){
		tos = -1;
	}
	
	int getLength(){
		return stck.length;
	}
	
	void push(int value){
		if (tos == 9){
			System.out.println("Стек заполнен");
		}
		else {
			stck[++tos] = value; 
		}
	}
	
	int pop(){
		if (tos > 0){
			return stck[tos--];
		}
		else {
			System.out.println("Стек пуст");
			return 0;
		}
	}
}