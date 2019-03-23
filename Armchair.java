package com.company;

public class Armchair extends SimpleField implements Broadcast {
	public boolean accept(Animal a) {
		return true;
	}
	
	public void react(Lazy l) {
	}

}
