package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is a concrete class providing implementation details for the abstract parent class SetInitValues.
 * This class defines the behavior to handle the action setInitialValues for gas pump#2 and this behavior
 * initializes the values required for the data store#2.
 */
public class SetInitValues_2 extends SetInitValues {

	public SetInitValues_2(DataStore ds) {
		super(ds);
	}

	/**
	 * This method initializes the data store#2 properties. 
	 * It sets the liters of fuel to 0 and total to 0.
	 */
	@Override
	public void setInitialValues() {
		DataStore_2 ds2 = (DataStore_2) ds;
		ds2.L = 0;
		ds2.total = 0;
	}
}
