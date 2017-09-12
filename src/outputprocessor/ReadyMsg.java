package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is an abstract class which defines the list of common behaviors that all the classes should implement 
 * to handle to ReadyMsg action.
 */
public abstract class ReadyMsg {
    DataStore ds;

    public ReadyMsg(DataStore ds) {
        this.ds = ds;
    }

    public abstract void readyMsg();
}

