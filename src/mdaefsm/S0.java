package mdaefsm;

/**
 * @author Pavithra Vinay
 *
 * This class represents one of the states in state pattern required to support GasPump application.
 * Provides only one operation which allows switching of the state from default to Start state and displaying a message for further operations to the users.
 */
class S0 extends State {

    S0(MDA_EFSM mda) {
        super(mda);
    }
    
    /**
     * This method Changes state from default to next state and displays a message to the user for subsequent operation.
     */
    @Override
    void start() {
        if (mda.getS() == mda.getLS()[0]) {
        	mda.changeState(1);
            mda.getOP().PayMsg();
        }
    }
}

