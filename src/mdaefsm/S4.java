package mdaefsm;

/**
 * @author Pavithra Vinay
 *
 * This class represents one of the states in state pattern required to support GasPump application.
 * Provides operation to start the gas pump.
 */
class S4 extends State {

    S4(MDA_EFSM mda) {
        super(mda);
    }

    /**
     * This method is invoked after the payment type is accepted by the system and initializes the default values
     * for the data store and also displays a message indicating they can start pumping the gas.
     */
    @Override
    void startPump() {
        if (mda.getS() == mda.getLS()[4]) {
        	mda.changeState(5);
            mda.getOP().SetInitValues();
            mda.getOP().ReadyMsg();
        }
    }
}

