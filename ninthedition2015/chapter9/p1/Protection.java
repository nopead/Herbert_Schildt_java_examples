package ninthedition2015.chapter9.p1;

public class Protection{
	
	int n = 1;
	private int n_prvt = 2;
	protected int n_prtd = 3;
	public int n_pblc = 4;
	
	public Protection(){
		System.out.println("Конструктор базового класса, dsada");
		System.out.println("n = " + n);
		System.out.println("n_prvt = " + n_prvt);
		System.out.println("n_prtd = " + n_prtd);
		System.out.println("n_pblc = " + n_pblc);
	}	
}