package mdaefsm;

/**
 * @author Pavithra Vinay
 * 
 * This is an abstract State class implemented by different concrete state classes. This provides default
 * implementation for any state whereas different concrete specific state classes overrides the methods 
 * to provide appropriate implementations suitable for their current state. If any operation is not supported by the specific state,
 * methods in this abstract class are invoked.
 */
public abstract class State {
	MDA_EFSM mda;

	public State(MDA_EFSM mda) {
		this.mda = mda;
	}

	void activate() {
		operationNotAllowed();
	}

	void start() {
		operationNotAllowed();
	}

	void payType(int t) {
		operationNotAllowed();
	}

	void approve() {
		operationNotAllowed();
	}

	void reject() {
		operationNotAllowed();
	}

	void selectGas(int g) {
		operationNotAllowed();
	}

	void cancel() {
		operationNotAllowed();
	}

	void startPump() {
		operationNotAllowed();
	}

	void pump() {
		operationNotAllowed();
	}

	void stopPump() {
		operationNotAllowed();
	}

	void receipt() {
		operationNotAllowed();
	}

	void noReceipt() {
		operationNotAllowed();
	}

	private void operationNotAllowed() {
		System.out.println("This operation is not supported in current state");
	}
}
