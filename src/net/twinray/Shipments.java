package net.twinray;

public class Shipments {
    private Shipment shipment = new Shipment();

    Product door = new Product("Wooden door", 35);
    Product floorPanel = new Product("Floor Panel", 25);
    Product window = new Product("Window", 10);


    @Test
    public void shouldAddItems() throws Exception
    {
    shipment.add(door);
    shipment.add(window);

    ship
    }

}
