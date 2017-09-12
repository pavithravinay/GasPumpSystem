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
public class GasPump1_Factory extends GasPump_Factory {
	
	//Property to represent DataStore for this class
	private DataStore_1 dataStore1;
	
	//Property representing GasPump_1 type
	private GasPump_1 gasPump1;
	
	//Property representing MDA_EFSM type
	private MDA_EFSM mdaEfsm;
	
	//Property representing OutputProcessor type
	private OutputProcessor outputProcessor;

	//Constructor initializes all the class properties and also instantiates the outputProcessor methods.
	public GasPump1_Factory() {
		dataStore1 = new DataStore_1();
		gasPump1 = new GasPump_1(this);
		mdaEfsm = new MDA_EFSM();
		outputProcessor = new OutputProcessor();

		gasPump1.setDs(dataStore1);
		outputProcessor.setDs(dataStore1);
		gasPump1.setMda(mdaEfsm);
		mdaEfsm.setOP(outputProcessor);

		outputProcessor.setCancelMsg(new CancelMsg_1());
		outputProcessor.setDisplayMenu(new DisplayMenu_1(dataStore1));
		outputProcessor.setGasPumpedMsg(new GasPumpedMsg_1(dataStore1));
		outputProcessor.setPayMsg(new PayMsg_1());
		outputProcessor.setPrintReceipt(new PrintReceipt_1(dataStore1));
		outputProcessor.setPumpGasUnit(new PumpGasUnit_1(dataStore1));
		outputProcessor.setReadyMsg(new ReadyMsg_1(dataStore1));
		outputProcessor.setRejectMsg(new RejectMsg_1());
		outputProcessor.setReturnCash(new ReturnCash_1(dataStore1));
		outputProcessor.setSetInitialValues(new SetInitValues_1(dataStore1));
		outputProcessor.setSetPrice(new SetPrice_1(dataStore1));
		outputProcessor.setStopMsg(new StopMsg_1());
		outputProcessor.setStoreCash(new StoreCash_2(dataStore1));
		outputProcessor.setStoreData(new StoreData_1(dataStore1));
	}

	@Override
	public DataStore getDsObj() {
		return this.dataStore1;
	}

	public GasPump_1 getGasPump_1() {
		return this.gasPump1;
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
