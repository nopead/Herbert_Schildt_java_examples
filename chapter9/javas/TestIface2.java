package chapter9.classes;

import chapter9.classes.Client;
import chapter9.classes.AnotherClient;

class TestIface2 {
	public static void main(String[] args){
		Callback c = new Client();
		AnotherClient ob = new AnotherClient();
		
		c.callback(42);
		
		c = ob;
		c.callback(42);
	}
}