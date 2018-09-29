package virtualpetAMOK;

import java.util.Scanner;

public class ShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean gameOn = true;
		
		do {
			int userAction = input.nextInt();
			input.nextLine();
			if (userAction > 4) {
				// Test for valid user input
				System.out.println("Invalid entry, please try again...");

			} else if (userAction == 4) {
				// See if user wants to exit game
				gameOn = false;
				System.out.println("Thanks for playing!!!");
			} else if (userAction == 1) {
				// *

			} else if (userAction == 2) {
				//
			} else if (userAction == 3) {
				//
			} else {
				// exception code
				System.out.println("Program error msg 1");
				gameOn = false;
			}

		} while (gameOn = true);

		input.close();

	}

}
//*
//*   Functionality needed:
//*		- Call Shelter tick() method after every loop interation
//*     - User options to include (from last project:
//*			- Feed All Pets - Organic and Robot
//*			- Water All Pets
//*			- Allow selection of a pet to play with (produce selection list)
//*			-- Allow adoption (i.e. removal) of a pet (produce slection list)	
//*			- Allow intake of a pet (need name and description at minimum)
//*			- Allow retrieval of specific pet based on name
//*			- Allow to produce a complete list of pets	
//*	    - User options to include (this project):  
//*			- Walk all dogs
//*			- Clean all dog cages
//*			- Clean the litterbox 
//*			- Oil all robotic pets
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