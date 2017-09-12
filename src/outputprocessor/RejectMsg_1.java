package outputprocessor;

/**
 * @author Pavithra Vinay
 *
 * This is a concrete class providing implementation details for the abstract parent class RejectMsg.
 * This class defines the behavior to handle the action rejectMsg for gas pump#1. This implementation is 
 * required only for gas pump#1 as gas pump#2 does not handle credit card transaction.
 */
public class RejectMsg_1 extends RejectMsg {
	
	
	public RejectMsg_1() {
		super();
	}

	/**
	 * This method handles the credit card reject action and displays a message to the user.
	 */
	@Override
	public void rejectMsg() {
		System.out.println("Credit card is rejected, transaction will be cancelled.");
	}
}
