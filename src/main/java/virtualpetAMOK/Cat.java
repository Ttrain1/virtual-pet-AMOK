package virtualpetAMOK;

public class Cat extends Organic implements Healthier {

	private  int catPoopValue = 1;
	
	public Cat(String name, String description, int happiness, int health, boolean alive, int hungerLevel,
			int thirstLevel ,  int litterBoxPoopValue) {
		super(name, description, happiness, health, alive, hungerLevel, thirstLevel);
		this.catPoopValue=litterBoxPoopValue;
	}

	


	public int getCatPoopValue() {
		return catPoopValue;
	}

	public void catTick() {
	getCatPoopValue();
		
	} 
	
}
