package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This class provide implementation for Gas Pumped behaviors for gas pump#2
 */
public class GasPumpedMsg_2 extends GasPumpedMsg {

    public GasPumpedMsg_2(DataStore ds) {
        super(ds);
    }
    
    /**
     * This method handles the gas pumped action and displays a message to the user informing of the gas type and quantity of gas pumped.
     */
    @Override
    public void gasPumpedMsg() {
        DataStore_2 ds2 = (DataStore_2) ds;
        System.out.println("Pumped a liter of " + ds2.gasType + " gas");
        System.out.println("Total # of liters pumped: " + ds2.L);
    }
}

