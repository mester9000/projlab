package com.company;

public class Armchair extends SimpleField implements Broadcast {
	public boolean accept(Animal a) {
	    Main.TABULATORS++;
	    Main.log("Armchari.accept(Animal a)");
	    Main.TABULATORS--;
		return false;
	}
	
	public void react(Lazy l) {
	}

}
