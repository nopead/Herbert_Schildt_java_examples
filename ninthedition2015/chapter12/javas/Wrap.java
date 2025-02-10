package ninthedition2015.chapter12.classes;

class Wrap{
	public static void main(String args[]){
		Integer iObj = Integer.valueOf(100);
		
		int i = iObj.intValue();
		
		System.out.println(i + " " + iObj);
	}
}