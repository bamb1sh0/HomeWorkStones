package com.company.itStep.StonesWork;

public class Stone implements Comparable< Stone > {
    String name = "";
    private int carats; //караты
    private double price; //цена камня
    private int transparency; //прозрачность

    Stone(int carats, double price, int transparency){
        this.carats = carats;
        this.price = price;
        this.transparency = transparency;
    }

    public int getTransparency() {
        return transparency;
    }

    public String getName() {
        return name;
    }

    public int getCarats() {
        return carats;
    }

    public double getPrice() {
        return price;
    }
    public String toString(){
        return "";
    }

    @Override
    public int compareTo(Stone stone) {
        return (int) (this.price - stone.price);
    }
}
