package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is a concrete class providing implementation details for the abstract parent class SetPrice.
 * This class defines the behavior to handle the action setPrice for gas pump#1 and this behavior
 * initializes the values gas price and gas type based on the input gas type required for the data store#1.
 */
public class SetPrice_1 extends SetPrice {

    public SetPrice_1(DataStore ds) {
        super(ds);
    }

    /**
     * This method initializes the data store gas price and gas type based on the input gas type.
     * @param g: input gas type. 1- Regular, 2-Super
     */
    @Override
    public void setPrice(int g) {
        DataStore_1 ds1 = (DataStore_1) ds;        
        if (g == 1) { // regular gas
            ds1.price = ds1.regularGasPrice;
            ds1.gasType = "Regular";
        } else if (g == 2) { // super gas 
            ds1.price = ds1.superGasPrice;
            ds1.gasType = "Super";
        }
        System.out.println(ds1.gasType + " gas selected @ price of $" + (ds1.gasType.equals("Regular")?ds1.regularGasPrice: ds1.superGasPrice) + "/gallon");
        System.out.println("Select (8) to start the pump");
    }
}

