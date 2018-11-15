package net.twinray;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    final String supplierName;

    public Supplier(String supplierName) {
        this.supplierName = supplierName;
    }

    private List<Product> products = new ArrayList<>();


    public void addProduct(Product product){products.add(product);}

    public List<Product> getProducts() {
        return products;
    }
}
