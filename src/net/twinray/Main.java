package net.twinray;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Main {





    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();

        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);

        helpDesk.processPrinterEnquiries();
        helpDesk.processGeneralEnquiries();
        helpDesk.processPrinterEnquiries();

        }



}
