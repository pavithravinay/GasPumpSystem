package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is a concrete class providing implementation details for the abstract parent class SetInitValues.
 * This class defines the behavior to handle the action setInitialValues for gas pump#1 and this behavior
 * initializes the values required for the data store#1.
 */
public class SetInitValues_1 extends SetInitValues {

	public SetInitValues_1(DataStore ds) {
		super(ds);
	}

	/**
	 * This method initializes the data store#1 properties. 
	 * It sets the gallons of fuel to 0 and total to 0.
	 */
	@Override
	public void setInitialValues() {
		DataStore_1 ds1 = (DataStore_1) ds;
		ds1.G = 0;
		ds1.total = 0;
	}
}
