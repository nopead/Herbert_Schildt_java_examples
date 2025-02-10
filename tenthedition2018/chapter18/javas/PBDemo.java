package tenthedition2018.chapter18.classes;

class PBDemo{
	public static void main(String[] args){
		try{
			ProcessBuilder pb = new ProcessBuilder("notepad.exe", "testfile");
			pb.start();
		} catch (Exception e){
			System.out.println("Ошибка запуска Notepad");
		}
	}
}