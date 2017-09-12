package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is a concrete class providing implementation details for the abstract parent class ReadyMsg.
 * This class defines the behavior to handle the action readyMsg for gas pump#2.
 */
public class ReadyMsg_2 extends ReadyMsg {

    public ReadyMsg_2(DataStore ds) {
        super(ds);
    }
    
    /**
     * This method handles the readyMsg action and displays a message to the user, informing of the next action.
     */
    @Override
    public void readyMsg() {
        System.out.println("Ready to pump gas");
        DataStore_2 ds2 = (DataStore_2) ds;
        System.out.println("Select (8) to pump 1 liter of " + ds2.gasType + " gas");
        System.out.println("Pleas select 'a' if you want to stop pumping.");
    }
}

