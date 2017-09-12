package mdaefsm;

/**
 * @author Pavithra Vinay
 *
 * This class represents one of the states in state pattern required to support GasPump application.
 * Provides only one operation which allows user to set the payment type to either Credit or Cash.
 */
class S1 extends State {

    S1(MDA_EFSM mda) {
        super(mda);
    }

    /**
     * This method allows user to select payment type.
     * If the input payment type is of type Credit, this method invokes changeState method to switch to next state.
     * If the input payment type is of type Cash, this method invokes changeState method to switch to next state and 
     * also display appropriate menu to the user, depending on the current state.
     * 
     * @param t: Represents payment type, 1- Credit, 2-Cash
     */
    @Override
    void payType(int t) {
        if ((t == 1) && (mda.getS() == mda.getLS()[1])) {
        	System.out.println("Please wait... authenticating credit card");
        	mda.changeState(2);
        } else if ((t == 2) && (mda.getS() == mda.getLS()[1])) {
        	mda.changeState(3);
            mda.getOP().StoreCash();
            mda.getOP().DisplayMenu();
        }
    }
}
