package outputprocessor;

import datastore.*;

/**
* @author Pavithra Vinay
*
* This is a concrete class providing implementation details for the abstract parent class PrintReceipt.
* This class defines the behavior to handle the action printReceipt for gas pump#2.
*/
public class PrintReceipt_2 extends PrintReceipt {

    public PrintReceipt_2(DataStore ds) {
        super(ds);
    }

    /**
     * This method handles the printReceipt behavior for gas pump#2 and displays total quantity, 
     * gas type and cost for the transaction.
     */
    @Override
    public void printReceipt() {
        System.out.println("Receipt:");
        System.out.println("******************************");
        DataStore_2 ds2 = (DataStore_2) ds;
        System.out.println(ds2.L + " liters of " + ds2.gasType + " gas @ $" + ds2.price + "/liter");
        System.out.println("Total: $" + (float) ds2.total);
        System.out.println("Cash inserted: $" + ds2.cash);
        System.out.println("******************************");
    }
}

