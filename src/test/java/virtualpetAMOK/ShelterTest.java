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
	}
