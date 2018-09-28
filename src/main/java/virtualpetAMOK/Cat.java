package virtualpetAMOK;

public class Cat extends Organic {

	public Cat(String name, String description, int happiness, int health, boolean alive, int hungerLevel,
			int thirstLevel , int litterBoxPoopValue) {
		super(name, description, happiness, health, alive, hungerLevel, thirstLevel);
		this.litterBoxPoopValue=litterBoxPoopValue;
	}

	int litterBoxPoopValue;

	public int cleanLitterBox() {
		// TODO Auto-generated method stub
		return litterBoxPoopValue = 0;
	}

	public int getLitterBoxPoopValue() {
		return litterBoxPoopValue;
	} 
	
}
