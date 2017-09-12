package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is a concrete class providing implementation details for the abstract parent class ReturnCash.
 * This class defines the behavior to handle the action returnCash for gas pump#2.
 */
public class ReturnCash_2 extends ReturnCash {

    public ReturnCash_2(DataStore ds) {
        super(ds);
    }

    /**
     * This method defines the behavior for return cash action and calculates the cash to be returned,
     * based on the quantity of gas pumped by the user and the amount of cash inserted by the user and 
     * displays a message with the details.
     */
    @Override
    public void returnCash() {
        DataStore_2 ds2 = (DataStore_2) ds;
        float cash_return = ds2.cash - ds2.total;
        if (cash_return > 0) {
            System.out.println("Cash to return: $" + cash_return);  
            System.out.println("Please collect your change.");
        } else {
            System.out.println("No cash to return");
        }
        System.out.println("Transaction finished");
    }
}

