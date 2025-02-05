package chapter19.classes;

import java.util.TreeSet;
import chapter19.classes.MyComp;

class CompDemo{
	public static void main(String[] args){
		MyComp comp = new MyComp();
		TreeSet<String> set = new TreeSet<String>(comp.reversed());
		
		set.add("C");
		set.add("A");
		set.add("B");
		set.add("E");
		set.add("F");
		set.add("D");
		
		for (String element: set){
			System.out.print(element + " ");
		}
		System.out.println();
	}
}