package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is a concrete class providing implementation details for the abstract parent class PumpGasUnit.
 * This class defines the behavior to handle the action pumpGasUnit for gas pump#2.
 */
public class PumpGasUnit_2 extends PumpGasUnit {

    public PumpGasUnit_2(DataStore ds) {
        super(ds);
    }
    
    /**
     * This method calculates the total quantity of gas pumped and the total cost for the gas pumped for every
     * gas pumped action and persists this information as property on DataStore_2.
     */
    @Override
    public void pumpGasUnit() {
        DataStore_2 ds2 = (DataStore_2) ds;
        ds2.L++;
        ds2.total = ds2.price * ds2.L;
    }
}
