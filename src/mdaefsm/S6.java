package mdaefsm;

/**
 * @author Pavithra Vinay
 *
 * This class represents one of the states in state pattern required to support GasPump application.
 * Provides operations to print receipt of no receipt.
 */
class S6 extends State {

    S6(MDA_EFSM mda) {
        super(mda);
    }

    /**
     * This method invokes changeState operation on MDA_EFSM to switch the application to Start state.
     * It also prints out the receipt to summarize the transaction.
     * Simulates return cash operation, if supported by the current gas pump.
     */
    @Override
    void receipt() {
        if (mda.getS() == mda.getLS()[6]) {
        	mda.changeState(0);
            mda.getOP().PrintReceipt();
            mda.getOP().ReturnCash();
        }
    }

    /**
     * This method invokes changeState operation on MDA_EFSM to switch the application to Start state.
     * It also returns cash, if supported by the current gas pump.
     */
    @Override
    void noReceipt() {
        if (mda.getS() == mda.getLS()[6]) {
        	mda.changeState(0);
            mda.getOP().ReturnCash();
        }
    }
}

