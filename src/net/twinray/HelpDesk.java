package net.twinray;


import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Predicate;

public class HelpDesk {

    private static final Comparator<Enquiry> BY_CATEGORY = new Comparator<Enquiry>() {
        @Override
        public int compare(Enquiry o1, Enquiry o2) {
            return o1.getCategory().compareTo(o2.getCategory());
            //since enums are comparable by default in their order
            //we can just do this to set up priorities
        }
    };

    private final Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

    public void enquire(final Customer customer, final Category category)
    {
        enquiries.offer(new Enquiry(customer, category));
    }


    public void processGeneralEnquiries()
    {
        Predicate<Enquiry> predicate = enq -> enq.getCategory() != Category.PRINTER;
        final String message = "Have you tried turning it off an on again";

        processEnquiry(predicate, message, "No general work to do, let's have some coffee");
    }

    public void processPrinterEnquiries()
    {
        Predicate<Enquiry> predicate = enq -> enq.getCategory() == Category.PRINTER;
        final String message = "Is it out of paper?";

        processEnquiry(predicate, message, "No printer work to do, let's have some coffee");
    }

    private void processEnquiry(Predicate<Enquiry> predicate, String message, String s) {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && predicate.test(enquiry)) {
            enquiry.getCustomer().reply(message);
            enquiries.remove();
        } else
            System.out.println(s);
    }

}
