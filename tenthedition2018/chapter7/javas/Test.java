package tenthedition2018.chapter7.classes;

class Test {
	int a;
	int b;
	
	Test(int i, int j) {
		a = i;
		b = j;
	}
	
	boolean equalTo(Test obj) {
		return (obj.a == a && obj.b == b) ? true : false;
	}
}