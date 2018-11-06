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


        }

}
