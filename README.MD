CLASSES

Pets - Superclass
	Name
	Description
	isAlive - boolean
	Happiness Level - int
	
Organic - Child to Superclass Pet
	Hunger Level - Int
	Thirst Level - Int

Dogs - Child to Organic Superclass
Cage Waste – Int
Change in Waste – Int?

Cats - Child to Organic  Superclass
	Litterbox Cleanliness - Int

Robot Pet - Child of Pet
	Robot Pet Type - String
	Oil Level - int

Shelter – Child or Superclass Relationship?  
	


IINTERFACES

Walkable - includes both organic and robot



BUSINESS REQUIREMENTS

Track cage cleanliness for organic dogs
Track shelter litter box cleanliness for organic cats
Track oil/maintenance level for robot dog/cats



******** For VirtualPet class and related subclasses/interfaces:

Allow for dogs and cats to be robotic
Introduce an attribute (instance variable) representing overall health that is updated as a result of other attributes moving in a negative or positive direction, influencing happiness
Introduce methods that allow for:
Oiling robotic pets
Walking dogs, decreasing the likelihood that organic dogs will soil their cages, while increasing happiness in all dogs

Do not allow:

Feeding/watering robotic pets
 Oiling organic pets

Modify the tick method to return a value indicating the amount of waste a pet creates, which should contribute to either (optionally, create accessor methods to retrieve these values instead):

    Amount of waste in the litter box
    Amount of waste in an individual dog cage

Include the last project’s requirements:


Include instance variables representing:
Name (from the above example, this might be “Tommy”)
Description (from the above example, this might be “smells like a Stargazer lily fresh with morning dew”)
Include a constructor that accepts a name and description
Include a constructor that, in addition to name and description, accepts default values for the pet’s attributes (hunger, boredom, etc)

Do not include a default (zero arguments) constructor.

******** For VirtualPetShelter class:


Oiling Robotic Pets
Cleaning dog cages
Emptying the litterbox
Ensure feeding/watering of pets that are NOT robotic




Include the last project’s requirements:

Include appropriate instance variable(s) to store the pets who reside at the shelter.
Include a tick method that calls the tick method for each of the pets in the shelter, updating their needs
Include methods that:

Return a Collection of all of the pets in the shelter
Return a specific VirtualPet given its name
Allow intake of a homeless pet
Allow adoption of a homeless pet
Feed all of the pets in the shelter
Water all of the pets in the shelter
Plays (or performs some other interaction(s)) with an individual pet in the shelter


******** For VirtualPetShelterApp class:

Add options to:
    Walk all dogs
    Clean dog cages
    Clean the shelter litterbox
    Oil all robotic pets

Include the last project’s requirements:

Create a main method that:

Implements a game loop.
Asks for user input.
Writes output to the console.
Calls VirtualPetShelter’s tick method after each interaction

Available user interface actions should include (at minimum):

Feeding all the pets
Watering all the pets
Playing with an individual pet, which should display a list of pet names and descriptions, allowing a user to select one
Allow adoption of a pet, which should display a list of pet names and descriptions, allowing a user to select one
Allow intake of a pet, prompting the user for the pet’s information, requiring the user to (at minimum) specify name and description


DESIGN REQUIREMENTS

Create a README.MD file to describe what you’ve don’t with your project.

Encapsulate all instance variables. ?

Assign appropriate viability modifiers only used internally by a class or within a class hierarchy

OTHER  REQUIREMENTS

Start text here.
