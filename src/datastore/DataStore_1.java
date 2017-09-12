package datastore;

/**
 * @author Pavithra Vinay
 *
 * Concrete class implementing the abstract class dataStore.
 * This class only contains properties and any implementation required to represent GasPump_1.
 */
public class DataStore_1 extends DataStore {
	
	//Temp variables
	public float temp_a;
	public float temp_b;

	//Property to specify gas type like "Super", "Regular"
	public String gasType;
	
	//Property to store gas price for "Regular" gas type
	public float regularGasPrice;
	
	//Property to store gas price for "Super" gas type
	public float superGasPrice;
	
	//Property to store total price for the amount of gas the user will pump out.
	public float price;
	
	//Property representing quantity of gas in "Gallons"
	public int G;
	
	//Property to store total quantity of gas pumped by the user.
	public float total;
	
	//Property to store credit card information
	public String credit_card;

}
