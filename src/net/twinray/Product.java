package net.twinray;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class Product {

 public static final Comparator<Product> BY_NAME = comparing(Product::getName);
 public static final Comparator<Product> BY_WEIGHT = comparing(Product::getWeight);


    private final int id;
    private final String name;
    private final int weight;


    public Product(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
