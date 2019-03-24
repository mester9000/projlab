package com.company;



public class Scary extends Panda{
    public void step(SimpleField s) {
        Main.TABULATORS++;
        Main.TABULATORS--;
    }

    public void act(SimpleField s){
        Main.TABULATORS++;
        Main.TABULATORS--;
    }

	public void scary(){
        Main.TABULATORS++;
        Main.TABULATORS--;
    }
}