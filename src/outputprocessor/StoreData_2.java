package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is a concrete class which implements the abstract parent class StoreData 
 * and defines behavior to handle storeData() for gas pump#2.
 */
public class StoreData_2 extends StoreData {

    public StoreData_2(DataStore ds) {
        super(ds);
    }
    
	/**
	 * This method initializes the data store properties based on the dataStore Object of the parent class.
	 * It initializes the gas prices of regular gas type, super gas type and premium gas type.
	 * It then displays an informational message to the user, indicating that the gas pump has been activates successfully.
	 */
    @Override
    public void storeData() {
        DataStore_2 ds2 = (DataStore_2) ds;
        ds2.regularGasPrice = ds2.temp_a;
        ds2.superGasPrice = ds2.temp_b;
        ds2.premiumGasPrice = ds2.temp_c;
        System.out.println("GasPump_2 activated successfully.");
    }
}

