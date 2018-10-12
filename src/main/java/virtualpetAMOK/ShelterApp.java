package virtualpetAMOK;

import java.util.Scanner;

public class ShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Shelter shelter = new Shelter();
		// shelter.addPet(input.nextLine());

		System.out.println("Welcome to back to the shelter, pets are running AMOK.");
		System.out.println();

		boolean gameOn = true;

		do {
			displayStatusAndDisplayUserOptions(shelter);
			int userAction = input.nextInt();
			input.nextLine();
			if (userAction > 10) {
				System.out.println("Invalid entry, please try again...");

			} else if (userAction == 1) {
				shelter.feedOrganicPets();
				System.out.println("Thanks for feeding the pets!");
			} else if (userAction == 2) {
				shelter.waterOrganicPets();
				System.out.println("Thanks for giving the pets water!");
			} else if (userAction == 3) {
				shelter.oilRobots();
				System.out.println("Thanks for oiling the robots!");
			} else if (userAction == 4) {
				playWithOnePet(input, shelter);
			} else if (userAction == 5) {
				shelter.walkDogs();
				System.out.println("Thanks for walking the dogs!");
			} else if (userAction == 6) {
				shelter.cleanDogCage();
				System.out.println("Thanks for cleaning the dog cages!");
			} else if (userAction == 7) {
				shelter.cleanTheLitterBox();
				System.out.println("Thanks for cleaning the cat litter box!");
			} else if (userAction == 8) {
				adopt(input, shelter);
			} else if (userAction == 9) {
				admitPet(input, shelter);
			} else if (userAction == 10) {
				System.out.println("Thanks for playing!");
				boolean newGameOn = false;
				gameOn = newGameOn;
			}
			shelter.tickPets();

		}

		while (gameOn == true);

		input.close();

	}

	private static void adopt(Scanner input, Shelter shelter) {
		System.out.println("Choose which pet you would like to adopt.");
		System.out.println();
		displayPetNamesAndDescriptions(shelter);
		System.out.println("Enter the name of the pet you would like to adopt.");
		String name = input.nextLine();
		System.out.println();
		System.out.println("You adopt " + name + ". Have fun!");
		shelter.removePet(name);
	}

	private static void admitPet(Scanner input, Shelter shelter) {
		System.out.println("Thank you for bringing your pet.");
		System.out.println("What is your pet's name?");
		String name = input.nextLine();
		System.out.println("Please describe your pet.");
		System.out.println("Is It a Dog, Cat, or Robot.");
		String desc = input.nextLine();
		if (desc.equalsIgnoreCase("Cat")) {
			Cat petToAdd = new Cat(name, desc, 50, 50, true, 50, 50, 1);
			System.out.println("We will take good care of " + name + ".");
			shelter.addPet(name, petToAdd);
		} else if (desc.equalsIgnoreCase("Dog")) {
			Dog petToAdd = new Dog(name, desc, 50, 50, true, 50, 50, 1);
			System.out.println("We will take good care of " + name + ".");
			shelter.addPet(name, petToAdd);
		} else if (desc.equalsIgnoreCase("Robot")) {
			System.out.println("Is your Robot a Cat or Dog");
			String robotDescription = input.nextLine();
			if (robotDescription.equalsIgnoreCase("dog")) {
				Robot petToAdd = new Robot(name, desc, 50, 50, true, 100, "dog");
				System.out.println("We will take good care of " + name + ".");
				shelter.addPet(name, petToAdd);
			} else {
				Robot petToAdd = new Robot(name, desc, 50, 50, true, 100, "cat");
				System.out.println("We will take good care of " + name + ".");
				shelter.addPet(name, petToAdd);
			}
		}
	}

	private static void playWithOnePet(Scanner input, Shelter shelter) {
		System.out.println("Choose which pet you would like to play with.");
		System.out.println();
		displayStatusAndDisplayUserOptions(shelter);
		System.out.println("Enter the name of the pet you would like to play with.");
		String name = input.nextLine();
		System.out.println();
		System.out.println("You play with " + name);
		shelter.playWithOnePet(name);
	}

	private static void displayPetNamesAndDescriptions(Shelter shelter) {
		for (Pet pet : shelter.showPets()) {
			System.out.println("[" + pet.getName() + "] " + pet.getDescription());
		}

	}

	private static void displayStatusAndDisplayUserOptions(Shelter shelter) {
		System.out.println("Here is the status of our guests:");
		System.out.println();
//		System.out.println("Name\t|Descr\t|Happiness\t|Health\t|Hunger\t|Thirst\t|Oil\t|Cage Waste\t|LiterBox ");

		System.out.println("--------------------------------");
		for (Pet eachPet : shelter.showPets()) {
			if (eachPet instanceof Cat) {
				System.out.println("Name\t|Descr\t|Happiness\t|Health\t|Hunger\t|Thirst");
				System.out.println(eachPet.getName() + "\t|" + eachPet.getDescription() + "\t|" + eachPet.getHappiness()
						+ "\t\t|" + eachPet.getHealth() + "\t|" + ((Organic) eachPet).getHungerLevel() + "\t|"
						+ ((Cat) eachPet).getThirstLevel());
			}
			if (eachPet instanceof Dog) {
				System.out.println("Name\t|Descr\t|Happiness\t|Health\t|Hunger\t|Thirst\t|Cage Waste ");
				System.out.println(eachPet.getName() + "\t|" + eachPet.getDescription() + "\t|" + eachPet.getHappiness()
						+ "\t\t|" + eachPet.getHealth() + "\t|" + ((Organic) eachPet).getHungerLevel() + "\t|"
						+ ((Dog) eachPet).getThirstLevel() + "\t|" + ((Dog) eachPet).getCageWasteStatus());
			}
			if (eachPet instanceof Robot) {
				System.out.println("Name\t|Descr\t|Happiness\t|Health\t|Oil \t| Type ");
				System.out.println(eachPet.getName() + "\t|" + eachPet.getDescription() + "\t|" + eachPet.getHappiness()
						+ "\t\t|" + eachPet.getHealth() + "\t|" + ((Robot) eachPet).getOilLevel() + "\t|"
						+ ((Robot) eachPet).getAnimalType());
			}
			System.out.println("Litter Box poop");
			System.out.println(shelter.getLitterBox());
		}
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("1. Feed the pets");
		System.out.println("2. Hydrate the pets");
		System.out.println("3. Oil all pets");
		System.out.println("4. Play with a pet");
		System.out.println("5. Walk dogs");
		System.out.println("6. Clean dog cages");
		System.out.println("7. Clean Litter Box");
		System.out.println("8. Adopt a pet");
		System.out.println("9. Admit a pet");
		System.out.println("10. Quit");
		System.out.println();
	}

}
//*
//*   Functionality needed:
//*		
//*     - User options to include (from last project:
//*			
//*			
//*			- Allow selection of a pet to play with (produce selection list)
//*			-- Allow adoption (i.e. removal) of a pet (produce slection list)	
//*			
//*			- Allow retrieval of specific pet based on name
//*			- Allow to produce a complete list of pets	
//*	    - User options to include (this project):  
//*			- Walk all dogs
//*			- Clean all dog cages
//*			- Clean the litterbox 
//*			
//*
//*      Also print list of status for all pets
//*
//*
//*
//*
//*
//*
//*
//*