package com.company;



public class Lazy extends Panda{
    public void step(SimpleField s) {
        Main.TABULATORS++;
        Main.TABULATORS--;

    }

    public void act(SimpleField s){
        Main.TABULATORS++;
        Main.TABULATORS--;
	}

	public void lazy(){
        Main.TABULATORS++;
        Main.TABULATORS--;
	}
}