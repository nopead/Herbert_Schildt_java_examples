package tenthedition2018.chapter7.classes;

class Test3{
	int a;
	int b;
	
	Test3(int i, int j){
		a = i;
		b = j;
	}
	
	void meth(Test3 obj){
		obj.a *= 2;
		obj.b /= 2;
	}
}