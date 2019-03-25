package com.company;




public abstract class Panda extends Animal {
	public void holdHand(Panda p){ //TODO ilyen van :D
	}

	public void unleashHand(){
	    Main.TABULATORS++;
            while (this.nextPanda!=null) {
                Main.log("Panda.unleashHand()");
                Main.TABULATORS++;
                    this.nextPanda.unleashHand();
                    this.nextPanda=null;
            }
            Main.TABULATORS--;
	}

	public abstract void act(SimpleField s);
	
	public abstract void kill();
	
	public abstract void step(SimpleField s);
	
	public abstract void addPoints();
}
