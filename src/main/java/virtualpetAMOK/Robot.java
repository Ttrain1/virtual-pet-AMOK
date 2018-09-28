package virtualpetAMOK;

public class Robot extends Pet {

	int oilLevel = 50;
	boolean animalTypeDog = true;
	
	public Robot(String name, String description, int happiness, int health, boolean alive, 
			int oilLevel, boolean animalTypeDog) {
		super(name, description, happiness, health, alive);
		this.oilLevel=oilLevel;
		this.animalTypeDog=animalTypeDog;
	}

	public void shouldAddOil() {
		oilLevel = 100;
		
	}

	public int getOilLevel() {
		
		return oilLevel;
	}

	public boolean isAnimalTypeDog() {
		return animalTypeDog;
	}

	public void setAnimalTypeDog(boolean animalTypeDog) {
		this.animalTypeDog = animalTypeDog;
	}

	
	public void walk() {
		happiness +=20;
			
	}

	public void maintainRobot() {
		oilLevel = 100;
		
	}
}
