package virtualpetAMOK;

public class Dog extends Organic implements Walkable {

	private int cageWaste = 2;
	private int wasteChance = 0;

	public Dog(String name, String description, int happiness, int health, boolean alive, int hungerLevel,
			int thirstLevel, int cageWaste) {
		super(name, description, happiness, health, alive, hungerLevel, thirstLevel);
		this.cageWaste = cageWaste;
	}

	public int cleanCage() {
		return cageWaste = 0;

	}

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

	public void increaseCageWaste() {

		if (wasteChance <= 3) {
			cageWaste += 1;
		} else if (wasteChance >= 4) {
			cageWaste += 2;
		} else if (wasteChance >= 4) {
			cageWaste += 3;
		}

	}

	public void dogTick() {
		wasteChance++;
		increaseCageWaste();
		hungerLevel += 5;
		thirstLevel += 5;

	}

	public int getCageWasteStatus() {
		return cageWaste;
	}

}
