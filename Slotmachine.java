package com.company;




public class Slotmachine extends SimpleField implements Broadcast {
	public boolean accept(Animal a) {
        Main.TABULATORS++;
        Main.log("Slotmachine.accept(Animal a)");
        Main.TABULATORS--;
	    return false;
	}
	@Override
	public void react(Scary s) {
	    Main.TABULATORS++;
        Main.log("Slotmachine.react(Shy s)");
        s.scary();
        Main.TABULATORS--;
	}
	
	public void broadcast() {
	    Main.TABULATORS++;
        Main.log("Slotmachine.broadcast()");
        this.neighbours.forEach((temp)->{
            if(temp.myAnimal!=null) {
                temp.myAnimal.act(this);
            }
        });
        Main.TABULATORS--;
	}
}
