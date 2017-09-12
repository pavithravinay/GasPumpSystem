package mdaefsm;

/**
 * @author Pavithra Vinay
 *
 * This class represents one of the states in state pattern required to support GasPump application.
 * Provides activate operation to activate the gas pump.
 */
class Start extends State {

    Start(MDA_EFSM mda) {
        super(mda);
    }

    /**
     * This method is invoked on initiating the gas pump and invokes changeState method on MDA_EFSM to set to start state.
     * It also invokes StoreData method to initialize the data store for the current GasPump.
     */
    @Override
    void activate() {
    	if (mda.getS() == mda.getLS()[7]) {
    		mda.changeState(0);
            mda.getOP().StoreData();
        }
    }
    
}

