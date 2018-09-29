package virtualpetAMOK;

public class Dog extends Organic implements Walkable, Healthier {

	private int cageWaste = 2;
	private int wasteChance = 0;
	
	public Dog(String name, String description, int happiness, int health, boolean alive, int hungerLevel,
			int thirstLevel, int cageWaste ) {
		super(name, description, happiness, health, alive, hungerLevel, thirstLevel);
		this.cageWaste=cageWaste;
	}

	
	
	public int cleanCage() {
		return cageWaste = 0;
		
	}

	/* (non-Javadoc)
	 * @see virtualpetAMOK.walkable#walkDog()
	 */
	@Override
	public void walk() {
		happiness += 10;
		wasteChance -= 2;
	
		}


	public int getHappiness() {
		return happiness;
	}

	public int getWasteProductionChance() {
		return wasteChance;
	}



	public void dogTick() {
		cageWaste ++;
		wasteChance ++;
				
	}

	public int getCageWasteStatus() {
			return cageWaste;
	}



	@Override
	public void raiseHP() {
		
		
	}

}
