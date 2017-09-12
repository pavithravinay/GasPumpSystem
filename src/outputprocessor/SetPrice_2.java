package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 *
 * This is a concrete class providing implementation details for the abstract parent class SetPrice.
 * This class defines the behavior to handle the action setPrice for gas pump#2 and this behavior
 * initializes the values gas price and gas type based on the input gas type required for the data store#2.
 */
public class SetPrice_2 extends SetPrice {

    public SetPrice_2(DataStore ds) {
        super(ds);
    }

    /**
     * This method initializes the data store gas price and gas type based on the input gas type.
     * @param g: input gas type. 1- Regular, 2-Super, 3-Premium
     */
    @Override
    public void setPrice(int g) {
        DataStore_2 ds2 = (DataStore_2) ds;
        if (g == 1) { // Regular selected
            ds2.price = ds2.regularGasPrice;
            ds2.gasType = "Regular";
        } else if (g == 2) { // Super selected
            ds2.price = ds2.superGasPrice;
            ds2.gasType = "Super";
        } else if (g == 3) { // Premium selected
            ds2.price = ds2.premiumGasPrice;
            ds2.gasType = "Premium";
        }
        System.out.println(ds2.gasType + " gas selected @ price of $" +
        (ds2.gasType.equals("Regular")?ds2.regularGasPrice: (ds2.gasType.equals("Super")? ds2.superGasPrice:ds2.premiumGasPrice)) + "/liter");
        System.out.println("Select (7) to start the pump");
    }
}

