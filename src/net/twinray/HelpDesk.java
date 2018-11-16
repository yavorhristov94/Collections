package net.twinray;


import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk {

    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(final Customer customer, final Category category)
    {
        enquiries.offer(new Enquiry(customer, category));
    }

    public void processAllEnquiries()
    {
        final Enquiry enquiry = enquiries.remove();
        enquiry.getCustomer().reply("Have you tried turning it off and on again?");
    }

}
