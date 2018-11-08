package net.twinray;

import java.util.*;

public class Shipment implements Iterable<Product>{


    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private static final int PRODUCT_NOT_PRESENT = -1;

    private final List<Product> products = new ArrayList<>();

    private List<Product> lightVanProducts;
    private List<Product> heavyVanProducts;

    //Basic functions
    public void add(Product product){products.add(product);}
    public void replace(Product oldProduct, Product newProduct){
        if(products.indexOf(oldProduct) != PRODUCT_NOT_PRESENT)
        products.set(products.indexOf(oldProduct), newProduct);
    }
    public void clear(){products.clear();}



    //Van sorting
    public List<Product> getHeavyVanProducts(){return heavyVanProducts;}
    public List<Product> getLightVanProducts(){return lightVanProducts;}

            //this is the more complicated way, for demonstration's sake
    public void prepare()
    {
    //sort by weight

        BY_WEIGHT BY_WEIGH = new BY_WEIGHT();
        products.sort(BY_WEIGH); //comparator here

    //find the product index that needs the heavy van
        int splitPoint  = findSplitPoint();

    //assign views of the product list for heavy and light vans
        if(splitPoint == -1)
         {
            //if all products are heavy, assign them accordingly
            heavyVanProducts = products;
         }

         else if (splitPoint == -2)
         {
             //if all products are light, assign them accordingly
             lightVanProducts = products;
         }

        else if(splitPoint != -1 && splitPoint != -2)
        {
            //If the list is not full of all heavy or all light
            //then split them up in  first light, then heavy
            products.subList(0, splitPoint);
            products.subList(splitPoint, products.size());
        }
        else System.out.println("No products");

    }

    public int findSplitPoint()
    {
        int NoProducts = -3;

        //if ALL items are heavy, return a corresponding index
        if(products.get(0).getWeight() > LIGHT_VAN_MAX_WEIGHT){return -1;}

        for (int i = 0; i < products.size(); i++)
        {
            final Product product = products.get(i);

            //if the weight of the product is for heavy van
            //mark it as the first by weight in the list to need it
            //thus it being the split point
            if(product.getWeight()>LIGHT_VAN_MAX_WEIGHT){return i;}

            //and if none are heavier and the list isn't empty, then return -2
            else if (products.size() > 0) return -2;

        }
        return NoProducts;
    }
    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
    //we can just delegate. lel


}
