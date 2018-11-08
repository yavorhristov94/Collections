package net.twinray;

import java.util.Comparator;

public class Product {

    String name = null;
    int weight = 0;

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return "Product{"+
                "name'"+ name + '\''+ ", weight=" + weight
                +'}';
    }



}
