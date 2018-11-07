package net.twinray;

import java.util.Comparator;

public class Product implements Comparator<Product>{

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

    public int BY_WEIGHT(){}
    \
    @Override
    public int compare(Product p1, Product p2){
        return  p1.getWeight() - p2.getWeight();
    }

}
