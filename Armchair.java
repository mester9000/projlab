package com.company;

public class Armchair extends SimpleField implements Broadcast {
	public boolean accept(Animal a) {
	    Main.log("Armchari.accept(Animal a)");
		return false;
	}
	
	public void react(Lazy l) {
	}

}
