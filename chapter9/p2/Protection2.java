package p2;

class Protection2 extends p1.Protection{
	
	Protection2(){
		System.out.println("Конструктор, унаследованный из другого пакета");
		//System.out.println("n = " + n);
		
		//System.out.println("n_prvt = " + n_prvt);
		
		System.out.println("n_prtd = " + n_prtd);
		System.out.println("n_pblc = " + n_pblc);
	}	
}