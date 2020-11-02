package com.company;

public class Tranzitie {

    private String name;
    private int jeton;

    public Tranzitie(String name, int jeton) {
        this.name = name;
        this.jeton = jeton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJeton() {
        return jeton;
    }

    public void setJeton(int jeton) {
        this.jeton = jeton;
    }
}
