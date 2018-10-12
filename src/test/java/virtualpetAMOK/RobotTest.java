package virtualpetAMOK;

import org.junit.Assert;
import org.junit.Test;

public class RobotTest {

	@Test
	public void shouldAddOil() {
		Robot underTest = new Robot("", "", 0, 0, true, 100, "");
		underTest.maintainRobot();
		int result = underTest.getOilLevel();
		Assert.assertEquals(100, result);

	}

	@Test
	public void isADog() {
		Robot underTest = new Robot("", "", 0, 0, true, 100, "Dog");
		String result = underTest.animalType;
		Assert.assertEquals("Dog", result);
	}
	
	@Test
	public void robotTick() {
		Robot underTest = new Robot("", "", 0, 0, true, 100, "");
		underTest.maintainRobot();
		underTest.tickRobot();
		int result = underTest.getOilLevel();
		Assert.assertEquals(95, result);
	}
	@Test
	public void dontWalkRobotCat() {
		Robot underTest = new Robot("", "", 0, 0, true, 100, "Dog");
		underTest.walk();
		Assert.assertEquals(20, underTest.happiness);

	}
}
