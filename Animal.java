package com.company;

public abstract class Animal {
	public SimpleField mySimpleField;
	public Panda nextPanda;
	public abstract void kill();
	public abstract void step(SimpleField s);
	public abstract void addPoints();
	public abstract void act(SimpleField s);
}
