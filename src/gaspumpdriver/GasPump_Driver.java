package gaspumpdriver;

import java.util.Scanner;

import abstractfactory.GasPump1_Factory;
import abstractfactory.GasPump2_Factory;
import inputprocessor.GasPump_1;
import inputprocessor.GasPump_2;

/**
 * @author Pavithra Vinay
 *
 *         Driver class containing main method represents entry point to the
 *         application. This class contains methods which display menu to the
 *         user to choose required gas pumps and also instantiates factory
 *         classes required by the application.
 */
public class GasPump_Driver {

	static Scanner input = new Scanner(System.in);
	static String action = "default"; // variable to store user action;

	static boolean activated = false;

	/**
	 * main method representing entry point to the application. Invokes method
	 * to display menu to the user.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		displayStudentInfo();
		selectGasPump();

		int gasPump;
		gasPump = input.nextInt();

		switch (gasPump) {
		case 1: {
			gasPump1_Processing();
			break;
		}
		case 2: {
			gasPump2_Processing();
			break;
		}
		default: {
			System.out.println("Invalid selection, system will terminate.");
			System.exit(1); // Exit application
		}

		}
	}

	/**
	 * Instantiates concrete factory (GasPump1_Factory) and GasPump_1. Displays
	 * menu for the user to choose from a list of operations that the user can
	 * perform on GasPump_1.
	 */
	private static void gasPump1_Processing() {
		GasPump1_Factory gf1 = new GasPump1_Factory();
		GasPump_1 gp1 = gf1.getGasPump_1();
		displayGasPump1Menu();
		while (!action.equals("q")) {
			gp1.displayOperations();
			action = input.next();
			switch (action) {
			case "0": {
				if (!activated) {
					System.out.println("Operation: Activate(float a, float b)");
					float a, b;
					System.out.println("Enter value of the parameter a (Price for Gas type 'Regular'): ");
					a = input.nextFloat();
					System.out.println("Enter value of the parameter b  (Price for Gas type 'Super'): ");
					b = input.nextFloat();
					gp1.Activate(a, b);
					activated = true;
				} else {
					gp1.Activate(1, 1);
				}
				break;
			}
			case "1": {
				System.out.println("Operation: Start()");
				gp1.Start();
				break;
			}
			case "2": {
				System.out.println("Operation: PayCredit()");
				gp1.PayCredit();
				break;
			}
			case "3": {
				System.out.println("Operation: Approve()");
				gp1.Approve();
				break;
			}
			case "4": {
				System.out.println("Operation: Reject()");
				gp1.Reject();
				break;
			}
			case "5": {
				System.out.println("Operation: SelectRegularGas()");
				gp1.Regular();
				break;
			}
			case "6": {
				System.out.println("Operation: SelectSuperGas()");
				gp1.Super();
				break;
			}
			case "7": {
				System.out.println("Operation: Cancel()");
				gp1.Cancel();
				break;
			}
			case "8": {
				System.out.println("Operation: StartPump()");
				gp1.StartPump();
				break;
			}
			case "9": {
				System.out.println("Operation: PumpGallon()");
				gp1.PumpGallon();
				break;
			}
			case "a": {
				System.out.println("Operation: StopPump()");
				gp1.StopPump();
				break;
			}
			case "q": {
				break;
			}
			default: {
				System.out.println("Not a valid operation, Please select a valid operation.");
				break;
			}
			}
		}

		System.out.println("Thanks for using GasPump System.");
	}

	/**
	 * Instantiates concrete factory (GasPump2_Factory) and GasPump_2. Displays
	 * menu for the user to choose from a list of operations that the user can
	 * perform on GasPump_2.
	 */
	private static void gasPump2_Processing() {
		GasPump2_Factory gf2 = new GasPump2_Factory();
		GasPump_2 gp2 = gf2.getGasPump_2();
		displayGP2Menu();

		while (!action.equals("q")) {
			gp2.displayOperations();
			action = input.next();
			switch (action) {
			case "0": {
				System.out.println("Operation: Activate");
				int a, b, c;
				if (!activated) {
					System.out.println("Enter value of the parameter a  (Price for Gas type 'Regular'): ");

					a = input.nextInt();
					System.out.println("Enter value of the parameter b  (Price for Gas type 'Super'): ");
					b = input.nextInt();
					System.out.println("Enter value of parameter c  (Price for Gas type 'Premium'): ");
					c = input.nextInt();
					gp2.Activate(a, b, c);
					activated = true;
				} else {
					gp2.Activate(1, 1, 1);
				}
				break;
			}
			case "1": {
				System.out.println("Operation: Start");
				gp2.Start();
				break;
			}
			case "2": {
				System.out.println("Operation: Pay Cash");
				System.out.println("Enter the amount in $: ");
				float cash = input.nextFloat();
				gp2.PayCash(cash);
				break;
			}
			case "3": {
				System.out.println("Operation: Select Regular Gas");
				gp2.Regular();
				break;
			}
			case "4": {
				System.out.println("Operation: Select Super Gas");
				gp2.Super();
				break;
			}
			case "5": {
				System.out.println("Operation: Select Premium Gas");
				gp2.Premium();
				break;
			}
			case "6": {
				System.out.println("Operation: Cancel");
				gp2.Cancel();
				break;
			}
			case "7": {
				System.out.println("Operation: Start Pump");
				gp2.StartPump();
				break;
			}
			case "8": {
				System.out.println("Operation: Pump Liter");
				gp2.PumpLiter();
				break;
			}
			case "9": {
				System.out.println("Operation: Stop");
				gp2.Stop();
				break;
			}
			case "p": {
				System.out.println("Operation: Print Receipt");
				gp2.Receipt();
				break;
			}
			case "n": {
				System.out.println("Operation: No Receipt");
				gp2.NoReceipt();
				break;
			}
			case "q": {
				break;
			}
			default: {
				System.out.println("Not a valid operation, please select a valid operation.");
				break;
			}
			}
		}
		System.out.println("Thanks for using GasPump System.");
	}

	/**
	 * Provides options for the user to choose from available gas pumps
	 */
	private static void selectGasPump() {
		System.out.println("Please select a GasPump: ");
		System.out.println("1. GasPump_1");
		System.out.println("2. GasPump_2");

	}

	/**
	 * displays GasPump_1 operations
	 */
	private static void displayGasPump1Menu() {
		System.out.println("GasPump_1\n");
		System.out.println("MENU of Operations: ");
		System.out.println("******************************");
		System.out.println("0. Activate(float, float)\n" + "1. Start()\n" + "2. PayCredit()\n" + "3. Approve()\n"
				+ "4. Reject()\n" + "5. SelectRegularGas()\n" + "6. SelectSuperGas()\n" + "7. Cancel\n"
				+ "8. StartPump()\n" + "9. PumpGallon()\n" + "a. StopPump()\n" + "q. Quit the Program");
		System.out.println("\n******************************");
	}

	/**
	 * displays GasPump_2 operations
	 */
	private static void displayGP2Menu() {
		System.out.println("GasPump_2\n");
		System.out.println("MENU of Operations: ");
		System.out.println("******************************");
		System.out.println("0. Activate(int, int, int)\n" + "1. Start()\n" + "2. PayCash(int)\n"
				+ "3. SelectRegularGas()\n" + "4. SelectSuperGas()\n" + "5. SelectPremiumGas()\n" + "6. Cancel\n"
				+ "7. StartPump()\n" + "8. PumpLiter()\n" + "9. Stop()\n" + "p. PrintReceipt()\n" + "n. NoReceipt()\n"
				+ "q. Quit the Program");
		System.out.println("\n******************************");
	}

	/**
	 * Display Student information;
	 */
	private static void displayStudentInfo() {
		System.out.println("CS587 - Spring 2017");
		System.out.println("Project Demo");
		System.out.println("StudentName - Pavithra Vinay, A20369869\n");
	}

}
