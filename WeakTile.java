package com.company;

public class WeakTile extends SimpleField {
	private int lifetime;
	public void dec() {
	}
	
	public boolean accept(Animal a) {
		return false;
	}
}
