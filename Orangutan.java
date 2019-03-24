package com.company;



import com.company.Animal;
import com.company.Entrance;

public class Orangutan extends Animal {
	private int points=0;
	private boolean alive=true;
	public Entrance EntrancePLace;
	public void catchPanda(Panda p) {
	}
	

	public void addPoints() {
	}
	
	public void act(SimpleField s) {
	}
	
	public void kill() {
	    Main.log("Orangutan.kill()");
	    //TODO valahogy meg kellene itt hívni az endgame függvényt, amit ugye nem látunk :/

	}
	

	public void step(SimpleField s) {
	    Main.log("Orangutan.step(SimpleField)");
	   	if(s.accept(this)){//odaléphet
			this.mySimpleField.clear();
			s.setAnimal(this);
		}
		else{//nem léphet oda
		    Main.log("Nem léphettél oda, mert az adott mezőn nem üres"); //TODO ha cabinet van akkor ez nem jó,lehet hogy nem leszképernyőre logolva
        }

	}

}
