package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static int c=0;
    public static int TABULATORS = 0;
    private static Scanner scan;
    public static Map map;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        map = new Map();
        char exit ='i';
        while (exit=='i') {
            mainMenu();
            System.out.println("Folytatod a tesztelést(i/n)");
            try {
                exit =(char)System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    private static void mainMenu(){
        writeConsole("1. Orángután lépés");
        writeConsole("2. Panda lépés");
        c=scanChar();

        switch (c){
            case 1: orangutanStep(); break;
            case 2: pandaStep(); break;
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
            case 12: orangutanHearSlotmachine();break;
            case 13: orangutanNearArmchair();break;
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


    private static void lazyPanda(){
        writePandaActs("Lusta panda");
        c = scanChar();
        switch (c){
            case 1:  pandaOnOrangutan(new Lazy());break;
            case 2:  pandaOnPanda(new Lazy());break;
            case 3:  pandaOnArmchair(new Lazy());break;
            case 4:  pandaOnChocolatemachine(new Lazy());break;
            case 5:  pandaOnSlotmachine(new Lazy());break;
            case 6:  pandaOnCabinet(new Lazy());break;
            case 7:  pandaOnWeakTile(new Lazy());break;
            case 8:  pandaOnEmptyField(new Lazy());break;
            case 9:  pandaOnEntrance(new Lazy());break;
            case 10: pandaOnExit(new Lazy());break;
            case 11: lazyPandaUnleashOtherPandaHand();break;
            case 12: pandaHearChocolatemachine(new Lazy());break;
            case 13: pandaHearSlotmachine(new Lazy());break;
            case 14: pandaNearArmchair(new Lazy());break;
        }
    }
    private static void scaryPanda(){
        writePandaActs("Ijedős panda");
        c = scanChar();
        switch (c){
            case 1:  pandaOnOrangutan(new Scary());break;
            case 2:  pandaOnPanda(new Scary());break;
            case 3:  pandaOnArmchair(new Scary());break;
            case 4:  pandaOnChocolatemachine(new Scary());break;
            case 5:  pandaOnSlotmachine(new Scary());break;
            case 6:  pandaOnCabinet(new Scary());break;
            case 7:  pandaOnWeakTile(new Scary());break;
            case 8:  pandaOnEmptyField(new Scary());break;
            case 9:  pandaOnEntrance(new Scary());break;
            case 10: pandaOnExit(new Scary());break;
            case 11: scaryPandaUnleashOtherPandaHand();break;
            case 12: pandaHearChocolatemachine(new Scary());break;
            case 13: pandaHearSlotmachine(new Scary());break;
            case 14: pandaNearArmchair(new Scary());break;
        }
    }
    private static void shyPanda(){
        writePandaActs("Félénk panda");
        c = scanChar();
        switch (c){
            case 1:  pandaOnOrangutan(new Shy());break;
            case 2:  pandaOnPanda(new Shy());break;
            case 3:  pandaOnArmchair(new Shy());break;
            case 4:  pandaOnChocolatemachine(new Shy());break;
            case 5:  pandaOnSlotmachine(new Shy());break;
            case 6:  pandaOnCabinet(new Shy());break;
            case 7:  pandaOnWeakTile(new Shy());break;
            case 8:  pandaOnEmptyField(new Shy());break;
            case 9:  pandaOnEntrance(new Shy());break;
            case 10: pandaOnExit(new Shy());break;
            case 11: shyPandaUnleashOtherPandaHand();break;
            case 12: pandaHearChocolatemachine(new Shy());break;
            case 13: pandaHearSlotmachine(new Shy());break;
            case 14: pandaNearArmchair(new Shy());break;
        }
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
    private static void pandaOnOrangutan(Panda p){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(p);
        map.animals.add(new Orangutan());
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new SimpleField());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void pandaOnPanda(Panda p){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(p);
        map.animals.add(new Lazy());
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new SimpleField());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void pandaOnArmchair(Panda p){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(p);
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new Armchair());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void pandaOnChocolatemachine(Panda p){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(p);
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new Chocolatemachine());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void pandaOnSlotmachine(Panda p){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(p);
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new Slotmachine());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void pandaOnCabinet(Panda p){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(p);
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
    private static void pandaOnWeakTile(Panda p){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(p);
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new WeakTile());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void pandaOnEmptyField(Panda p){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(p);
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new SimpleField());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void pandaOnEntrance(Panda p){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(p);
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new Entrance());
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void pandaOnExit(Panda p){
        map.animals.clear();
        map.simpleFields.clear();
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new Exit());
        map.animals.add(p);
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void lazyPandaUnleashOtherPandaHand(){
        map.animals.clear();
        map.simpleFields.clear();
        Lazy a = new Lazy();
        Lazy b = new Lazy();
        Lazy c = new Lazy();
        a.nextPanda = b;
        b.nextPanda = c;
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new SimpleField());
        map.animals.add(a);
        map.animals.add(b);
        map.animals.add(c);
        setMap();//még 1 állatot kell elhelyezni
        map.simpleFields.get(2).myAnimal = map.animals.get(2);
        map.animals.get(2).mySimpleField =map.simpleFields.get(2);

        map.simpleFields.get(0).neighbours.add(map.simpleFields.get(2));
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(2));
        map.simpleFields.get(2).neighbours.add(map.simpleFields.get(0));
        map.simpleFields.get(2).neighbours.add(map.simpleFields.get(1));
        a.unleashHand();
    }
    private static void scaryPandaUnleashOtherPandaHand(){
        map.animals.clear();
        map.simpleFields.clear();
        Scary a =new Scary();
        Scary b =new Scary();
        Scary c =new Scary();
        a.nextPanda = b;
        b.nextPanda = c;
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new SimpleField());
        map.animals.add(a);
        map.animals.add(b);
        map.animals.add(c);
        setMap();//még 1 állatot kell elhelyezni
        map.simpleFields.get(2).myAnimal = map.animals.get(2);
        map.animals.get(2).mySimpleField =map.simpleFields.get(2);

        map.simpleFields.get(0).neighbours.add(map.simpleFields.get(2));
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(2));
        map.simpleFields.get(2).neighbours.add(map.simpleFields.get(0));
        map.simpleFields.get(2).neighbours.add(map.simpleFields.get(1));
        a.unleashHand();
    }
    private static void shyPandaUnleashOtherPandaHand(){
        map.animals.clear();
        map.simpleFields.clear();
        Shy a = new Shy();
        Shy b = new Shy();
        Shy c = new Shy();
        a.nextPanda = b;
        b.nextPanda = c;
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new SimpleField());
        map.animals.add(a);
        map.animals.add(b);
        map.animals.add(c);
        setMap();//még 1 állatot kell elhelyezni
        map.simpleFields.get(2).myAnimal = map.animals.get(2);
        map.animals.get(2).mySimpleField =map.simpleFields.get(2);

        map.simpleFields.get(0).neighbours.add(map.simpleFields.get(2));
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(2));
        map.simpleFields.get(2).neighbours.add(map.simpleFields.get(0));
        map.simpleFields.get(2).neighbours.add(map.simpleFields.get(1));
        a.unleashHand();
    }
    private static void pandaHearChocolatemachine(Panda p){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(p);
        map.simpleFields.add(new SimpleField());
        Chocolatemachine a = new Chocolatemachine();
        map.simpleFields.add(a);
        setMap();
        map.simpleFields.add(new SimpleField());
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(2));
        map.simpleFields.add(new SimpleField());
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(3));
        map.animals.add(new Orangutan());
        map.animals.add(new Orangutan());
        map.animals.get(1).mySimpleField = map.simpleFields.get(2);
        map.animals.get(2).mySimpleField = map.simpleFields.get(3);
        map.simpleFields.get(2).myAnimal = map.animals.get(1);
        map.simpleFields.get(3).myAnimal = map.animals.get(2);
        a.broadcast();
    }
    private static void pandaHearSlotmachine(Panda p){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(p);
        map.simpleFields.add(new SimpleField());
        Slotmachine a = new Slotmachine();
        map.simpleFields.add(a);
        setMap();
        map.simpleFields.add(new SimpleField());
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(2));
        map.simpleFields.add(new SimpleField());
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(3));
        map.animals.add(new Orangutan());
        map.animals.add(new Orangutan());
        map.animals.get(1).mySimpleField = map.simpleFields.get(2);
        map.animals.get(2).mySimpleField = map.simpleFields.get(3);
        map.simpleFields.get(2).myAnimal = map.animals.get(1);
        map.simpleFields.get(3).myAnimal = map.animals.get(2);
        a.broadcast();
    }
    private static void pandaNearArmchair(Panda p){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(p);
        map.simpleFields.add(new SimpleField());
        Armchair a = new Armchair();
        map.simpleFields.add(a);
        setMap();
        map.simpleFields.add(new SimpleField());
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(2));
        map.simpleFields.add(new SimpleField());
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(3));
        map.animals.add(new Orangutan());
        map.animals.add(new Orangutan());
        map.animals.get(1).mySimpleField = map.simpleFields.get(2);
        map.animals.get(2).mySimpleField = map.simpleFields.get(3);
        map.simpleFields.get(2).myAnimal = map.animals.get(1);
        map.simpleFields.get(3).myAnimal = map.animals.get(2);
        a.broadcast();
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
        Orangutan o = new Orangutan();
        map.simpleFields.add(new SimpleField());
        map.simpleFields.add(new Exit());
        o.EntrancePLace = map.simpleFields.get(1);
        map.animals.add(o);
        setMap();
        map.animals.get(0).step(map.simpleFields.get(1));
    }
    private static void orangutanHearChocolatemachine(){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(new Orangutan());
        map.simpleFields.add(new SimpleField());
        Chocolatemachine a = new Chocolatemachine();
        map.simpleFields.add(a);
        setMap();
        map.simpleFields.add(new SimpleField());
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(2));
        map.simpleFields.add(new SimpleField());
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(3));
        map.animals.add(new Orangutan());
        map.animals.add(new Orangutan());
        map.animals.get(1).mySimpleField = map.simpleFields.get(2);
        map.animals.get(2).mySimpleField = map.simpleFields.get(3);
        map.simpleFields.get(2).myAnimal = map.animals.get(1);
        map.simpleFields.get(3).myAnimal = map.animals.get(2);
        a.broadcast();
    }
    private static void orangutanHearSlotmachine(){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(new Orangutan());
        map.simpleFields.add(new SimpleField());
        Slotmachine a = new Slotmachine();
        map.simpleFields.add(a);
        setMap();
        map.simpleFields.add(new SimpleField());
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(2));
        map.simpleFields.add(new SimpleField());
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(3));
        map.animals.add(new Orangutan());
        map.animals.add(new Orangutan());
        map.animals.get(1).mySimpleField = map.simpleFields.get(2);
        map.animals.get(2).mySimpleField = map.simpleFields.get(3);
        map.simpleFields.get(2).myAnimal = map.animals.get(1);
        map.simpleFields.get(3).myAnimal = map.animals.get(2);
        a.broadcast();
    }
    private static void orangutanNearArmchair(){
        map.animals.clear();
        map.simpleFields.clear();
        map.animals.add(new Orangutan());
        map.simpleFields.add(new SimpleField());
        Armchair a = new Armchair();
        map.simpleFields.add(a);
        setMap();
        map.simpleFields.add(new SimpleField());
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(2));
        map.simpleFields.add(new SimpleField());
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(3));
        map.animals.add(new Orangutan());
        map.animals.add(new Orangutan());
        map.animals.get(1).mySimpleField = map.simpleFields.get(2);
        map.animals.get(2).mySimpleField = map.simpleFields.get(3);
        map.simpleFields.get(2).myAnimal = map.animals.get(1);
        map.simpleFields.get(3).myAnimal = map.animals.get(2);
        a.broadcast();
    }

    private static void setMap(){
        map.simpleFields.get(0).myAnimal = map.animals.get(0);
        map.animals.get(0).mySimpleField =map.simpleFields.get(0);
        if(map.animals.size()!=1) {
            map.animals.get(1).mySimpleField = map.simpleFields.get(1);
            map.simpleFields.get(1).myAnimal = map.animals.get(1);
        }
        map.simpleFields.get(0).neighbours.add(map.simpleFields.get(1));
        map.simpleFields.get(1).neighbours.add(map.simpleFields.get(0));
    }
    private static void writeConsole(String text){
        System.out.println(text);
    }
    public  static void log(String text){
        for(int i =0;i<TABULATORS;i++){
            System.out.print("\t");
        }
        System.out.print(text+"\n");
    }
    private static int scanChar(){
        return scan.nextInt();
    }
}
