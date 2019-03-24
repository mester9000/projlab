package com.company;

import java.io.IOException;

public class WeakTile extends SimpleField {
	private int lifetime=0;
	public void dec() {
	    Main.log("WeakTile.dec()");
	}
	public boolean accept(Animal a) {
        return this.myAnimal == null;
    }

    @Override
    public void setAnimal(Animal a) {
        a.mySimpleField.clear();
	    Main.log("Weaktile.setAnimal(Animal a)");
        this.dec();
        System.out.print("A törékeny csempe törött?(I/N)");
        char c=0;
        try {
            c = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(c=='i'){
           a.kill();
        }
    }
}
