package net.twinray;


import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk {

    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(final Customer customer, final Category category)
    {
        enquiries.offer(new Enquiry(customer, category));
    }

    public void processGeneralEnquiries()
    {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && enquiry.getCategory() != Category.PRINTER) {
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
            enquiries.remove();
        }
        else
            System.out.println("No general work to do, let's have some coffee");
    }

    public void processPrinterEnquiries()
    {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && enquiry.getCategory() == Category.PRINTER) {
            enquiry.getCustomer().reply("Is it out of paper?");
            enquiries.remove();
        }
        else
            System.out.println("No printer work to do, let's have some coffee");
    }

}
