package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is an abstract class which defines the list of common behaviors that all the classes should implement 
 * to handle to StoreCash action.
 */
public abstract class StoreCash {
    DataStore ds;

    public StoreCash() {
    }

    public StoreCash(DataStore ds) {
        this.ds = ds;
    }

    public abstract void storeCash();
}

