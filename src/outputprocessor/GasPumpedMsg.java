package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is an abstract class which defines the list of common behaviors that all the classes should handle to Gas Pumped behavior
 */
public abstract class GasPumpedMsg {
    DataStore ds;
    public GasPumpedMsg(DataStore ds) {
        this.ds = ds;
    }

    public abstract void gasPumpedMsg();
}

