package virtualpetAMOK;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
	
	@Test
	public void shouldCcleanCage( ) {
		Dog underTest = new Dog();
		underTest.cleanCage();
		int result = underTest.cleanCage();
		Assert.assertEquals(0, result);
		
			
	}
	@Test
	public void shouldWalkDog( ) {
		Walkable underTest = new Dog();
		underTest.walkDog();
		int result = ((Dog) underTest).getHappiness();
		Assert.assertEquals(10, result);
		
			
	}
	
	
	
}
