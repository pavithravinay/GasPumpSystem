package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is a concrete class which implements the abstract parent class StoreCash 
 * and defines behavior to handle storeCash(). This implementation is required only
 * for gas pump#2 as gas pump#1 deals only with credit card transactions
 */
public class StoreCash_2 extends StoreCash {

    public StoreCash_2(DataStore ds) {
        super(ds);
    }

    /**
     * This method takes the input cash and initializes the data store cash property with that information.
     * It then displays a informational message to the user, indicating the amount of cash inserted.
     */
    @Override
    public void storeCash() {
        DataStore_2 ds2 = (DataStore_2) ds;
        ds2.cash = ds2.temp_cash;
        System.out.println("Amount of cash inserted: $" + ds2.cash);
    }
}
