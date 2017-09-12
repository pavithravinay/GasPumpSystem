package inputprocessor;

import abstractfactory.*;
import datastore.DataStore;
import datastore.DataStore_2;
import mdaefsm.MDA_EFSM;

/**
 * @author Pavithra Vinay
 *
 * This class provides all operations for GasPump_2.
 * All the operations are invoked on the states supported by MDA_EFSM type.
 */
public class GasPump_2  {
	DataStore ds;
	MDA_EFSM mda;

	public DataStore getDS() {
		return ds;
	}

	public void setDs(DataStore ds) {
		this.ds = ds;
	}

	public MDA_EFSM getMda() {
		return mda;
	}

	public void setMda(MDA_EFSM mda) {
		this.mda = mda;
	}

	public GasPump_2(GasPump_Factory gf) {
	}

	/**
	 * Utility method to display list of operations supported by GasPump_2
	 */
	public void displayOperations() {
		System.out.println("Select operation: ");
		System.out.println(	"0-Activate\t" + 
							"1-Start\t\t" + 
							"2-PayCash\t" + 
							"3-RegularGas\t" + 
							"4-SuperGas\t" + 
							"5-PremiumGas\n" + 
							"6-Cancel\t" + 
							"7-StartPump\t" + 
							"8-PumpLiter\t" + 
							"9-Stop\t\t" + 
							"p-PrintReceipt\t" + 
							"n-NoReceipt\t" + 
							"q-Quit\t");
	}
	
	/**
	 * This method first validates if the input prices are valid and then invokes the activate method on MDA_EFSM
	 * @param a - price for "regular" gas type
	 * @param b - price for "super" gas type
	 * @param c - price for "premium" gas type
	 */
	public void Activate(int a, int b, int c) {
		if (a > 0 && b > 0 && c > 0) { 
        	DataStore_2 ds2 = (DataStore_2) ds;
            ds2.temp_a = a;
            ds2.temp_b = b;
            ds2.temp_c = c;
            mda.activate();
        } else {
            System.out.println("Activation failed, prices must be greater than $0");
        }
	}
	
	/**
	 * Start the gas pump operation
	 */
	public void Start() {
		mda.start();
	}

	/**
	 * Set payment type to cash and also set the input amount from the user.
	 * @param cash - Amount of cash inserted by the user.
	 */
	public void PayCash(float cash) {
		DataStore_2 ds2 = (DataStore_2) ds;
		
        if (cash > 0) {            
            ds2.temp_cash = cash;
            mda.payType(2);
        } else {
            System.out.println("Invalid amount, please enter an amount greater than $0.");
        }
	}

	/**
	 * Set gas type to "Regular"
	 */
	public void Regular() {
		mda.selectGas(1);
	}
	
	/**
	 * Set gas type to "Super"
	 */
	public void Super() {
		 mda.selectGas(2);
	}
	
	/**
	 * Set gas type to "Premium"
	 */
	public void Premium() {
		 mda.selectGas(3);
	}
	
	/**
	 * Cancel the operation
	 */
	public void Cancel() {
		mda.cancel();
	}
	
	/**
	 * Simulate start pump activity
	 */
	public void StartPump() {
		mda.startPump();
	}
	
	/**
	 * This method pumps gas at one liter for every method call.
	 * If the amount of cash input by the user, is not sufficient to pump a liter of gas, then invokes the stopPump operation.
	 */
	public void PumpLiter() {
		DataStore_2 ds2 = (DataStore_2) ds;
		
        if (ds2.cash < ds2.price * (ds2.L + 1)) {
            System.out.println("Sorry, not enough cash.");
            mda.stopPump();
        } else {
            mda.pump();
        }
	}

	/**
	 * Simulates stop pump operation.
	 */
	public void Stop() {
		mda.stopPump();
	}
	
	/**
	 * Print receipt to the user
	 */
	public void Receipt() {
		mda.receipt();
	}
	
	/**
	 * Simulates NoReceipt operation.
	 */
	public void NoReceipt() {
		mda.noReceipt();
	}

}
