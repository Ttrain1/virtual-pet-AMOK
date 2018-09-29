package virtualpetAMOK;

public class Organic extends Pet implements Healthier {
	int hungerLevel = 20;
	int thirstLevel = 20;
	
	public Organic(String name, String description, int happiness, int health, boolean alive, int hungerLevel, int thirstLevel  ) {
		super(name, description, happiness, health, alive);
		this.hungerLevel=hungerLevel;
		this.thirstLevel=thirstLevel;
	}

	public int feedPet() {
		hungerLevel -= 10;
		return getHungerLevel();
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public void setHungerLevel(int hungerLevel) {
		this.hungerLevel = hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public void setThirstLevel(int thirstLevel) {
		this.thirstLevel = thirstLevel;
	}

	public void hydratePet() {
		thirstLevel -= 20;
	}

	@Override
	public void raiseHP() {
		health +=(hungerLevel*1.25)+(thirstLevel*1.25)+(happiness/10) ;
	}

}
