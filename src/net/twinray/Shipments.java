package net.twinray;

public class Shipments {
    private Shipment shipment = new Shipment();

    Product door = new Product("Wooden door", 35);
    Product floorPanel = new Product("Floor Panel", 25);
    Product window = new Product("Window", 10);



    public void shouldAddItems() throws Exception
    {
    shipment.add(door);
    shipment.add(window);

    //assertThat those are in the shipment

    shipment.clear();
    }


    public void shouldReplaceItems() throws Exception
    {
    shipment.add(door);
    shipment.add(window);

    shipment.replace(door, floorPanel);

    shipment.clear();
    }


    public void shouldNotReplaceItems() throws Exception
    {
        shipment.add(window);

        shipment.replace(door, floorPanel);
        //door was never added tho

        shipment.clear();
    }

    public void shouldIdentifyVanRequirements() throws Exception
    {
     shipment.add(door);
     shipment.add(window);
     shipment.add(floorPanel);

     shipment.prepare();


    }

    public void assertThat(){}

}
