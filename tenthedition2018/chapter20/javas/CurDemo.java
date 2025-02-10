package tenthedition2018.chapter20.classes;

import java.util.Currency;
import java.util.Locale;

class CurDemo{
	public static void main(String[] args){
		Currency c;
		
		c = Currency.getInstance(Locale.US);
		
		System.out.println("Символ: " + c.getSymbol());
		System.out.println("Количество цифр в дробной части числа по умолчанию: " + c.getDefaultFractionDigits());
		
		System.out.println("DisplayName: " + c.getDisplayName());
		System.out.println("CurrencyCode: " + c.getCurrencyCode());
		
	}
}