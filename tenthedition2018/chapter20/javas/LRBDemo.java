package tenthedition2018.chapter20.classes;

import java.util.ResourceBundle;
import java.util.Locale;
import tenthedition2018.chapter20.classes.SampleRB;
import tenthedition2018.chapter20.classes.SampleRB_de;

class LRBDemo {
	public static void main(String[] args){
		ResourceBundle rb = ResourceBundle.getBundle("tenthedition2018.chapter20.classes.SampleRB", Locale.ENGLISH);
		
		System.out.println("Английская версия программы: ");
		System.out.println("Строка по ключу title: " + rb.getString("title"));
		System.out.println("Строка по ключу StopText: " + rb.getString("StopText"));
		System.out.println("Строка по ключу StartText: " + rb.getString("StartText"));
		
		System.out.println();
		
		rb = ResourceBundle.getBundle("tenthedition2018.chapter20.classes.SampleRB_de", Locale.GERMAN);
		System.out.println("Немецкая версия программы: ");
		System.out.println("Строка по ключу title: " + rb.getString("title"));
		System.out.println("Строка по ключу StopText: " + rb.getString("StopText"));
		System.out.println("Строка по ключу StartText: " + rb.getString("StartText"));
	}
}