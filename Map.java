package com.company;



import java.util.*;

/*public class Map extends SimpleField {
	private int players;
	public ArrayList<Animal> animals= new ArrayList<>();
	public ArrayList<SimpleField> simpleFields = new ArrayList<>();
	public void init(int Player,int SimpleFiled,int Animals) {
		players = Player;
		int r;
		for(int i=0;i<Animals;i++){//TODO ez a feltöltés nem a legszebb
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

		for(int i =0; i<SimpleFiled;i++){//TODO itt sem
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
		//TODO valahgyan be kell állítani, a szomszédokat is majd.
		//TODO az állatokat rá kell tenni a pályára

	}*/
	
	//Javított verzió
	public class Map{
		private int players;
		public ArrayList<Animal> animals= new ArrayList<>();
		public ArrayList<SimpleField> simpleFields = new ArrayList<>();
		public void init(int SimpleFields, int WeakTiles, int numOfPlayers){
			
			players = numOfPlayers;
			
			//Entrance a 0. eleme a SimpleFields-nek
			simpleFields.add(new Entrance());
			
			for(int i = 0; i < 3; i++)
				animals.add(new Scary());
			
			for(int i = 0; i < 3; i++)
				animals.add(new Lazy());
			
			for(int i = 0; i < 3; i++)
				animals.add(new Shy());
			
			for(int i = 0; i < numOfPlayers; i++)
				animals.add(new Orangutan());
			
			for(int i = 0; i < SimpleFields; i++)
				simpleFields.add(new SimpleField());
			
			for(int i = 0; i < WeakTiles; i++)
				simpleFields.add(new WeakTile());
			
			for(int i = 0; i < 3; i++)
				simpleFields.add(new Chocolatemachine());
			
			for(int i = 0; i < 3; i++)
				simpleFields.add(new Slotmachine());
			
			for(int i = 0; i < 3; i++)
				simpleFields.add(new Armchair());
			
			for(int i = 0; i < 3; i++)
				simpleFields.add(new SimpleField());
		
	}
	
	public void endGame() {
		if(animals.size() == 0 || simpleFields.size() == 0 || players==0){
			System.out.println("Vege a jateknak"); //TODO ide nem ez kell majd +feltételek nem biztos hogy megfelelőek
		}
	}
}
