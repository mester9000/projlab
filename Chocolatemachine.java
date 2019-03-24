
package com.company;


public class Chocolatemachine extends SimpleField implements Broadcast {
	public boolean accept(Animal a) {
        Main.TABULATORS++;
	    Main.log("Chocolatemahine.accept(Animal a)");
        Main.TABULATORS--;
	    return false;
	}
	
	public void react(Shy s) {
        Main.TABULATORS++;
        Main.TABULATORS--;
	}
	
	public void broadcast() {
        Main.TABULATORS++;
        Main.TABULATORS--;
	}
}
