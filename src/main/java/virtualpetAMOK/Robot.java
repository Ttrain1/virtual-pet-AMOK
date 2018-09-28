package virtualpetAMOK;

public class Robot extends Pet implements Walkable {

	int oilLevel = 50;
	boolean animalTypeDog;

	public Robot(String name, String description, int happiness, int health, boolean alive, int oilLevel,
			boolean animalTypeDog) {
		super(name, description, happiness, health, alive);
		this.oilLevel = oilLevel;
		this.animalTypeDog = animalTypeDog;
	}

	public int getOilLevel() {

		return oilLevel;
	}

	public boolean isAnimalTypeDog() {
		return animalTypeDog;
	}


	@Override
	public void walk() {
		if (animalTypeDog = true) {
			happiness += 20;
	}	else if(animalTypeDog = false) {
			happiness +=0;
		}
	}

	public void maintainRobot() {
		oilLevel = 100;

	}
}
