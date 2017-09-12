package outputprocessor;

import datastore.*;

/**
 * @author Pavithra Vinay
 * 
 * This class handles all the output processing related behaviors for both gas pump#1 and gas pump#2.
 * This class has all the output processing behaviors and initializes all the behaviors with the
 * corresponding class type appropriate either for gas pump#1 or gas pump#2. 
 * All the output processing behaviors comprising of both gas pump#1 and gas pump#2 are stored as the properties on this class
 * and when a behavior is required to be executed, it calls the specific call to execute that specific behavior following 
 * strategy design pattern.
 */
public class OutputProcessor {
	private DataStore ds;

	
	//Properties representing output processing behavior for 
	//both gas pump#1 and gas pump#2.
	private CancelMsg cancelMsg;
	private DisplayMenu displayMenu;
	private GasPumpedMsg gasPumpedMsg;
	private PayMsg payMsg;
	private PrintReceipt printReceipt;
	private PumpGasUnit pumpGasUnit;
	private ReadyMsg readyMsg;
	private RejectMsg rejectMsg;
	private ReturnCash returnCash;
	private SetInitValues setInitValues;
	private SetPrice setPrice;
	private StopMsg stopMsg;
	private StoreCash storeCash;
	private StoreData storeData;

	public OutputProcessor() {
	}

	public DataStore getDs() {
		return ds;
	}

	public void setCancelMsg(CancelMsg cancelMsg) {
		this.cancelMsg = cancelMsg;
	}

	public void setDs(DataStore ds) {
		this.ds = ds;
	}

	public void setDisplayMenu(DisplayMenu displayMenu) {
		this.displayMenu = displayMenu;
	}

	public void setGasPumpedMsg(GasPumpedMsg gasPumpedMsg) {
		this.gasPumpedMsg = gasPumpedMsg;
	}

	public void setPayMsg(PayMsg payMsg) {
		this.payMsg = payMsg;
	}

	public void setPrintReceipt(PrintReceipt printReceipt) {
		this.printReceipt = printReceipt;
	}

	public void setPumpGasUnit(PumpGasUnit pumpGasUnit) {
		this.pumpGasUnit = pumpGasUnit;
	}

	public void setReadyMsg(ReadyMsg readyMsg) {
		this.readyMsg = readyMsg;
	}

	public void setRejectMsg(RejectMsg rejectMsg) {
		this.rejectMsg = rejectMsg;
	}

	public void setReturnCash(ReturnCash returnCash) {
		this.returnCash = returnCash;
	}

	public void setSetInitialValues(SetInitValues setInitValues) {
		this.setInitValues = setInitValues;
	}

	public void setSetPrice(SetPrice setPrice) {
		this.setPrice = setPrice;
	}

	public void setStopMsg(StopMsg stopMsg) {
		this.stopMsg = stopMsg;
	}

	public void setStoreCash(StoreCash storeCash) {
		this.storeCash = storeCash;
	}

	public void setStoreData(StoreData storeData) {
		this.storeData = storeData;
	}

	public void CancelMsg() {
		this.cancelMsg.cancelMsg();
	}

	public void DisplayMenu() {
		this.displayMenu.displayMenu();
	}

	public void GasPumpedMsg() {
		this.gasPumpedMsg.gasPumpedMsg();
	}

	public void PayMsg() {
		this.payMsg.payMsg();
	}

	public void PrintReceipt() {
		this.printReceipt.printReceipt();
	}

	public void PumpGasUnit() {
		this.pumpGasUnit.pumpGasUnit();
	}

	public void ReadyMsg() {
		this.readyMsg.readyMsg();
	}

	public void RejectMsg() {
		this.rejectMsg.rejectMsg();
	}

	public void ReturnCash() {
		this.returnCash.returnCash();
	}

	public void SetInitValues() {
		this.setInitValues.setInitialValues();
	}

	public void SetPrice(int g) {
		this.setPrice.setPrice(g);
	}

	public void StopMsg() {
		this.stopMsg.stopMsg();
	}

	public void StoreCash() {
		this.storeCash.storeCash();
	}

	public void StoreData() {
		this.storeData.storeData();
	}

}
