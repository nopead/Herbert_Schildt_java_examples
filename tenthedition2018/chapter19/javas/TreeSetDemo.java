package tenthedition2018.chapter19.classes;

import java.util.*;

class TreeSetDemo{
	public static void main(String[] args){
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
		System.out.println(ts);
	}
}