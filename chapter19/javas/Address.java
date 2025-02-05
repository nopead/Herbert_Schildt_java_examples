package chapter19.classes;

class Address{
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	
	Address(String nm, String strt, String ct, String st, String cd){
		name = nm;
		street = strt;
		city = ct;
		state = st;
		code = cd;
	}
	
	public String toString(){
		return name + "\n" + street + "\n" + city + "\n" + state + "\n" + code;
	}
}