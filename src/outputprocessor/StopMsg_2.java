package outputprocessor;

/**
 * @author Pavithra Vinay
 *
 * This is a concrete class providing implementation details for the abstract parent class StopMsg.
 */
public class StopMsg_2 extends StopMsg {
	
    public StopMsg_2() {
		super();
	}

    /**
     * Displays message to the user that the pump has been stopped.
     */
	@Override
    public void stopMsg() {
        System.out.println("Pump Stopped.");
    }
}

