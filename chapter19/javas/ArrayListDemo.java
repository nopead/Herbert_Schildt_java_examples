package chapter19.classes;

import java.util.*;

class ArrayListDemo{
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<>();
		System.out.println("Начальный размер списочного массива al: " + al.size());
		
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		
		System.out.println("Размер списочного массива al после ввода элементов: " + al.size());
		System.out.println("Содержимое списочного массива после добавления элементов: " + al);
		
		al.remove("F");
		al.remove(2);
		
		System.out.println("Содержимое списочного массива al: " + al);
	}
}