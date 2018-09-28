package virtualpetAMOK;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

	@Test
	public void shouldCcleanLitterBox( ) {
		Cat underTest = new Cat();
		underTest.cleanLitterBox();
		int result = underTest.cleanLitterBox();
		Assert.assertEquals(0, result);
		
			

	
	}
	
}
