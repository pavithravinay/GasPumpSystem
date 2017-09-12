package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is an abstract class which defines the list of common behaviors that all the classes should implement 
 * to handle to StoreData related behaviors.
 */
public abstract class StoreData {
    DataStore ds;

    public StoreData(DataStore ds) {
        this.ds = ds;
    }

    public abstract void storeData();
}
