package net.twinray;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;

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
//COMPARATORS - COMPARATORS - COMPARATORS - COMPARATORS - COMPARATORS
    //we dont need to do Implement on the top if we do it this way
    public static final Comparator<Product> BY_WEIGHT =
            new Comparator<Product>() {
                public int compare(final Product p1, final Product p2) {
                    return p1.getWeight() - p2.getWeight();
                }
            };

    //Or EVEN better, we can do it by DELEGATION!
    public static final Comparator<Product> BY_NAME = Comparator.comparing(Product::getName);


// HASHMAP WORKS - HASHMAP WORKS - HASHMAP WORKS - HASHMAP WORKS - HASHMAP WORKS
    //autogenerated hashcode comparison methods
    //Since we are using a set, we don't want to have object confusion
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (weight != product.weight) return false;
//        return name != null ? name.equals(product.name) : product.name == null;

//        The above is again the way that the IDE does it... But Objects again
//        has a better way, that is more readable

        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
//        This is how the IDE would do it by the standard method:
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + weight;
//        return result;

//        But Java7 added a very useful method for all Objects that does this
//        and makes it way readable!

        return Objects.hash(name, weight);
    }
}
