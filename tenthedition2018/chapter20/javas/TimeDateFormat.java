package tenthedition2018.chapter20.classes;

import java.util.Formatter;
import java.util.Calendar;
import java.util.Locale;

class TimeDateFormat{
	public static void main(String[] args){
		Formatter fmt = new Formatter();
		Calendar cal = Calendar.getInstance();
		
		fmt.format("%tr", cal);
		System.out.println(fmt);
		
		fmt = new Formatter();
		fmt.format(Locale.US, "%tc", cal);
		System.out.println(fmt);
		
		fmt = new Formatter();
		fmt.format(Locale.US, "%tl:%tM", cal, cal);
		System.out.println(fmt);
		
		fmt = new Formatter();
		fmt.format(Locale.US, "%tB %tb %tm", cal, cal, cal);
		System.out.println(fmt);
		fmt.close();
	}
}