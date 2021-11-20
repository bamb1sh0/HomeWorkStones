package com.company.itStep.StonesWork;

import java.text.ParseException;

enum PreciousSort {
    Diamond, Ruby, Sapphire, Emerald
}

public class PreciousStone extends Stone{
    private PreciousSort sort;

    PreciousStone(PreciousSort sort, int carats, int price, int transparency) {
        super(carats, price, transparency);
        this.name = "";
        this.sort = sort;
    }

    public PreciousSort getSort() {
        return sort;
    }
    public String toString(){
        String result = String.format("Stone: %s , carats: %s, price: %s USD, transparency: %d%n",
                getSort(), getCarats(), getPrice(), getTransparency());
        return result;
    }
}
