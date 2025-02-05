package chapter19.classes;

import java.util.*;

class ForEachDemo{
	public static void main(String[] args){
		ArrayList<Integer> vals = new ArrayList<Integer>();
		
		vals.add(1);
		vals.add(2);
		vals.add(3);
		vals.add(4);
		
		System.out.print("Исходный vals ");
		for (int v: vals){
			System.out.print(v + " ");
		}
		System.out.println();
		
		//Сумма чисел
		int sum = 0;
		for (int v: vals){
			sum += v;
		}
		System.out.println("Сумма: " + sum);
	}
}