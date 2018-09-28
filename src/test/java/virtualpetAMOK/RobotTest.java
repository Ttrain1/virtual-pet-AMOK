package virtualpetAMOK;

import org.junit.Assert;
import org.junit.Test;

public class RobotTest {
	
	@Test
	public void shouldAddOil( ) {
		Robot underTest = new Robot();
		underTest.shouldAddOil();
		int result = underTest.getOilLevel();
		Assert.assertEquals(100, result);

}
}
