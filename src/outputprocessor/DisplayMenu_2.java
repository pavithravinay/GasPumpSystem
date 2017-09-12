package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This class provides implementation for displayMenu behavior for GasPump#2.
 */
public class DisplayMenu_2 extends DisplayMenu {

    public DisplayMenu_2(DataStore ds) {
        super(ds);
    }

    /**
	 * This method handles displayMenu behavior Gas pump#2.
	 */
    @Override
    public void displayMenu() {
        System.out.println("Please select gas type: ");
        
    }
}

