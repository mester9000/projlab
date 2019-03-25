
package com.company;




public class Chocolatemachine extends SimpleField implements Broadcast {
	public boolean accept(Animal a) {
        Main.TABULATORS++;
	    Main.log("Chocolatemahine.accept(Animal a)");
        Main.TABULATORS--;
	    return false;
	}
	@Override
	public void react(Shy s) {
        Main.TABULATORS++;
        Main.log("Chocolatemachine.react(Shy s)");
        s.shy();
        Main.TABULATORS--;
	}

	public void broadcast() {
        Main.TABULATORS++;
        Main.log("Chocolatemachine.broadcast()");
        this.neighbours.forEach((temp)->{
            if(temp.myAnimal!=null) {
                temp.myAnimal.act(this);
            }
        });
        Main.TABULATORS--;
	}
}
