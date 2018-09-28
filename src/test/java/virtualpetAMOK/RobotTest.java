package virtualpetAMOK;

import org.junit.Assert;
import org.junit.Test;

public class RobotTest {
	
	@Test
	public void shouldAddOil( ) {
		Robot underTest = new Robot(null, null, 0, 0, false, 0, false);
		underTest.maintainRobot();
		int result = underTest.getOilLevel();
		Assert.assertEquals(100, result);

}
	@Test
	public void isADog() {
	Robot underTest = new Robot(null, null, 0, 0, false, 0, true);
	boolean result= underTest.animalTypeDog;
			Assert.assertEquals(true, result);
}}
