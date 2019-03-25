package com.company;

import java.io.IOException;

public class WeakTile extends SimpleField {
	private int lifetime=0;

	public void dec()
    {
	    Main.TABULATORS++;
	    Main.log("WeakTile.dec()");
	    Main.TABULATORS--;
    }
	public boolean accept(Animal a) {
	    Main.TABULATORS++;
	    Main.log("Weaktile.accept(Animal a)");
	    Main.TABULATORS--;
        return this.myAnimal == null;
    }

    @Override
    public void setAnimal(Animal a) {
	    Main.TABULATORS++;
        a.mySimpleField.clear();
	    Main.log("Weaktile.setAnimal(Animal a)");
        this.dec();
        System.out.print("A törékeny csempe törött?(I/N)");
        char c=0;
        try {
            c = (char) System.in.read();
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(c=='i'){
           a.kill();
        }
        Main.TABULATORS--;
    }
}
