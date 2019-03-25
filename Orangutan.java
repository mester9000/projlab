package com.company;


public class Orangutan extends Animal {
	private int points=0;
	private boolean alive=true;
	public SimpleField EntrancePLace;
	public void catchPanda(Panda p) {
	}
	

	public void addPoints() {
        Main.TABULATORS++;
	    Main.log("Orangutan.addPoints()");
	    this.mySimpleField.clear();
	    if(this.nextPanda==null){//ha már nincs mögötte panda
	        this.EntrancePLace.setAnimal(this);
        }
        Main.TABULATORS--;
	}
	
	public void act(SimpleField s) {
        Main.TABULATORS++;
        Main.log("Orangutan.act(SimpleField s)");
        s.react(this);
        Main.TABULATORS--;
	}
	
	public void kill() {
        Main.TABULATORS++;
	    Main.log("Orangutan.kill()");
	    Main.map.endGame();
	    //TODO valahogy meg kellene itt hívni az endgame függvényt, amit ugye nem látunk :/
        Main.TABULATORS--;
	}
	

	public void step(SimpleField s) {
        Main.TABULATORS++;
	    Main.log("Orangutan.step(SimpleField)");
	   	if(s.accept(this)){//odaléphet
			this.mySimpleField.clear();
			s.setAnimal(this);
		}
		else{//nem léphet oda

        }
        Main.TABULATORS--;
	}

}
