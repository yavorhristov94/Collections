package net.twinray;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {





    public static void main(String[] args) {

        genericMethods();

        }

        static public void genericMethods(){
             Product door = new Product("Wooden door", 35);
             Product floorPanel = new Product("Floor Panel", 25);
             Product window = new Product("Window", 10);

             Collection<Product> products = new ArrayList<>();

            products.add(door);
            products.add(floorPanel);
            products.add(window);

    //ITERATING
        //THE OLD WAYS
            System.out.println(products); // lists them in turn of adding, in one line

            Iterator<Product> productIterator = products.iterator();
            //This ENABLES us to step through the list through a condition
            while(productIterator.hasNext() /*can determine what hasNext means*/)
            {
                Product product = productIterator.next(); //give me the next one
                //and move forward
                System.out.println(product);
            }

        //THE BETTER WAYS
            //automatically pulls an iterator
            System.out.println("For:each");
            for (Product product : products){
                System.out.println(product);
            }

            //But there's something a for each cant do
            //but an iterator coded manually can
            System.out.println("Removing via iterator");

            Iterator<Product> productIterator2 = products.iterator();
            //the reason why we make a new one is that you cant reset
            //an iterator to the first element
            while(productIterator2.hasNext())
            {
                Product product = productIterator2.next();
                if (product.getWeight() > 20) {
                    System.out.println(product);
                }else {productIterator2.remove();}
                //the reason we need to use the iterator to remove it
                //is due to concurrency. We can't remove while iteration is running
                //so the iterator handles that concurrency
            }

    //OTHER STUFF
            System.out.println(products.size());
            System.out.println(products.isEmpty());

            System.out.println(products.contains(window));
            System.out.println(products.contains(door));

            Collection<Product> otherProducts = new ArrayList<>();

            otherProducts.add(window);
            otherProducts.add(door);

            products.removeAll(otherProducts);
            //we remove from products all the products that match to the ones
            //inside the other products

            System.out.println(products);
        }

}
