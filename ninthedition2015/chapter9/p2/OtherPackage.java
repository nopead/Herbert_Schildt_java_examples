package ninthedition2015.chapter9.p2;

class OtherPackage{
	OtherPackage() {
		p1.Protection p = new p1.Protection();
		
		System.out.println("Конструктор из другого пакета");
		//System.out.println("n = " + p.n);
		
		//System.out.println("n_prvt = " + p.n_prvt);
		
		//System.out.println("n_prtd = " + p.n_prtd);
		
		System.out.println("n_pblc = " + p.n_pblc);
	}
}