package tenthedition2018.chapter19.classes;

import java.util.Enumeration;
import java.util.Hashtable;

class HashTableDemo{
	public static void main(String[] args){
		Hashtable<String, Double> balance = new Hashtable<String, Double>();
		
		Enumeration<String> names;
		
		String str;
		Double bal;
		
		balance.put("Джон Доу", 3434.34);
		balance.put("Том Смит", 123.22);
		balance.put("Джейн Бейкер", 1378.00);
		balance.put("Тод Холл", 99.22);
		balance.put("Ральф Смит", -19.08);
		
		names = balance.keys();
		while(names.hasMoreElements()){
			str = names.nextElement();
			System.out.println(str + ": " + balance.get(str));
		}
		
		System.out.println();
		
		bal = balance.get("Джон Доу");
		balance.put("Джон Доу", bal + 1000);
		System.out.println("Новый остаток на счете Джона Доу: " + balance.get("Джон Доу"));
	}
}