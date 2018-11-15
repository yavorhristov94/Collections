package net.twinray;

public class ProductFixtures {
    public static Product door = new Product("Wooden Door", 35);
    public static Product floorPanel = new Product("Floor Panel", 25);
    public static Product window = new Product("Window", 10);

    public static Supplier bobs = new Supplier("Bob's Household Supplies");
    public static Supplier kates = new Supplier("Kate's Home Goods");

    static
    {
    bobs.addProduct(door);
    bobs.addProduct(floorPanel);

    kates.addProduct(floorPanel);
    kates.addProduct(new Product("Wooden Door", 35));
    //testing to see for failures, by having the same type, but different objects
    }
}
