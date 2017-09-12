package mdaefsm;

/**
 * @author Pavithra Vinay
 *
 * This class represents one of the states in state pattern required to support GasPump application.
 * Provides operations pump the gas 1 unit at a time and also stopPump operation.
 */
class S5 extends State {

    S5(MDA_EFSM mda) {
        super(mda);
    }

    /**
     * This method simulates pump action on the gas pump and pumps out 1 unit of gas at a time.
     * It also displays a message to the user indicating that gas has been pumped.
     */
    @Override
    void pump() {
        if (mda.getS() == mda.getLS()[5]) {
            mda.getOP().PumpGasUnit();
            mda.getOP().GasPumpedMsg();
        }
    }

    /**
     * This method simulates stop pump operation on the current gas pump.
     * It invokes changeState operation on MDA_EFSM to set the state to represent gas pump stopped state.
     * Displays a message to the user that the pump has been stopped.
     */
    @Override
    void stopPump() {
        if (mda.getS() == mda.getLS()[5]) {
        	mda.changeState(6);
            mda.getOP().StopMsg();
        }
    }
}

