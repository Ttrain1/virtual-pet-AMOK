package virtualpetAMOK;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter {

	private int litterBox = 0;
	Map<String, Pet> pets = new HashMap<String, Pet>();

	public void addPet(String name, Pet petToAdd) {
		pets.put(name, petToAdd);

	}

	public void removePet(String name) {
		pets.remove(name);

	}

	public void feedOrganicPets() {
		for (Pet eachPet : pets.values()) {
			if (eachPet instanceof Organic) {
				((Organic) eachPet).feedPet();

			}
		}
	}

	public void oilRobots() {
		for (Pet eachPet : pets.values()) {
			if (eachPet instanceof Robot) {
				((Robot) eachPet).maintainRobot();
			}
		}
	}

	public void waterOrganicPets() {
		for (Pet eachPet : pets.values()) {
			if (eachPet instanceof Organic)
				((Organic) eachPet).hydratePet();
		}
	}

	public void playWithOnePet(String name) {
		Pet playingPet = pets.get(name);
		playingPet.play();
	}

	public void tickPets() {
		for (Pet onePet : pets.values()) {
			if (onePet instanceof Robot) {
				((Robot) onePet).tickRobot();
			}
			if (onePet instanceof Dog) {
				((Dog) onePet).dogTick();
			}
			if (onePet instanceof Cat) {
				((Cat) onePet).catTick();
			}
			raisePetHP();
			raisePetHappiness();
			addPoopToLitterBox();
		}
	}

	public void walkDogs() {
		for (Pet eachPet : pets.values()) {
			if (eachPet instanceof Walkable)
				((Walkable) eachPet).walk();
		}

	}

	public Collection<Pet> showPets() {
		Collection<Pet> petCollection = pets.values();
		return petCollection;
	}

	public void cleanTheLitterBox() {
		litterBox = 0;

	}

	public void cleanDogCage() {
		for (Pet eachPet : pets.values()) {
			if (eachPet instanceof Dog)
				((Dog) eachPet).cleanCage();
		}
	}

	public int getLitterBox() {
		return litterBox;
	}

	public void addPoopToLitterBox() {
		for (Pet eachPet : pets.values()) {
			if (eachPet instanceof Cat)
				litterBox += (((Cat) eachPet).getCatPoopValue());
		}
	}

	public void raisePetHP() {
		for (Pet eachPet : pets.values()) {
			int newHealth = 0;
			if (eachPet instanceof Cat) {
				newHealth = eachPet.getHappiness() + 20 - (((Cat) eachPet).getHungerLevel() / 10)
						- (((Cat) eachPet).getThirstLevel() / 10) - getLitterBox();

			} else if (eachPet instanceof Robot) {
				newHealth = eachPet.getHappiness() + (((Robot) eachPet).getOilLevel() / 10)
						+ (eachPet.getHappiness() / 10);

			} else if (eachPet instanceof Dog) {
				newHealth = eachPet.getHappiness() + 20 - (((Dog) eachPet).getHungerLevel() / 10)
						- (((Dog) eachPet).getThirstLevel() / 10) - (((Dog) eachPet).getCageWasteStatus() / 10)
						+ (eachPet.getHappiness() / 5);

			}
			eachPet.setHealth(newHealth);

		}
	}

	public void raisePetHappiness() {
		for (Pet eachPet : pets.values()) {
			int newHappiness = 0;
			if (eachPet instanceof Cat) {
				newHappiness = eachPet.getHappiness() + 20 - (((Cat) eachPet).getHungerLevel() / 10)
						- (((Cat) eachPet).getThirstLevel() / 10) - getLitterBox();
			} else if (eachPet instanceof Robot) {
				newHappiness = eachPet.getHappiness() + 5 + (((Robot) eachPet).getOilLevel() / 10);

			} else if (eachPet instanceof Dog) {
				newHappiness = eachPet.getHappiness() + 20 - (((Dog) eachPet).getHungerLevel() / 10)
						- (((Dog) eachPet).getThirstLevel() / 10) - (((Dog) eachPet).getCageWasteStatus() / 10);
			}
			eachPet.setHappiness(newHappiness);

		}
	}

}
