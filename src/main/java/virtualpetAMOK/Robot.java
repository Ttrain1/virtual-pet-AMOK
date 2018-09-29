package virtualpetAMOK;

public class Robot extends Pet implements Walkable, Healthier {

	int oilLevel = 50;
	String animalType ="dog";

	public Robot(String name, String description, int happiness, int health, boolean alive, int oilLevel,
		String animalTypeDog) {
		super(name, description, happiness, health, alive);
		this.oilLevel = oilLevel;
		this.animalType = animalType;
	}

	public int getOilLevel() {

		return oilLevel;
	}

	public String getAnimalType() {
		return animalType;
	}


	@Override
	public void walk() {
		if (animalType.equalsIgnoreCase("Dog")) {
			happiness += 20;
	}	if(animalType.equalsIgnoreCase("Cat")) {
			happiness +=0;
		}
	}

	public void maintainRobot() {
		oilLevel = 100;

	}

	public void tickRobot() {
		oilLevel -= 5;
		
	}

	@Override
	public void raiseHP() {
		health += (oilLevel/10) + (happiness/10);
		
	}
}
