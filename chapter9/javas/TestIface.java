package chapter9.classes;

import chapter9.classes.Client;

class TestIface{
	public static void main(String[] args){
		Callback c = new Client();
		c.callback(42);
	}
}