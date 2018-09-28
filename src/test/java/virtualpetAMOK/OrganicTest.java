package virtualpetAMOK;

import org.junit.Assert;
import org.junit.Test;

public class OrganicTest {
	
	@Test
	public void shouldFeed( ) {
		Organic underTest = new Organic(null, null, 0, 0, false, 20, 20);
		underTest.feedPet();
		int result = underTest.getHungerLevel();
		Assert.assertEquals(10, result);
}
	
	@Test
	public void shouldHydrate( ) {
		Organic underTest = new Organic(null, null, 0, 0, false, 10, 20);
		underTest.hydratePet();
		int result = underTest.getThirstLevel();
		Assert.assertEquals(0, result);
}
}
