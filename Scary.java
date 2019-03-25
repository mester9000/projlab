package com.company;



public class Scary extends Panda{
    public void step(SimpleField s) {
        Main.TABULATORS++;
        Main.log("Scary.step(SimpleField)");
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
        Main.log("Scary.act(SimpleField s)");
        s.react(this);
        Main.TABULATORS--;
    }

	public void scary(){
        Main.TABULATORS++;
        Main.log("Scary.scary()");
        Main.TABULATORS--;
    }

    @Override
    public void kill(){
        Main.TABULATORS++;
        Main.log("Scary.kill()");
        Main.map.endGame();
        Main.TABULATORS--;
    }
    @Override
    public void addPoints() {
        Main.TABULATORS++;
        Main.log("Scary.addPoints");
        Main.TABULATORS--;
    }
}