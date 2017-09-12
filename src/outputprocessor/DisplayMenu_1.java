package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This which defines provides implementation for displayMenu behavior for GasPump#1.
 */
public class DisplayMenu_1 extends DisplayMenu {

	public DisplayMenu_1(DataStore ds) {
		super(ds);
	}

	/**
	 * This method handles displayMenu behavior Gas pump#1.
	 */
	@Override
	public void displayMenu() {
		System.out.println("Credit card has been approved, please select the gas type: ");
		
	}
}
