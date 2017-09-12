package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is a concrete class providing implementation details for the abstract parent class PrintReceipt.
 * This class defines the behavior to handle the action printReceipt for gas pump#1.
 */
public class PrintReceipt_1 extends PrintReceipt {

    public PrintReceipt_1(DataStore ds) {
        super(ds);
    }

    /**
     * This method handles the printReceipt behavior for gas pump#1 and displays total quantity, 
     * gas type and cost for the transaction.
     */
    @Override
    public void printReceipt() {
        System.out.println("Receipt: ");
        System.out.println("******************************");
        DataStore_1 ds1 = (DataStore_1) ds;
        System.out.println(ds1.G + " gallons of " + ds1.gasType + " gas @ $" + ds1.price + "/gallon");
        System.out.println("Total: $" + ds1.total);
        System.out.println("******************************");
        System.out.println("Transaction complete");
    }
}
