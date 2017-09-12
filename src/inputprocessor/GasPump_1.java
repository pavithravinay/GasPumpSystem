package inputprocessor;

import abstractfactory.*;
import datastore.DataStore;
import datastore.DataStore_1;
import mdaefsm.MDA_EFSM;

/**
 * @author Pavithra Vinay
 *
 * This class provides all operations for GasPump_1.
 * All the operations are invoked on the states supported by MDA_EFSM type.
 */
public class GasPump_1 {
	
	private DataStore ds;
	private MDA_EFSM mda;

	public GasPump_1(GasPump_Factory gf) {
	}
	
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

	/**
	 * Utility method to display list of operations supported by GasPump_1
	 */
	public void displayOperations() {
		System.out.println("Select operation: ");
		System.out.println(	"0-Activate\t" + 
							"1-Start\t\t" + 
							"2-PayCredit\t" + 
							"3-Approve\t" + 
							"4-Reject\t" + 
							"5-RegularGas\t" + 
							"6-SuperGas\n" + 
							"7-Cancel\t" + 
							"8-StartPump\t" + 
							"9-PumpGallon\t" + 
							"a-StopPump\t" + 
							"q-Quit\t");
	}

	/**
	 * This method first validates if the input amounts are valid and then invokes the activate method on MDA_EFSM
	 * @param a - price for "Regular" gas type
	 * @param b - price for "Super" gas type
	 */
	public void Activate(float a, float b) {
		if (a > 0 && b > 0) {
			DataStore_1 ds1 = (DataStore_1) ds;
			ds1.temp_a = a;
			ds1.temp_b = b;
			mda.activate();
		} else {
			System.out.println("Activation failed, prices must be greater than $0");			
		}
	}
	
	/**
	 * Start the pump
	 */
	public void Start() {
		mda.start();
	}
	
	/**
	 * Select Pay type as Credit
	 */
	public void PayCredit() {
		mda.payType(1);
	}

	/**
	 * Simulate credit card approval
	 */
	public void Approve() {
		mda.approve();
	}
	
	/**
	 * Simulate credit card reject
	 */
	public void Reject() {
		mda.reject();
	}
	
	/**
	 * Calls selectGas method of MDA_EFSM with gas type as "Regular"
	 */
	public void Regular() {
		mda.selectGas(1);
	}
	
	/**
	 * Calls selectGas method of MDA_EFSM with gas type as "Super"
	 */
	public void Super() {
		mda.selectGas(2);
	}

	/**
	 * Cancel the operation
	 */
	public void Cancel() {
		mda.cancel();
	}

	/**
	 * Start the gas pump
	 */
	public void StartPump() {
		mda.startPump();
	}
	
	/**
	 * Simulate gas pump action. This method causes the gas to be pumped 1 gallon for every method call
	 */
	public void PumpGallon() {
		mda.pump();
	}

	/**
	 * Stops the pump
	 */
	public void StopPump() {
		mda.stopPump();
		mda.receipt();
	}

}
