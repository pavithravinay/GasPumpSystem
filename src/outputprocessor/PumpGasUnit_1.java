package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is a concrete class providing implementation details for the abstract parent class PumpGasUnit.
 * This class defines the behavior to handle the action pumpGasUnit for gas pump#1.
 */
public class PumpGasUnit_1 extends PumpGasUnit {

    public PumpGasUnit_1(DataStore ds) {
        super(ds);
    }
    
    /**
     * This method calculates the total quantity of gas pumped and the total cost for the gas pumped for every
     * gas pumped action and persists this information as property on DataStore_1.
     */
    @Override
    public void pumpGasUnit() {
        DataStore_1 ds1 = (DataStore_1) ds;
        ds1.G++;
        ds1.total = ds1.price * ds1.G;
    }
}

