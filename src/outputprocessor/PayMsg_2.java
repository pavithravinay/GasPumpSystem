package outputprocessor;

/**
 * @author Pavithra Vinay
 *
 * This class provides implementation for PayMsg action for gas pump#2.
 */
public class PayMsg_2 extends PayMsg {
	
	public PayMsg_2() {
		super();
	}

	/**
	 * This method handles payMsg action for gas pump#2 and displays a message to the user to do further processing.
	 */
    @Override
    public void payMsg() {
        System.out.println("Thank you for choosing GasPump_2, please select payment type");
    }
}

