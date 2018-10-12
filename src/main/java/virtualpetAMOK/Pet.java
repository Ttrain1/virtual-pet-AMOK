package virtualpetAMOK;

public class Pet  {

	private String name;
	private String description;
	int happiness;
	public int health;
	private boolean alive;

public Pet(String name, String description) {
		this.name = name;
		this.description = description;
	}	
	
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

	public boolean getAlive() {
			return alive;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}

 

