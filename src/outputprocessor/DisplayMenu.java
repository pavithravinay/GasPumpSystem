package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is an abstract class which defines the list of common behaviors that all the classes should handle to Display Menu
 */
public abstract class DisplayMenu {
    DataStore ds;

    public DisplayMenu(DataStore ds) {
        this.ds = ds;
    }    

    public DataStore getDs() {
        return ds;
    }
    
    public abstract void displayMenu();
}
