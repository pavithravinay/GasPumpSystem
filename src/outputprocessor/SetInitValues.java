package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is an abstract class which defines the list of common behaviors that all the classes should implement 
 * to handle to setInitialValues action.
 */
public abstract class SetInitValues {
    DataStore ds;

    public SetInitValues(DataStore ds) {
        this.ds = ds;
    }

    public abstract void setInitialValues();
}

