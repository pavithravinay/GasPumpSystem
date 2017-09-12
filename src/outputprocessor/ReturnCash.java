package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is an abstract class which defines the list of common behaviors that all the classes should implement 
 * to handle to ReturnCash action.
 */
public abstract class ReturnCash {
    DataStore ds;

    public ReturnCash() {
    }

    public ReturnCash(DataStore ds) {
        this.ds = ds;
    }

    public abstract void returnCash();
}

