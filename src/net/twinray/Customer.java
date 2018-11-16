package net.twinray;

public class Customer {
    public static final Customer JACK = new Customer ("Jack");
    public static final Customer JILL = new Customer ("Jill");
    public static final Customer MARY = new Customer ("Mary");

    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public void reply(final String message)
    {System.out.println(name +": " + message);}
}
