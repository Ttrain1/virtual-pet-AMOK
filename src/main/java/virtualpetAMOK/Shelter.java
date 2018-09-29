package virtualpetAMOK;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter {

	int litterBox = 0;
	public Shelter(int litterBox) {
		this.litterBox = litterBox;
	}
	
	
	Map<String, Pet> pets = new HashMap<String, Pet>();

	public void addPet(Pet petToAdd) {
		pets.put(petToAdd.getName(), petToAdd);
		//* Needs to add pet name and description. Add functionality to ShelterApp 

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
		//* Must have a user option to water all pets in ShelterApp	
		//* Improve health after watering		
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
			}
	}
	public void walkDogs() {
		for (Pet eachPet : pets.values()) {
			if (eachPet instanceof Walkable)
				( (Walkable) eachPet).walk();
		}
		
}

	public Collection<Pet> showPets() {
		Collection<Pet> petCollection = pets.values();
		return petCollection;
	}

	public void  cleanLitterBox() {
		System.out.println("cleanLitter Box");
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
	}


	

		
	



