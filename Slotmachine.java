package com.company;




public class Slotmachine extends SimpleField implements Broadcast {
	public boolean accept(Animal a) {
        Main.TABULATORS++;
        Main.TABULATORS--;
	    return false;
	}
	
	public void react(Scary s) {
	    Main.TABULATORS++;
        Main.TABULATORS--;
	}
	
	public void broadcast() {
	    Main.TABULATORS++;
        Main.TABULATORS--;
	}
}
