package net.twinray;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product>{


    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private static final int PRODUCT_NOT_PRESENT = -1;

    private final List<Product> products = new ArrayList<>();

    //Basic functions
    public void add(Product product){products.add(product);}
    public void replace(Product oldProduct, Product newProduct){
        if(products.indexOf(oldProduct) != PRODUCT_NOT_PRESENT)
        products.set(products.indexOf(oldProduct), newProduct);
    }
    public void clear(){products.clear();}



    //Van sorting
    public List<Product> getHeavyVanProducts(){return null;}
    public List<Product> getLightVanProducts(){return null;}

            //this is the more complicated way, for demonstration's sake
    public void prepare()
    {
    //sort by weight

        products.sort(Product.compare()); //comparator here

    //find the product index that needs the heavy van

    //assign views of the product list for heavy and light vans


    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
    //we can just delegate. lel

}
