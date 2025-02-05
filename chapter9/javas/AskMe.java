package chapter9.classes;

class AskMe implements SharedConstants{
	static void answer(int result){
		switch(result){
			case NO -> System.out.println("Нет");
			case YES -> System.out.println("Да");
			case MAYBE -> System.out.println("Возможно");
			case LATER -> System.out.println("Позжнее");
			case SOON -> System.out.println("Скоро");
			case NEVER -> System.out.println("Никогда");
		}
	}
	
	public static void main(String[] args){
		Question q = new Question();
		
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
	}
}