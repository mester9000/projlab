package com.company;


public class Cabinet extends SimpleField {
	public Cabinet pair;

	public boolean accept(Animal a) {
	    System.out.println("Cabinet.accept.step");
		return  false;
	}

    @Override
    public void setAnimal(Animal a) {
        pair.setAnimal(a);
    }
}
