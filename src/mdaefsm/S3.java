
package mdaefsm;

/**
 * @author Pavithra Vinay
 *
 * This class represents one of the states in state pattern required to support GasPump application.
 * Provides operations to allow the input gasType to be set and also allows user to cancel the current processing and return to start state.
 */
class S3 extends State {

    S3(MDA_EFSM mda) {
        super(mda);
    }

    /**
     * This method sets the price for the input gas type and invokes changeState operation on MDA_EFSM to switch to next state.
     * @param g: Gas type. 1-Regular, 2-Super
     */
    @Override
    void selectGas(int g) {
        if (mda.getS() == mda.getLS()[3]) {
        	mda.changeState(4);
            mda.getOP().SetPrice(g);
        }
    }
    
    /**
     * This method cancels the current processing and invokes changeState operation to set to Start state.
     * This method also returns cash to the user, if supported by the current state.
     */
    @Override
    void cancel() {
        if (mda.getS() == mda.getLS()[3]) {
        	mda.changeState(0);
            mda.getOP().CancelMsg();
            mda.getOP().ReturnCash();
        }
    }
}

