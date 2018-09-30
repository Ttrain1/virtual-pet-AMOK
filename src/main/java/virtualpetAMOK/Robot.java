package virtualpetAMOK;

public class Robot extends Pet implements Walkable {

	int oilLevel = 50;
	String animalType;

	public Robot(String name, String description, int happiness, int health, boolean alive, int oilLevel,
			String animalType) {
		super(name, description, happiness, health, alive);
		this.oilLevel = oilLevel;
		this.animalType = animalType;
	}

	public void setOilLevel(int oilLevel) {
		this.oilLevel = oilLevel;
	}

	public void setAnimalType(String animalType) {
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
		System.out.println(animalType);
		if (animalType.equalsIgnoreCase("Dog")) {
			happiness += 20;

		}
		if (animalType.equalsIgnoreCase("Cat")) {
			happiness += 0;
		}
	}

	public void maintainRobot() {
		oilLevel = 100;

	}

	public void tickRobot() {
		oilLevel -= 5;

	}

}
