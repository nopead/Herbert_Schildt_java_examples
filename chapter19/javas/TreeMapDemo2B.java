package chapter19.classes;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Comparator;

class TreeMapDemo2B{
	public static void main(String[] args){
		
		TreeMap<String, Double> tm = new TreeMap<String, Double>(
															((Comparator<String>)(aStr, bStr) -> aStr.substring(aStr.lastIndexOf(' ')).compareTo(bStr.substring(bStr.lastIndexOf(' '))))
															.thenComparing((Comparator<String>)(aStr, bStr) -> aStr.compareTo(bStr))
															);
		
		tm.put("Джон Доу", Double.valueOf("3434.34"));
		tm.put("Том Смит", Double.valueOf("123.22"));
		tm.put("Джейн Бейкер", Double.valueOf("1378.00"));
		tm.put("Тод Халл", Double.valueOf("99.22"));
		tm.put("Ральф Смит", Double.valueOf("-19.08"));
		
		Set<Map.Entry<String, Double>> set = tm.entrySet();

		for (Map.Entry<String, Double> map_el: set){
			System.out.println(map_el.getKey() + " -- " + map_el.getValue());
		}
		
		double balance = tm.get("Джон Доу");
		tm.put("Джон Доу", balance + 1000);
		System.out.println("Баланс Джона Доу после добавления: " + tm.get("Джон Доу"));
	}
}