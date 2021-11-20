package com.company.itStep.StonesWork;

import java.awt.*;
import java.util.*;
import java.util.List;

public class FinishedNecklace {
    public static void main(String[] args) {
        Necklace necklace = new Necklace();
        necklace.addStone(new PreciousStone(PreciousSort.Ruby,20,150,86));
        necklace.addStone(new PreciousStone(PreciousSort.Diamond,13,170,87));
        necklace.addStone(new PreciousStone(PreciousSort.Sapphire,10,300,95));
        necklace.addStone(new SemiPreciousStones(SemiPreciousSort.Opal,12,50,50));
        necklace.addStone(new SemiPreciousStones(SemiPreciousSort.Aquamarine,12,55,55));
        System.out.println("Стоимость ожирелья: "+necklace.getPrice()+" USD");
        System.out.println("Общий вес ожирелья(в каратах): " +necklace.getCarats());
        System.out.println("------------------------------------------------------------------------------------");
        necklace.sort(); // сортировка камней по цене, от дешёвых
        System.out.println(necklace.toString());
        System.out.println("------------------------------------------------------------------------------------");
        ArrayList<Stone> getStoneTransparency = necklace.stoneTransparency(80, 90);
        for (Stone stone : getStoneTransparency)
            System.out.println("Прозрачность от 80 до 90 - "+stone.toString());

    }

    class Gems4Necklace {
        private String name;
        private double price;
        private int carats;

        public Gems4Necklace(String name, double price, int carats) {
            this.name = name;
            this.price = price;
            this.carats = carats;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getCarats() {
            return carats;
        }
    }

    static class Necklace {
        private List<Stone> stones = new ArrayList<>();
        private List<Gems4Necklace> gems4Necklaces = new ArrayList<>();

        public void addStone(Stone stone) {
            stones.add(stone);
        }

        public void addGems4Necklace(Gems4Necklace gems4Necklace) {
            gems4Necklaces.add(gems4Necklace);
        }

        public double getPrice() {
            double sum = 0;
            for (Stone stone : stones)
                sum += stone.getPrice();
            for (Gems4Necklace gems4Necklace : gems4Necklaces)
                sum += gems4Necklace.getPrice();
            return sum;
        }

        public double getCarats() {
            double sum = 0;
            for (Stone stone : stones)
                sum += stone.getCarats();
            for (Gems4Necklace gems4Necklace : gems4Necklaces)
                sum += gems4Necklace.getCarats();
            return sum;
        }

        public void sort() {
            Collections.sort(stones);


        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Вставленные камни: \n");
            for (Stone stone : stones) {
                String sStone = stone.toString();
                stringBuilder.append(sStone);
            }
            return stringBuilder.toString();
        }

        public ArrayList<Stone> stoneTransparency(int minTransparency, int maxTransparency) {
            ArrayList<Stone> stoneTransparency = new ArrayList<>();
            for (Stone stone : stones)
                if (stone.getTransparency() >= minTransparency && stone.getTransparency() <= maxTransparency)
                    stoneTransparency.add(stone);
            return stoneTransparency;
        }


    }



}


