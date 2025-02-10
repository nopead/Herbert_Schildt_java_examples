package ninthedition2015.chapter9.p1;

class Derived extends Protection{
	Derived() {
		System.out.println("Конструктор подкласса");
		System.out.println("n = " + n);
		
		//System.out.println("n_prvt " + n_prvt);
		
		System.out.println("n_prtd = " + n_prtd);
		System.out.println("n_pblc = " + n_pblc);
	}
}