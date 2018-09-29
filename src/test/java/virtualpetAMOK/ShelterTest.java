package virtualpetAMOK;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.not;


public class ShelterTest {
	@Test
	public void shouldAddPet( ) {
		Shelter underTest = new Shelter(0);
		Pet nick = new Pet(null, null, 0, 0, false);
		underTest.addPet(nick);
		
		Assert.assertThat(underTest.pets.values(), contains(nick));

	}
	@Test
	public void shouldRemovePet( ) {
		Shelter underTest = new Shelter(0);
		Pet nick = new Pet(null, null, 0, 0, false);
		String name = nick.getName();
		underTest.addPet(nick);
		underTest.removePet(name);
		
		Assert.assertThat(underTest.pets.values(), not(nick));

	}
	@Test
	
	public void changePetVariableValue () {
		Shelter underTest = new Shelter(0);
		Dog nick = new Dog("", "cat", 20, 100, false, 20, 0, 0);
		underTest.addPet(nick);
		underTest.feedOrganicPets();
		
		Assert.assertEquals(10, (nick).getHungerLevel());

	}
	@Test
	
	public void changePetVariableOilLevel () {
		Shelter underTest = new Shelter(0);
		Robot nick = new Robot("", "", 0, 0, true, 100, "");
		underTest.addPet(nick);
		underTest.oilRobots();
		
		Assert.assertEquals(100, (nick).getOilLevel());

	}
	@Test
	
	public void shouldWalkDogs () {
		Shelter underTest = new Shelter(0);
		Dog nick = new Dog("", "", 100, 80, true, 100, 100, 0);
		underTest.addPet(nick);
		underTest.walkDogs();
		Assert.assertEquals(110, (nick).getHappiness());

	}
	@Test
	//* THIS TEST WAS NOT WORKING AS OF FRIDAY
	public void shouldWalkRobots () {
		Shelter underTest = new Shelter(0);
		Robot nick = new Robot("", "", 0, 0, true, 100, "Cat");
		underTest.addPet(nick);
		underTest.walkDogs();
		Assert.assertEquals(20, (nick).getHappiness());
	}
	@Test

	public void shouldTickPetsCat () {
		Shelter underTest = new Shelter(0);
		Pet eachPet = new Cat(null, null, 0, 0, false, 0, 0, 0);
		underTest.addPet(eachPet);
		underTest.tickPets();
		Assert.assertEquals(1, ((Cat) eachPet).getLitterBoxPoopValue());
		
	}
	@Test
	
	public void shouldTickPetsRobot () {
		Shelter underTest = new Shelter(0);
		Robot nick = new Robot("", "", 0, 0, true, 100, "");
		underTest.addPet(nick);
		underTest.tickPets();
		Assert.assertEquals(95, ((Robot) nick).getOilLevel());
		
	}
	@Test
	
	public void shouldCleanLitterBox () {
		Shelter underTest = new Shelter(130);
		underTest.litterBox = 10;
		underTest.cleanLitterBox();
		int result = underTest.getLitterBox();
		Assert.assertEquals(0, result);
		
	}
	@Test
	
	public void cageWasteShouldBeZero() {
		Shelter underTest = new Shelter(0);
		Dog testPet = new Dog("", "", 0, 0, true, 0, 0, 10);
		underTest.addPet(testPet);
		underTest.cleanDogCage();
		Assert.assertEquals(0, testPet.getWasteProductionChance());
		
	}
}
