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
//	@Override
	public void walk() {
		happiness += 10;
		wasteChance -= 2;
	
	
	}

	public Dog(String name, String description, int happiness, int health, boolean alive, int hungerLevel,
			int thirstLevel, int cageWaste ) {
		super(name, description, happiness, health, alive, hungerLevel, thirstLevel);
		this.cageWaste=cageWaste;
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
