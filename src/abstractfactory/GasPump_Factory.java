package abstractfactory;

import datastore.*;
import mdaefsm.*;
import outputprocessor.*;


/**
 * @author Pavithra Vinay
 * 
 * This class represents an abstract factory, which contains rules for generating GasPump concrete classes
 */
public abstract class GasPump_Factory {

	//Abstract representation of DataStore type
	public abstract DataStore getDsObj();

	//Abstract representation of MDA_EFSM type
	public abstract MDA_EFSM getMdaObject();

	//Abstract representation of OutputProcessor type
	public abstract OutputProcessor getOutputProcessor();

}
