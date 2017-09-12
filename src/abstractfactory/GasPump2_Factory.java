package abstractfactory;

import outputprocessor.*;
import datastore.*;
import inputprocessor.*;
import mdaefsm.*;

/**
 * @author Pavithra Vinay
 *
 * Concrete class providing implementation to Abstract factory GasPump_Factory.
 */
public class GasPump2_Factory extends GasPump_Factory {

	//Property to represent DataStore for this class
	private DataStore_2 dataStore2;
	
	//Property to represent GasPump_2 type
	private GasPump_2 gasPump2;
	
	//Property representing MDA_EFSM type
	private MDA_EFSM mdaEfsm;
	
	//Property to represent OutputProcessor type
	private OutputProcessor outputProcessor;

	//Constructor initializes all the class properties and also instantiates the outputProcessor methods.
	public GasPump2_Factory() {

		dataStore2 = new DataStore_2();
		gasPump2 = new GasPump_2(this);
		mdaEfsm = new MDA_EFSM();
		outputProcessor = new OutputProcessor();

		gasPump2.setDs(dataStore2);
		outputProcessor.setDs(dataStore2);
		gasPump2.setMda(mdaEfsm);
		mdaEfsm.setOP(outputProcessor);

		outputProcessor.setCancelMsg(new CancelMsg_2());
		outputProcessor.setDisplayMenu(new DisplayMenu_2(dataStore2));
		outputProcessor.setGasPumpedMsg(new GasPumpedMsg_2(dataStore2));
		outputProcessor.setPayMsg(new PayMsg_2());
		outputProcessor.setPrintReceipt(new PrintReceipt_2(dataStore2));
		outputProcessor.setPumpGasUnit(new PumpGasUnit_2(dataStore2));
		outputProcessor.setReadyMsg(new ReadyMsg_2(dataStore2));
		outputProcessor.setReturnCash(new ReturnCash_2(dataStore2));
		outputProcessor.setSetInitialValues(new SetInitValues_2(dataStore2));
		outputProcessor.setSetPrice(new SetPrice_2(dataStore2));
		outputProcessor.setStopMsg(new StopMsg_2());
		outputProcessor.setStoreCash(new StoreCash_2(dataStore2));
		outputProcessor.setStoreData(new StoreData_2(dataStore2));
	}

	@Override
	public DataStore getDsObj() {
		return this.dataStore2;
	}

	
	public GasPump_2 getGasPump_2() {
		return this.gasPump2;
	}

	@Override
	public MDA_EFSM getMdaObject() {
		return this.mdaEfsm;
	}

	@Override
	public OutputProcessor getOutputProcessor() {
		return this.outputProcessor;
	}

}
