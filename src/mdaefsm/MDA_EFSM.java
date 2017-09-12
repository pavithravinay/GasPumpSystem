package mdaefsm;

import outputprocessor.*;

/**
 * @author Pavithra Vinay
 *
 * This class is implemented using de-centralized version of State design pattern.
 * This class is responsible for changing the state and all the respective state operations are delegated to be performed by state classes.
 */
public class MDA_EFSM {
	
	//Represents current state of the gas pump.
	private State s;
	
	//Array of states, to list all the possible states.
	private State[] LS;
	
	//Instance of output processor for further processing.
	private OutputProcessor op;
	
	/**
	 * Constructor method initializes GasPump to Default State and 
	 * also initializes all possible states within the GasPump.
	 */
	public MDA_EFSM() {
		//
		LS = new State[8];
		LS[7] = new Start(this); // initial state
		LS[0] = new S0(this); // State S0, Allows "Start" operation on gas pump.
		LS[1] = new S1(this); // State S1, Allows pay type to be set to either credit card of cash
		LS[2] = new S2(this); // State S2, Supports Credit Card Approve and Reject operations.
		LS[3] = new S3(this); // State S3, Supports selection of Gas type and allows user to Cancel the transaction.
		LS[4] = new S4(this); // State S4, Support StatePump operation.
		LS[5] = new S5(this); // State S5, Supports operation Pump and StopPump operations.
		LS[6] = new S6(this); // State S6, Provides Receipt and NoReceipt operations.

		s = LS[7]; // Default State
	}
	
	/**
	 * This method changes the state of the Gas pump to the input state.
	 * @param stateId - New state to be set.
	 */
	public void changeState(int stateId){
		s = LS[stateId];
	}

	public OutputProcessor getOP() {
		return op;
	}

	public void setOP(OutputProcessor op) {
		this.op = op;
	}

	public State[] getLS() {
		return LS;
	}

	public void setLS(State[] lS) {
		LS = lS;
	}

	public State getS() {
		return s;
	}

	public void setS(State s) {
		this.s = s;
	}

	/**
	 * This method invokes the activate method on the current state.
	 */
	public void activate() {
		s.activate();
	}
	
	/**
	 * This method invokes the start method on the current state.
	 */
	public void start() {
		s.start();
	}
	
	/**
	 * Invokes payType operation for the input pay type.
	 * @param t - PayType 1- Credit, 2- Cash.
	 */
	public void payType(int t) {
		s.payType(t);
	}
	
	/**
	 * Invokes Approve method on the current state.
	 */
	public void approve() {
		s.approve();
	}
	
	/**
	 * Invokes reject method on the current state.
	 */
	public void reject() {
		s.reject();
	}
	
	/**
	 * Invokes Cancel method on the current state.
	 */
	public void cancel() {
		s.cancel();
	}

	/**
	 * Invokes selectGas operation on the current state.
	 * @param g - GasType: 1-Regular, 2-Super, 3-Premium
	 */
	public void selectGas(int g) {
		s.selectGas(g);
	}
	
	/**
	 * Invokes startPump method on the current state.
	 */
	public void startPump() {
		s.startPump();
	}
	
	/**
	 * Invokes pump operation on the current state.
	 */
	public void pump() {
		s.pump();
	}
	
	/**
	 * Invokes stopPump operation on the current state.
	 */
	public void stopPump() {
		s.stopPump();
	}
	
	/**
	 * Invokes receipt operation on the current state.
	 */
	public void receipt() {
		s.receipt();
	}
	
	/**
	 * Invokes noReceipt operation on the current state.
	 */
	public void noReceipt() {
		s.noReceipt();
	}

}
