package com.company;


public class Cabinet extends SimpleField {
	public Cabinet pair;

	public boolean accept(Animal a) {
	    Main.log("Cabinet.accept(Animal a)");

        a.mySimpleField.clear();
	    pair.setAnimal(a);
		return  false;
	}

    @Override
    public void setAnimal(Animal a) {
        super.setAnimal(a);
        Main.log("Cabinet.pair.setAnimal(Animal a)");
    }
}
