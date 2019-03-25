package com.company;


import java.util.ArrayList;

public class SimpleField {
	protected Animal myAnimal=null; //kezdetben semelyik fielden nem áll állat
	protected ArrayList<SimpleField> neighbours =new ArrayList<>();
	public boolean accept(Animal a) {
	    Main.TABULATORS++;
	    Main.log("SimpleField.Accept(Animal a)");
        Main.TABULATORS--;
	    return this.myAnimal == null;
	}
	
	public void react(Lazy l) {
	    Main.TABULATORS++;
	    Main.log("SimpleField.react(Lazy l");
	    Main.TABULATORS--;
	}
	
	public void react(Shy s) {
        Main.TABULATORS++;
        Main.log("SimpleField.react(Shy s");
        Main.TABULATORS--;
	}
	
	public void react(Scary s) {
        Main.TABULATORS++;
        Main.log("SimpleField.react(Scary s)");
        Main.TABULATORS--;
	}
	
	public void react(Orangutan o) {
        Main.TABULATORS++;
        Main.log("SimpleField.react(Orangutan o)");
        Main.TABULATORS--;
	}
	
	public void clear() {
	    Main.TABULATORS++;
            Main.log("SimpleField.clear()");
	    Main.TABULATORS--;
	}
	
	public void setAnimal(Animal a) {
	    Main.TABULATORS++;
	    Main.log("SimpleField.setAnimal(Animal a)");
	    Main.TABULATORS--;
	}
}
