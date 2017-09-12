package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This class provide implementation for Gas Pumped behaviors for gas pump#1
 */
public class GasPumpedMsg_1 extends GasPumpedMsg {

    public GasPumpedMsg_1(DataStore ds) {
        super(ds);
    }
    
    /**
     * This method handles the gas pumped action and displays a message to the user informing of the gas type and quantity of gas pumped.
     */
    @Override
    public void gasPumpedMsg() {
        DataStore_1 ds1 = (DataStore_1) ds;
        System.out.println("Pumped a gallon of " + ds1.gasType + " gas");
        System.out.println("Total # of gallons pumped: " + ds1.G);
    }

}

