package virtualpetAMOK;

public class Pet {

	String name;
	String description;
	int happiness;
	int health;
	boolean alive;
	
	
public Pet(String name, String description, int happiness, int health, boolean alive) {
		this.name = name;
		this.description = description;
		this.happiness = happiness;
		this.health = health;
		this.alive = alive;
	}

	
	public String getName() {
		return name;
	}


	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public String getDescription() {
		return description;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getHealth() {
		return health;
	}

	public boolean isAlive() {
		return alive;
	}


	public void play() {
		happiness += 20;
		
	}

}