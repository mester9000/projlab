package com.company;



public class Shy extends Panda{
    public void step(SimpleField s) {
        Main.TABULATORS++;
        Main.TABULATORS--;
    }

    public void act(SimpleField s){
        Main.TABULATORS++;
        Main.TABULATORS--;}

	public void shy(){
        Main.TABULATORS++;
        Main.TABULATORS--;
	}
}