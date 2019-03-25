package com.company;


public class Cabinet extends SimpleField {
	public Cabinet pair;

	public boolean accept(Animal a) {
	    Main.TABULATORS++;
	    Main.log("Cabinet.accept(Animal a)");
        a.mySimpleField.clear();
	    pair.setAnimal(a);
        Main.TABULATORS--;
	    return  false;
	}

    @Override
    public void setAnimal(Animal a) {
        Main.TABULATORS++;
	    super.setAnimal(a);
        Main.log("Cabinet.pair.neighbours[random].setAnimal(Animal a)");
        Main.TABULATORS--;
	}
}
