package outputprocessor;

import datastore.*;


/**
 * @author Pavithra Vinay
 *
 * This is a concrete class providing implementation details for the abstract parent class ReadyMsg.
 * This class defines the behavior to handle the action readyMsg for gas pump#1.
 */
public class ReadyMsg_1 extends ReadyMsg {

    public ReadyMsg_1(DataStore ds) {
        super(ds);
    }

    /**
     * This method handles the readyMsg action and displays a message to the user, informing of the next action.
     */
    @Override
    public void readyMsg() {
        System.out.println("Ready to pump gas");
        DataStore_1 ds1 = (DataStore_1) ds;
        System.out.println("Select (9) to pump 1 gallon of " + ds1.gasType + " gas");
        System.out.println("Pleas select 'a' if you want to stop pumping.");
    }
}

