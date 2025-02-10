package ninthedition2015.chapter9.p1;

class SamePackage {
	
	SamePackage() { 
		Protection p = new Protection();
		System.out.println("Конструктор этого же пакета");
		System.out.println("n = " + p.n);
		
		//System.out.println("n = " + p.prvt);
		
		System.out.println("n = " + p.n_prtd);
		System.out.println("n = " + p.n_pblc);
	}
}