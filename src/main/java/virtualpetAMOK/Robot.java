package virtualpetAMOK;

public class Robot {

	int oilLevel = 50;
	boolean animalTypeDog;
	
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

}
