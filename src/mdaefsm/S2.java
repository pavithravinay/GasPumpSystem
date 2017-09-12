
package mdaefsm;

/**
 * @author Pavithra Vinay
 *
 * This class represents one of the states in state pattern required to support GasPump application.
 * Provides operations to approve or reject input credit card.
 */
class S2 extends State {

    S2(MDA_EFSM mda) {
        super(mda);
    }
    
    /**
     * This method invokes changeState on MDA_EFSM to switch to next state and displays message to the user
     * indicating credit card has been approved and to continue processing.
     */
    @Override
    void approve() {
        if (mda.getS() == mda.getLS()[2]) {
        	mda.changeState(3);
            mda.getOP().DisplayMenu();
        }
    }
    
    /**
     * This method invokes changeState on MDA_EFSM to switch to Start state of the gas pump application and
     * displays message to the user indicating that credit card payment has been rejected.
     */
    @Override
    void reject() {
        if (mda.getS() == mda.getLS()[2]) {
        	mda.changeState(0);
            mda.getOP().RejectMsg();
        }
    }
}
