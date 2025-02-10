package tenthedition2018.chapter7.classes;

class Test4{
	int a;
	
	Test4(int i){
		a = i;
	}
	
	Test4 incrByTen(){
		Test4 temp = new Test4(a + 10);
		return temp;
	}
}