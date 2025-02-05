class AutoBox2 {
	
	static int m(Integer v){
		return v;
	}
	
	public static void main(String args[]){
		Integer iObj = m(100);
		
		System.out.println(iObj);
	}
}