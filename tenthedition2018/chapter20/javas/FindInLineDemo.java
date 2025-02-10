package tenthedition2018.chapter20.classes;

import java.util.Scanner;

class FindInLineDemo{
	public static void main(String[] args){
		String instr = "Имя: Том Возраст: 28 ID: 77";
		try (Scanner sc = new Scanner(instr)){
			sc.findInLine("Возраст:");
			if (sc.hasNext()){
				System.out.println(sc.next());
			}
			else{
				System.out.println("Ошибка");
			}
		}
	}
}