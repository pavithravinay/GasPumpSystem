
package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is a concrete class which implements the abstract parent class StoreData 
 * and defines behavior to handle storeData()  for gas pump#1.
 */
public class StoreData_1 extends StoreData {

	public StoreData_1(DataStore ds) {
		super(ds);
	}

	/**
	 * This method initializes the data store properties based on the dataStore Object of the parent class.
	 * It initializes the gas prices of regular gas type and super gas type.
	 * It then displays an informational message to the user, indicating that the gas pump has been activates successfully.
	 */
	@Override
	public void storeData() {
		DataStore_1 ds1 = (DataStore_1) ds;
		ds1.regularGasPrice = ds1.temp_a;
		ds1.superGasPrice = ds1.temp_b;
		System.out.println("GasPump_1 activated successfully.");
	}
}
