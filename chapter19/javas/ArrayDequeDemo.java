package chapter19.classes;

import java.util.*;

class ArrayDequeDemo{
	public static void main(String[] args){
		ArrayDeque<String> ad = new ArrayDeque<String>();
		
		ad.push("D");
		ad.push("E");
		ad.push("F");
		
		System.out.println("Извлечение из стека");

		while(ad.peek() != null){
			System.out.print(ad.pop() + " ");
		}
		System.out.println();
	}
}