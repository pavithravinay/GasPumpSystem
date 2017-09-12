package outputprocessor;

/**
 * @author Pavithra Vinay
 *
 * This class provides implementation for PayMsg action for gas pump#1.
 */
public class PayMsg_1 extends PayMsg {	
	
	public PayMsg_1() {
		super();
	}

	/**
	 * This method handles payMsg action for gas pump#1 and displays a message to the user to do further processing.
	 */
	@Override
	public void payMsg() {
		System.out.println("Thank you for choosing GasPump_1, please select payment type");
	}
}
