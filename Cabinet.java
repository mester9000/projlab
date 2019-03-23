package com.company;


import com.company.Animal;

public class Cabinet extends SimpleField {
	private Cabinet pair;
	public boolean accept(Animal a) {
		return true;
	}
}
