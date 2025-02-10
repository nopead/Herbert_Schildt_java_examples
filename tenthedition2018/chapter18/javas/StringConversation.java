package tenthedition2018.chapter18.classes;

class StringConversation{
	public static void main(String[] args){
		int num = 19648;
		System.out.println("Число " + num + " в двоичном формате: " + Integer.toBinaryString(num));
		System.out.println("Число " + num + " в восьмеричном формате: " + Integer.toOctalString(num));
		System.out.println("Число " + num + " в шестнадцатеричном формате: " + Integer.toHexString(num));
	}
}