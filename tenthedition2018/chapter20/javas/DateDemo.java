package tenthedition2018.chapter20.classes;

import java.util.Date;

class DateDemo{
	public static void main(String[] args){
		Date date = new Date();
		
		System.out.println(date);
		
		long msec = date.getTime();
		System.out.println("Количество миллисекунд, прошедших с 1 января 1970г. по Гринвичу " + msec);
	}
}