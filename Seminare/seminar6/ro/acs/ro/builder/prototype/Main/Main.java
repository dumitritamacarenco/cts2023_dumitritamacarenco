package ro.acs.ro.builder.prototype.Main;

import ro.acs.ro.builder.prototype.AbstractPrototype;
import ro.acs.ro.builder.prototype.Client;

public class Main {
	
	public void main(String[] args) throws CloneNotSupportedException {
//		AbstractPrototype client = new Client("Andrei", "072453642", "andrei@gmail.com");
//		AbstractPrototype client = clientPrototye.createCopy();
//		
//		System.out.println(client.toString());
		
		AbstractPrototype clientPrototye = new Client("Andrei","0734934","aaa@aa");
		
		AbstractPrototype client = clientPrototye.createCopy();
		
		System.out.println(client.toString());
		
	}

}
