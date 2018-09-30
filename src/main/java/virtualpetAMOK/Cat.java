package virtualpetAMOK;

public class Cat extends Organic {

	private int catPoopValue = 1;

	public Cat(String name, String description, int happiness, int health, boolean alive, int hungerLevel,
			int thirstLevel, int catPoopValue) {
		super(name, description, happiness, health, alive, hungerLevel, thirstLevel);
		this.catPoopValue = catPoopValue;
	}

	public int getCatPoopValue() {
		return catPoopValue;
	}

	public void catTick() {
		hungerLevel += 5;
		thirstLevel += 5;

	}

}
