package com.company;


import java.util.ArrayList;

public class SimpleField {
	protected Animal myAnimal=null; //kezdetben semelyik fielden nem áll állat
	private ArrayList<SimpleField> neighbours =new ArrayList<>();
	public boolean accept(Animal a) {
	    return false;
	}
	
	public void react(Lazy l) {
	}
	
	public void react(Shy s) {
	}
	
	public void react(Scary s) {
	}
	
	public void react(Orangutan o) {
	}
	
	public void clear() {
	}
	
	public void setAnimal(Animal a) {
	}
}
