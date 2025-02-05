package chapter19.classes;

import java.util.Comparator;

class CompThenByFirstName implements Comparator<String>{
	public int compare(String aStr, String bStr){
		return aStr.compareToIgnoreCase(bStr);
	}
}