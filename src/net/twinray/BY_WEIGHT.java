package net.twinray;

import java.util.Comparator;

class BY_WEIGHT implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getWeight()-o2.getWeight();
    }
}