package chapter7.classes;

class VarArgs3 {
	static void vaTest(int ... i){
		System.out.println("vaTest с аргументами переменной длины типа int");
		for (int val: i) {
			System.out.print("аргумент i: " + val + "\n");
		}
		System.out.println();
	}
	static void vaTest(boolean ... b){
		System.out.println("vaTest с аргументами переменной длины типа boolean");
		for (boolean val: b) {
			System.out.print("аргумент b: " + val + "\n");
		}
		System.out.println();
	}
	static void vaTest(String msg, int ... i){
		System.out.println("vaTest со строковым аргументом и аргументами переменной длины типа int");
		System.out.println("msg: " + msg);
		for (int val: i) {
			System.out.print("аргумент i: " + val + "\n");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		vaTest(1, 2, 3);
		vaTest("Сообщение", 1, 2, 3);
		vaTest(true, false, true);
	}
}