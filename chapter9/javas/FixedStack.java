package chapter9.classes;

interface IntStack{
	void push(int value);
	int pop();
	int Length();
	
	default void clear(){
		throw new UnsupportedOperationException("Метод clear() не реализован");
	}
}

class FixedStack implements IntStack{
	
	private int[] fixedstck;
	private int ftos;
	
	FixedStack(int size){
		fixedstck = new int[size];
		ftos = -1;
	}
	
	public void push(int value){
		if (ftos == fixedstck.length - 1){
			System.out.println("Стек заполнен");
		}
		else{
			fixedstck[++ftos] = value;
		}
	}
	
	public int pop(){
		if (ftos < 0){
			return 0;
		}
		else{
			return fixedstck[ftos--];
		}
	}
	
	public int Length(){
		return fixedstck.length;
	}
}

class DynStack implements IntStack {
	
	private int[] dstack;
	private int dtos;
	
	DynStack(int size){
		dstack = new int[size];
		dtos = -1;
	}
	
	public void push(int value){
		if (dtos == dstack.length -1){
			int[] temp = new int[dstack.length * 2];
			
			for (int i = 0; i < dstack.length; i++){
				temp[i] = dstack[i];
			}
			dstack = temp;
			dstack[++dtos] = value;
		}
		else{
			dstack[++dtos] = value;
		}
	}
	
	public int pop() {
		if (dtos < 0) {
			return 0;
		}
		else {
			return dstack[dtos--];
		}
	}
	
	public int Length(){
		return dstack.length;
	}
}