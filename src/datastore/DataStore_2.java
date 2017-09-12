package datastore;

/**
 * @author Pavithra Vinay
 *
 * Concrete class implementing the abstract class dataStore.
 * This class only contains properties and any implementation required to represent GasPump_2.
 */
public class DataStore_2 extends DataStore {

	//Temp variables
	public int temp_a;
	public int temp_b;
	public int temp_c;
	public float temp_cash;
	
	//Property to specify gas type like "Super", "Regular", "Premium"
	public String gasType;
	
	//Property to store gas price for "Regular" gas type
	public int regularGasPrice;
	
	//Property to store gas price for "Super" gas type
	public int superGasPrice;
	
	//Property to store gas price for "Premium" gas type
	public int premiumGasPrice;
	
	//Amount of cash inserted by the user to perform transaction
	public float cash;
	
	//Total cost to the user
	public int price;
	
	//Quantity of the gas pumped by the user in "Liters"
	public int L;
	
	//Total amount
	public int total;

}
