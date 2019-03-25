package com.company;



public class Shy extends Panda{
    public void step(SimpleField s) {
        Main.TABULATORS++;
        Main.log("Shy.step(SimpleField)");
        if(s.accept(this)){//odaléphet
            this.mySimpleField.clear();
            s.setAnimal(this);
        }
        else{//nem léphet oda

        }
        Main.TABULATORS--;
    }

    public void act(SimpleField s){
        Main.TABULATORS++;
        Main.log("Shy.act(SimpleField s)");
        s.react(this);
        Main.TABULATORS--;}

	public void shy(){
        Main.TABULATORS++;
        Main.log("Shy.shy()");
        Main.TABULATORS--;
	}

    @Override
    public void kill(){
        Main.TABULATORS++;
        Main.log("Shy.kill()");
        Main.map.endGame();
        Main.TABULATORS--;
    }
    @Override
    public void addPoints() {
        Main.TABULATORS++;
        Main.log("Shy.addPoints");
        Main.TABULATORS--;
    }
}