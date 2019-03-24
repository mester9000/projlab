
package com.company;


public class Chocolatemachine extends SimpleField implements Broadcast {
	public boolean accept(Animal a) {
	    Main.log("Chocolatemahine.accept(Animal a)");
		return false;
	}
	
	public void react(Shy s) {
	}
	
	public void broadcast() {
	}
}
