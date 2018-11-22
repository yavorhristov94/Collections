package net.twinray;

import java.util.ArrayList;
import java.util.List;

public class NaiveProductLookupTable implements ProductLookupTable {
//USING ARRAY LISTS to implement

    private List<Product> productList = new ArrayList<>();


    @Override
    public Product lookupById(int id) {

        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
    return null;
    }

    @Override
    public void addProduct(Product productToAdd) {
        //to make sure all products are unique...
        for(Product product: productList){
            if(product.getId() == productToAdd.getId()){
                throw new IllegalArgumentException("Unable to add product, duplicate ID " + productToAdd);
            }
        }
        productList.add(productToAdd);
    }

    @Override
    public void clear() {
    productList.removeAll(productList);
    }
}
