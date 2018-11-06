package net.twinray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {


    private static final int LIGHT_VAN_MAX_WEIGHT = 20;

    private final List<Product> products = new ArrayList<>();

    public void add(Product product){
        products.add(product);
    }


    @Override
    public Iterator<Product> iterator() {
        return products.iterator(); //we can just delegate. lel
    }
}
