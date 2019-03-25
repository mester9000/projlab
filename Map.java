package com.company;



import java.util.*;

public class Map extends SimpleField {
	private int players;
	public ArrayList<Animal> animals= new ArrayList<>();
	public ArrayList<SimpleField> simpleFields = new ArrayList<>();
	public void init(int Player,int SimpleFiled,int Animals) {//a skeleton vázban erre nincsen szükség
		players = Player;
		int r;
		for(int i=0;i<Animals;i++){
			r=(int)(Math.random()*3);
			if(r==0) {
				animals.add(new Scary());
			}
			else if(r==1){
				animals.add(new Shy());
			}
			else {
				animals.add(new Lazy());
			}
		}

		for(int i =0; i<SimpleFiled;i++){
			r=(int)(Math.random()*7);
			if(r==0){
				simpleFields.add(new Chocolatemachine());
			}
			else if(r==1){
				simpleFields.add(new Slotmachine());
			}
			else if (r==2){
				simpleFields.add(new Armchair());
			}
			else {
				simpleFields.add(new SimpleField());
			}
		}
		for (int i=0;i<players;i++){
			animals.add(new Orangutan());
		}
	}
	
	public void endGame() {
        Main.TABULATORS++;
        Main.log("Map.endGame()");
        Main.TABULATORS--;
	}
}
