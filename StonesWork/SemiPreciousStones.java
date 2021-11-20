package com.company.itStep.StonesWork;

enum SemiPreciousSort {
    Aquamarine, Garnet, Opal, Tourmaline

}

public class SemiPreciousStones extends Stone{
    private SemiPreciousSort sort;

    SemiPreciousStones(SemiPreciousSort sort, int carats, double price, int transparency) {
        super(carats, price, transparency);
        this.name = "";
        this.sort = sort;
    }

    public SemiPreciousSort getSort() {
        return sort;
    }
    public String toString(){
        String result = String.format("Stone: %s , carats: %s, price: %s USD, transparency: %d%n",
                getSort(), getCarats(), getPrice(), getTransparency());
        return result;
    }
}
