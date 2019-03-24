package com.company;

public class Exit extends SimpleField {
	private Orangutan lastOrangutan;

	public boolean accept(Animal a) {
        Main.TABULATORS++;
        Main.log("Exit.accept(Animal a)");
        a.addPoints();
        Main.TABULATORS--;
		return false;
	}
}
