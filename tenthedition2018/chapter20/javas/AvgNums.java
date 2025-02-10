package tenthedition2018.chapter20.classes;

import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

class AvgNums{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in, "cp866");
		sc.useLocale(Locale.US);

		int count = 0;
		double sum = 0.0;
		
		System.out.println("Write a next double number to sum");
		
		while(sc.hasNext()){
			if(sc.hasNextDouble()){
				sum += sc.nextDouble();
				count++;
			}
			else{
				String str = sc.next();
				if(str.equals("готово")){
					break;
				}
				else{
					System.out.println("Format Error");
					return;
				}
			}
		}
		sc.close();
		System.out.println("nums average: " + (sum/count));
	}
}