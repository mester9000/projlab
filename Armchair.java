package com.company;

public class Armchair extends SimpleField implements Broadcast{
	public boolean accept(Animal a) {
	    Main.TABULATORS++;
	    Main.log("Armchair.accept(Animal a)");
	    Main.TABULATORS--;
		return false;
	}
	@Override
	public void react(Lazy l) {
        Main.TABULATORS++;
        Main.log("Armchair.react(Shy s)");
        l.lazy();
        Main.TABULATORS--;
	}


    public void broadcast() {
        Main.TABULATORS++;
        Main.log("Armchair.broadcast()");
        this.neighbours.forEach((temp)->{
            if(temp.myAnimal!=null) {
                temp.myAnimal.act(this);
            }
        });
        Main.TABULATORS--;
    }
}
