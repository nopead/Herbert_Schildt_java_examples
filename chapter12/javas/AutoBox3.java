class AutoBox3{
	public static void main(String args[]){
		Integer iObj1, iObj2;
		int i;
		
		iObj1 = 100;
		System.out.println("iObj1 = " + iObj1);
		
		++iObj1;
		System.out.println("++iObj1 = " + iObj1);
		
		iObj2 = iObj1 + (iObj1 / 3);
		System.out.println("iObj1 + (iObj1 / 3) = " + iObj2);
		
		i = iObj1 + (iObj1 / 3);
		System.out.println("i = " + i);
	}
}