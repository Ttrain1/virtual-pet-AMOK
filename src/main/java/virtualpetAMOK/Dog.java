package virtualpetAMOK;

public class Dog extends Organic implements Walkable {

	int cageWaste = 2;
	int happiness = 0;
	int wasteChance = 0;
	
	
	public int cleanCage() {
		return cageWaste = 0;
		
	}

	/* (non-Javadoc)
	 * @see virtualpetAMOK.walkable#walkDog()
	 */
	@Override
	public void walkDog() {
		happiness += 10;
		wasteChance -= 2;
	
	
	}

	public int getCageWaste() {
		return cageWaste;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getWasteProductionChance() {
		return wasteChance;
	}

}
