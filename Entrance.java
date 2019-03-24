package com.company;

public class Entrance extends SimpleField {
	public boolean accept(Animal a) {
        Main.TABULATORS++;
	    Main.log("Entrance.accept(Animal a)");
        Main.TABULATORS--;
	return false;
	}
}
