package chapter9.classes;

import chapter9.classes.FixedStack;

class StackWithExceptionTest{
	public static void main(String[] args){
		FixedStack fs = new FixedStack(8);
		for (int i = 0; i < fs.Length(); i++){
			fs.push(i);
		}
		
		IntStack ifstck = fs;
		
		try{
			ifstck.clear();
		}
		catch (UnsupportedOperationException e){
			System.out.println(e.getMessage());
		}
	}
}