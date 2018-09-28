package virtualpetAMOK;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter {

	Map<String, Pet> pets = new HashMap<String, Pet>();

	public void addPet(Pet petToAdd) {
		pets.put(petToAdd.getName(), petToAdd);

	}

	public void removePet(String petToRemove) {
		pets.remove(petToRemove);

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

	public Collection<Pet> showPets() {
		Collection<Pet> petCollection = pets.values();
		return petCollection;
	}
	public void walkDogs() {
		for (Pet eachPet : pets.values()) {
			if (eachPet instanceof Walkable)
				( (Walkable) eachPet).walk();
		}
		
}
}