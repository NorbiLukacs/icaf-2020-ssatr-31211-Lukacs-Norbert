
package com.company;

public class Locatie {

    private String name;
    private int jeton;

    public Locatie(String name, int jeton) {
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
