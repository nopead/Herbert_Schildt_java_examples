package classes;

class Stack{
	int[] stck = new int[10];
	int tos;
	
	Stack(){
		tos = -1;
	}
	
	void push(int item){
		if (tos == 9){
			System.out.println("Стек заполнен, попытка переполнения стека");
		}
		else{
			stck[++tos] = item;
		}
	}
	
	int pop(){
		if(tos < 0){
			System.out.println("Попытка извлечения из пустого стека");
			return 0;
		}
		else{
			return stck[tos--];
		}
	}
}