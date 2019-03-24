package com.company;

public class Exit extends SimpleField {
	private Orangutan lastOrangutan;

	public boolean accept(Animal a) {
        Main.log("Exit.accept(Animal a)");
        a.addPoints();
		return false;
	}
}
