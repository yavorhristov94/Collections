package net.twinray;

import java.util.Collection;
import java.util.Comparator;

public class Product{

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
    public String toString() {
        return "Product{" +
                "name'" + name + '\'' + ", weight=" + weight
                + '}';
    }
    //we dont need to do Implement on the top if we do it this way
    public static final Comparator<Product> BY_WEIGHT =
            new Comparator<Product>() {
                public int compare(final Product p1, final Product p2) {
                    return p1.getWeight() - p2.getWeight();
                }
            };
}
