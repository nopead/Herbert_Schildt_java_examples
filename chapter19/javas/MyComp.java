package chapter19.classes;

import java.util.Comparator;

class MyComp implements Comparator<String>{
	public int compare(String aStr, String bStr){
		return aStr.compareTo(bStr);
	}
}