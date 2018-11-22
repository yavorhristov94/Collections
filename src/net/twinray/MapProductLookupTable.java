package net.twinray;

import java.util.HashMap;
import java.util.Map;

public class MapProductLookupTable implements ProductLookupTable{

    private final Map<Integer, Product> idToProduct = new HashMap<>();

    @Override
    public Product lookupById(int id) {
        return idToProduct.get(id); //works even if the Id is not there
    }

    @Override
    public void addProduct(Product productToAdd) {

        if(idToProduct.containsKey(productToAdd.getId())){
           throw new IllegalArgumentException("Unable to add product, duplicate ID " + productToAdd);
        }

        idToProduct.put(productToAdd.getId(), productToAdd);
    }

    @Override
    public void clear() {
    idToProduct.clear();
    }
}
