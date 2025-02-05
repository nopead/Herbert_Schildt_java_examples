package chapter18.classes;

class VerDemo{
	public static void main(String[] args){
		Runtime.Version ver = Runtime.version();
		
		System.out.println("Основной номер версии: " + ver.major());
		System.out.println("Дополнительный номер версии: " + ver.minor());
		System.out.println("Номер версии системы защиты: " + ver.security());
	}
}