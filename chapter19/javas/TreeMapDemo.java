package chapter19.classes;

import java.util.TreeMap;

class TreeMapDemo{
	public static void main(String[] args){
		TreeMap<String, Double> tm = new TreeMap<>();
		
		tm.put("Джон Сноу", new Double(3434.34));
		tm.put("Том Смит", new Double(123.22));
		tm.put("Джейн Бейкер", new Double(1378.00));
		tm.put("Тод Халл", new Double(99.22));
		tm.put("Ральф Смит", new Double(-19.08));
	}
}