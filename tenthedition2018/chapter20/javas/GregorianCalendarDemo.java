package tenthedition2018.chapter20.classes;

import java.util.GregorianCalendar;
import java.util.Calendar;

class GregorianCalendarDemo{
	public static void main(String[] args){
	
		String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		
		int year;
		
		GregorianCalendar gcalendar = new GregorianCalendar();
		
		System.out.print("Дата: ");
		System.out.print(months[gcalendar.get(Calendar.MONTH)]);
		System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
		System.out.println(year = gcalendar.get(Calendar.YEAR));
		System.out.print("Время: "); 
		System.out.print(gcalendar.get(Calendar.HOUR) + ":" + gcalendar.get(Calendar.MINUTE) + ":" + gcalendar.get(Calendar.SECOND) + "\n");

		if (gcalendar.isLeapYear(year)){
			System.out.println("Год " + year + " високосный");
		}
		else{
			System.out.println("Год " + year + " не високосный");
		}
		
		
		
	}
}