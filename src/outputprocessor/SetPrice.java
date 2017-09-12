package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is an abstract class which defines the list of common behaviors that all the classes should implement 
 * to handle to SetPrice action.
 */
public abstract class SetPrice {
    DataStore ds;

    public SetPrice(DataStore ds) {
        this.ds = ds;
    }

    public abstract void setPrice(int g);
}

