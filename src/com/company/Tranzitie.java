package com.company;

public class Tranzitie {

    private String name;
    private int time;
    private String to;
    private String need;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getNeed() {
        return need;
    }

    public void setNeed(String need) {
        this.need = need;
    }

    public Tranzitie(String name, int time, String to, String need) {
        this.name = name;
        this.time = time;
        this.to = to;
        this.need = need;
    }
}
