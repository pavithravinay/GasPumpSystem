package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is a concrete class providing implementation details for the abstract parent class ReturnCash.
 * This class defines the behavior to handle the action returnCash for gas pump#1.
 * Gas pump#1 does not handle cash transaction, so no implementation is provided for return cash.
 */
public class ReturnCash_1 extends ReturnCash {

    public ReturnCash_1(DataStore ds) {
        super(ds);
    }

    /**
     * Gas pump#1 does not handle cash transaction, so no implementation is provided for return cash.
     */
    @Override
    public void returnCash() {        
        
    }
}

