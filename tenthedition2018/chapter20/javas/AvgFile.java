package tenthedition2018.chapter20.classes;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

class AvgFile{
	public static void main(String[] args) throws IOException{
		int count = 0;
		double sum = 0;
		
		String file_path = "C:/Users/smirnov.ai.kst/Documents/JAVA_1/tenthedition2018/chapter20/assets/test.txt";
		
		try(FileWriter fw = new FileWriter(new File(file_path))){
			fw.write("2 3.4 5 6 7.4 9.1 10.5 exit");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		FileReader fr = new FileReader(new File(file_path));
		try(Scanner sc = new Scanner(fr)){
			sc.useLocale(Locale.US);
			while(sc.hasNext()){
				if(sc.hasNextDouble()){
					sum += sc.nextDouble();
					count++;
				}
				else{
					String str = sc.next();
					if(str.equals("exit")){
						break;
					}
					else{
						System.out.println("Ошибка формата файла");
						return;
					}
				}
			}
			System.out.println("Среднее число по файлу: " + (sum / count));
		}
		catch (Exception ex){
			System.out.println(ex);
		}	
	}
}