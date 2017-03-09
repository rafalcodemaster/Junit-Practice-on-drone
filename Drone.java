package p340174986;

/**
 * The Drone class was devleoped as part of the program to control the flying
 * drone The changes inplemented are commented throught the class, they are put
 * in place in order to fix several bugs and raise the coding standards
 * 
 * @author   Rafal Hejnicki
 * @version V1.0
 */

public class Drone implements IFlightControl {

	/**
	 * variable to initialise the set value for the max height which cannot be
	 * change unless requirements change
	 */
	private static double MAX_HEIGHT = 4.5;

	/**
	 * variable to initialise the set value for the lowest height which cannot
	 * be lower value called to keep consistency of the code I decided to keep
	 * the same format
	 */
	private static double LOWER_HEIGHT = 0.0;

	/**
	 * variable to initialise the name
	 */
	public String name;

	/**
	 * variable to initialise the current height of the drone
	 */

	public double currentHeight;

	/**
	 * variable to initialise the number of batteries in a drone
	 */
	public int numberOfBatteries;

	/**
	 * value to initialise the colour of the drone
	 */

	public String colour;

	/**
	 * Default constructor
	 */

	public Drone() {

	}

	
	/**
	 * getter method for colour
	 * 
	 * @return
	 */
	public String getColour() {
		return colour;
	}
	
	/**
	 * Constructor with parameters passed
	 * @param name
	 * @param currentHeight
	 * @param numberOfBatteries
	 * @param colour
	 */

	public Drone(String name, double currentHeight, int numberOfBatteries, String colour) {
		
		this.setName(name);
		this.setCurrentHeight(currentHeight);
		this.setNumberOfBatteries(numberOfBatteries);
		this.setColour(colour);
	}

	/**
	 * setter method for colour with validation for Red and Green only
	 * 
	 * @param colour
	 */

	public void setColour(String colour) throws IllegalArgumentException {

		if ((colour == "Red") || (colour == "Green")) {
			this.colour = colour;
		} else {
			throw new IllegalArgumentException("Only Red and Green colour avvailible please correct");
		}
	}

	/**
	 * getter method for get name
	 * 
	 * @return
	 */

	
	/**
	 * setter method for name
	 * 
	 * @param name
	 */

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter for number of batteries
	 * 
	 * @return
	 */

	public int getNumberOfBatteries() {
		return numberOfBatteries;
	}

	/**
	 * setter method for number of batteries with validation of Mandatory value
	 * between 0-3 (inclusive) if out of range exception thrown
	 * 
	 * @param numberOfBatteries
	 * @throws IllegalArgumentException
	 */

	public void setNumberOfBatteries(int numberOfBatteries) throws IllegalArgumentException {
		if (numberOfBatteries >= 0 && numberOfBatteries < 4) {
			this.numberOfBatteries = numberOfBatteries;
		} else {
			throw new IllegalArgumentException("number of batteries out of range");
		}

	}

	/**
	 * getter method for current height
	 * 
	 * @return
	 */

	public double getCurrentHeight() {
		return currentHeight;
	}

	/**
	 * setter method for current height with validation of madatory value
	 * between 0.0 and 4.5 inclusive if out of range exception thrown
	 * 
	 * @param currentHeight
	 * @throws IllegalArgumentException
	 */

	public void setCurrentHeight(double currentHeight) throws IllegalArgumentException {

		if ((currentHeight >= LOWER_HEIGHT) && (currentHeight <= MAX_HEIGHT)) {
			this.currentHeight = currentHeight;
		} else {
			throw new IllegalArgumentException(
					"current height value out of range must be between 0.0 and 4.5(inclusive)");
		}
	}
	
	/**
	 * method to set current height to 0.0
	 */

	@Override
	public void emergencyLand() {
		this.currentHeight = 0.0;

	}

}
