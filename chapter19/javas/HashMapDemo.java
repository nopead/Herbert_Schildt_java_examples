package chapter19.classes;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

class HashMapDemo{
	public static void main(String[] args){
		HashMap<String, Double> hm = new HashMap<>();
		
		hm.put("Джон Сноу", new Double(3434.34));
		hm.put("Том Смит", new Double(123.22));
		hm.put("Джейн Бейкер", new Double(1378.00));
		hm.put("Тод Холл", new Double(99.22));
		hm.put("Ральф Смит", new Double(-19.08));
		
		Set<Map.Entry<String, Double>> set = hm.entrySet();
		
		for (Map.Entry<String, Double> map_el: set){
			System.out.println("K: " + map_el.getKey() + "-- V: " + map_el.getValue());
		}
		
		double balance = hm.get("Джон Сноу");
		hm.put("Джон Сноу", balance + 1000);
		System.out.println("Новый остаток на счете Джона Сноу: " + hm.get("Джон Сноу"));
	}
}