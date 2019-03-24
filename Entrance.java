package com.company;

public class Entrance extends SimpleField {
	public boolean accept(Animal a) {
	    Main.log("Entrance.accept(Animal a)");
	return false;
	}
}
