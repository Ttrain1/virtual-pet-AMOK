package virtualpetAMOK;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
//* WHAT IS THE FORMAL RELATION SHIP to PET/DOG/CAT/ROBOT
public class Shelter {

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
		//* Improve health after feeding?		
				}
		}
	}

	public void oilRobots() {
		for (Pet eachPet : pets.values()) {
			if (eachPet instanceof Robot) {
				//* Improve health after maintaining ?
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
		//* Increase happiness
		playingPet.play();
		}

	public Collection<Pet> showPets() {
		Collection<Pet> petCollection = pets.values();
		return petCollection;
	}
	public void walkDogs() {
		for (Pet eachPet : pets.values()) {
			//* Increase health and/or happiness?
			if (eachPet instanceof Walkable)
				( (Walkable) eachPet).walk();
		}
		
}

	public void tickPets() {
		for (Pet eachPet : pets.values()) {
			if (eachPet instanceof Robot)
				((Robot) eachPet).tickRobot();
			if (eachPet instanceof Dog)
				((Dog) eachPet).dogTick();
			if (eachPet instanceof Cat)
				((Cat) eachPet).catTick();

		}
		
	}

	public void trackStatus() {
		for (Pet eachPet : pets.values()) {
			if (eachPet instanceof Robot)
				((Robot) eachPet).getOilLevel();
			if (eachPet instanceof Dog)
				((Dog) eachPet).getCageWasteStatus();
				((Dog) eachPet).getWasteProductionChance();
			if (eachPet instanceof Cat)
				((Cat) eachPet).getLitterBoxPoopValue();
	
	}
		
	}	
}
//*			
//*			
//*             Shelter tick()method should track levels for Dog/Cat/Robot and produce a message if  
//*                   falls below a certain level


