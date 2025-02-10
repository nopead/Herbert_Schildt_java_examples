package tenthedition2018.chapter20.classes;

import java.util.Formatter;
import java.util.Calendar;
import java.util.Locale;

class FormatDemo6{
	public static void main(String[] args){
		Formatter fmt = new Formatter();
		Calendar cal = Calendar.getInstance();
		
		fmt.format(Locale.US, "Today is day %te of %<tB, %<tY", cal);
		System.out.println(fmt);
		fmt.close();
	}
}