package outputprocessor;

/**
 * @author Pavithra Vinay
 * This class provides methods to handle cancel transaction behavior for gas pump#1.
 */
public class CancelMsg_1 extends CancelMsg {		
	
	public CancelMsg_1() {
		super();		
	}

	/**
	 * This method displays a message to the user that the transaction has been cancelled.
	 */
    @Override
    public void cancelMsg() {
        System.out.println("Transaction has been cancelled !!");
    }
}
