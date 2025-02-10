package ninthedition2015.chapter9.classes;

import ninthedition2015.chapter9.classes.Client;
import ninthedition2015.chapter9.classes.AnotherClient;

class TestIface2 {
	public static void main(String[] args){
		Callback c = new Client();
		AnotherClient ob = new AnotherClient();
		
		c.callback(42);
		
		c = ob;
		c.callback(42);
	}
}