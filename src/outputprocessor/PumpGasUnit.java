package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is an abstract class which defines the list of common behaviors that all the classes should implement 
 * to handle to pumpGasUnit action.
 */
public abstract class PumpGasUnit {
    DataStore ds;

    public PumpGasUnit(DataStore ds) {
        this.ds = ds;
    }

    public abstract void pumpGasUnit();
}

