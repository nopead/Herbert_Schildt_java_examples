package chapter19.classes;

import java.util.Comparator;
import java.util.TreeSet;

class CompDemo2{
	public static void main(String[] args){
		TreeSet<String> set = new TreeSet<String>((aStr, bStr) -> aStr.compareTo(bStr));
		
		set.add("C");
		set.add("A");
		set.add("B");
		set.add("E");
		set.add("F");
		set.add("D");
		
		for(String element: set){
			System.out.print(element + " ");
		}
		System.out.println();
	}	
}