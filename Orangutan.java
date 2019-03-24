package com.company;



import com.company.Animal;
import com.company.Entrance;

public class Orangutan extends Animal {
	private int points;
	private boolean alive;
	public Entrance EntrancePLace;
	public void catchPanda(Panda p) {
	}
	

	public void addPoints() {
	}
	
	public void act(SimpleField s) {
	}
	
	public void kill() {
	}
	

	public void step(SimpleField s) {
	    System.out.println("Orangutan.step(simpleField)");
		if(s.accept(this)){//odaléphet
			this.mySimpleField.clear();
			s.setAnimal(this);
		}
		else{//nem léphet oda
		    System.out.println("");
		    System.out.println("Nem léphettél oda, mert az adott mezőn nem üres");
        }

	}

}
