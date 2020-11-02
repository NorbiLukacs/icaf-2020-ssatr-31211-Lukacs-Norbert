package com.company;

public class Main {

    private static boolean active;
    private static int t;
    private Locatie locatie;
    private Tranzitie tranzitie;
    private PetriNetLoader petriNetLoader;


    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");

    while(active){
        t++;
        System.out.println("current time is "+t);
    }

    }
}
