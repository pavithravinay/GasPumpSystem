package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is an abstract class which defines the list of common behaviors that all the classes should implement 
 * to handle to Print Receipt behavior
 */
public abstract class PrintReceipt {
    DataStore ds;

    public PrintReceipt(DataStore ds) {
        this.ds = ds;
    }

    public abstract void printReceipt();
}

