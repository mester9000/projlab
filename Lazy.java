package com.company;



public class Lazy extends Panda{
    public void step(SimpleField s) {
        Main.TABULATORS++;
        Main.log("Lazy.step(SimpleField)");
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
        Main.log("Laty.act(SimpleField s)");
        s.react(this);
        Main.TABULATORS--;
	}

	public void lazy(){
        Main.TABULATORS++;
        Main.log("Lazy.lazy()");
        Main.TABULATORS--;
	}
	@Override
    public void kill(){
        Main.TABULATORS++;
        Main.log("Lazy.kill()");
        Main.map.endGame();
        Main.TABULATORS--;
    }

    @Override
    public void addPoints() {
        Main.TABULATORS++;
        Main.log("Lazy.addPoints");
        Main.TABULATORS--;
    }
}