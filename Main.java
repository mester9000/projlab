package com.company;

import java.util.Scanner;

public class Main {
    private static int c=0;
    public static int TABULATORS = 0;
    private static Scanner scan;
    private static Map map;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        map = new Map();

        mainMenu();
        //TODO("FONTOS") breakek a usecasek végén

    }
    private static void mainMenu(){
        writeConsole("1. Orángután lépés");
        writeConsole("2. Panda lépés");
        writeConsole("3. Mezők cselekvéssel");
        c=scanChar();

        switch (c){
            case 1: orangutanStep(); break;
            case 2: pandaStep(); break;
            case 3: simpleFieldWithActs();break;
        }
    }
    private static void orangutanStep(){
        writeConsole("Orángután lépései:\n");
        writeConsole("1. Orángután pandára lép"); //TODO ez sehogy sem működik :D
        writeConsole("2 .Orángután orángutánra lép");
        writeConsole("3. Orángután karosszékre lép");
        writeConsole("4. Orángután csokiautomatára lép");
        writeConsole("5. Orángután játékgépre lép");
        writeConsole("6. Orángután szekrénybe lép");
        writeConsole("7. Orángután törékenycsempére lép");
        writeConsole("8. Orángután üres mezőre lép");
        writeConsole("9. Orángután bejáratra lép");
        writeConsole("10.Orángután kijáratra lép");
        writeConsole("11.Orángután meghallja a csokiautomatát");
        writeConsole("12.Orángután meghallja a játékgépet");
        writeConsole("13.Orángután karosszék közelébe kerül");

        c=scanChar();
        switch (c){
            case 1:  orangutanOnPanda();break; //TODO nem működik
            case 2:  orangutanOnOrangutan();break;
            case 3:  orangutanOnArmchair();break;
            case 4:  orangutanOnChocolatemachine();break;
            case 5:  orangutanOnSlotmachine();break;
            case 6:  orangutanOnCabinet();break;
            case 7:  orangutanOnWeakTile();break;
            case 8:  orangutanOnEmptyField();break;
            case 9:  orangutanOnEntrance();break;
            case 10: orangutanOnExit();break;
            case 11: orangutanHearChocolatemachine();break;
        }
    }
    private static void pandaStep(){
        writeConsole("Panda fajták:\n");
        writeConsole("1.Lusta panda");
        writeConsole("2.Ijedős panda");
        writeConsole("3.Félénk panda");

        c=scanChar();
        switch (c){
            case 1: lazyPanda();break;
            case 2: scaryPanda();break;
            case 3: shyPanda();break;
        }
    }
    private static void simpleFieldWithActs(){
        writeConsole("Mezők cselekvése:\n");
        writeConsole("1. Játékgép csilingel");
        writeConsole("2. Csokiautomata csilingel");
        c = scanChar();
        switch (c){
            case 1:
            case 2:
        }
    }

    private static void lazyPanda(){
        writePandaActs("Lusta panda");
        c = scanChar();
    }
    private static void scaryPanda(){
        writePandaActs("Ijedős panda");
        c = scanChar();
    }
    private static void shyPanda(){
        writePandaActs("Félénk panda");
        c = scanChar();
    }



    private static void orangutanOnPanda(){//TODO nem működik
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(new Orangutan());
        map.animals.add(new Lazy());
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new SimpleField());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void orangutanOnOrangutan(){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(new Orangutan());
        map.animals.add(new Orangutan());
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new SimpleField());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void orangutanOnArmchair(){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(new Orangutan());
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new Armchair());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void orangutanOnChocolatemachine(){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(new Orangutan());
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new Chocolatemachine());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void orangutanOnSlotmachine(){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(new Orangutan());
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new Slotmachine());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void orangutanOnCabinet(){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(new Orangutan());
        map.simpleFields.add(new SimpleField());
        Cabinet a = new Cabinet();
        Cabinet b = new Cabinet();
        a.pair = b;
        b.pair = a;
        map.simpleFields.add(a);
        map.simpleFields.add(b);
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void orangutanOnWeakTile(){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(new Orangutan());
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new WeakTile());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void orangutanOnEmptyField(){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(new Orangutan());
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new SimpleField());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void orangutanOnEntrance(){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(new Orangutan());
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new Entrance());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void orangutanOnExit(){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(new Orangutan());
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new Exit());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void orangutanHearChocolatemachine(){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(new Orangutan());
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new Chocolatemachine());
        setMap();
        //TODO nem tudom hogyan kell indítani +elméletileg egy broadcast indítja de nem tudom hogy hogyan 
    }

    private static void setMap(){
        map.simpleFields.get(0).myAnimal = map.animals.get(0);
        map.animals.get(0).mySimpleField =map.simpleFields.get(0);
        map.simpleFields.get(0).myAnimal = map.animals.get(0);
        if(map.animals.size()!=1) {
            map.animals.get(1).mySimpleField = map.simpleFields.get(1);
            map.simpleFields.get(1).myAnimal = map.animals.get(1);
        }
        map.simpleFields.get(0).neighbours.add(map.simpleFields.get(1));
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(0));
    }
    private static void writePandaActs(String pandaSpecies){
        writeConsole(pandaSpecies+" lépései:\n");
        writeConsole("1.  "+pandaSpecies+" orángutánra lép");
        writeConsole("2.  "+pandaSpecies+" pandára lép");
        writeConsole("3.  "+pandaSpecies+" csokiautomatára lép");
        writeConsole("4.  "+pandaSpecies+" karosszékre lép");
        writeConsole("5.  "+pandaSpecies+" játékgépre lép");
        writeConsole("6.  "+pandaSpecies+" szekrénybe lép");
        writeConsole("7.  "+pandaSpecies+" törékeny csempére lép");
        writeConsole("8.  "+pandaSpecies+" üres mezőre lép");
        writeConsole("9.  "+pandaSpecies+" bejáratra lép");
        writeConsole("10  "+pandaSpecies+" kijáratra lép");
        writeConsole("11. "+pandaSpecies+" elengedi egy másik panda kezét");
        writeConsole("12. "+pandaSpecies+" meghallja a csokiautomata sípolását");
        writeConsole("13. "+pandaSpecies+" meghallja a játékgép sípolását");
        writeConsole("14. "+pandaSpecies+" közel kerül egy karosszékhez");
    }
    private static int scanChar(){
        return scan.nextInt();
    }
    private static void writeConsole(String text){
        System.out.println(text);
    }


    public static void log(String text){
        for(int i =0;i<TABULATORS;i++){
            System.out.print("\t");
        }
        System.out.print(text+"\n");
    }
}
