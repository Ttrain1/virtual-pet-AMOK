package virtualpetAMOK;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.not;


public class ShelterTest {
	@Test
	public void shouldAddPet( ) {
		Shelter underTest = new Shelter();
		Pet nick = new Pet(null, null, 0, 0, false);
		underTest.addPet(nick);
		
		Assert.assertThat(underTest.pets.values(), contains(nick));

	}
	@Test
	public void shouldRemovePet( ) {
		Shelter underTest = new Shelter();
		Pet nick = new Pet(null, null, 0, 0, false);
		String name = nick.getName();
		underTest.addPet(nick);
		underTest.removePet(name);
		
		Assert.assertThat(underTest.pets.values(), not(nick));

	}
	@Test
	
	public void changePetVariableValue () {
		Shelter underTest = new Shelter();
		Dog nick = new Dog("", "cat", 20, 100, false, 20, 0, 0);
		underTest.addPet(nick);
		underTest.feedOrganicPets();
		
		Assert.assertEquals(10, (nick).getHungerLevel());

	}
	@Test
	
	public void changePetVariableOilLevel () {
		Shelter underTest = new Shelter();
		Robot nick = new Robot("", "", 100, 100, true, 50, true);
		underTest.addPet(nick);
		underTest.oilRobots();
		
		Assert.assertEquals(100, (nick).getOilLevel());

	}
	@Test
	
	public void shouldWalkDogs () {
		Shelter underTest = new Shelter();
		Dog nick = new Dog("", "", 100, 80, true, 100, 100, 0);
		underTest.addPet(nick);
		underTest.walkDogs();
		Assert.assertEquals(110, (nick).getHappiness());

	}
	@Test
	public void shouldWalkRobots () {
		Shelter underTest = new Shelter();
		Robot nick = new Robot("", "", 0, 1, true, 100, false);
		underTest.addPet(nick);
		underTest.walkDogs();
		Assert.assertEquals(20, (nick).getHappiness());
	}
}
