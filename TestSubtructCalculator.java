package testCal;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseCal.NewCalculator;

public class TestSubtructCalculator {

	NewCalculator newCal;

	@BeforeClass
	public void classSetUp() {
		newCal = new NewCalculator();
	}

	@Test
	public void testSubtructWithPositivePositive() {
		Assert.assertEquals(newCal.getResult(35, 25, '-'), "Result: 35 - 25 = 10");

	}

	@Test
	public void testSubtrucWithPositiveNegative() {
		Assert.assertEquals(newCal.getResult(45, -35, '-'), "Result: 45 - -35 = 80");

	}

	@Test
	public void testSubtrucWithNegativeNagetive() {
		Assert.assertEquals(newCal.getResult(-25, -35, '-'), "Result: -25 - -35 = 10");

	}

	@Test
	public void testSubtrucWithNegativePositive() {
		Assert.assertEquals(newCal.getResult(-45, 35, '-'), "Result: -45 - 35 = -80");

	}

	@Test
	public void testSubtrucWithPositivezero() {
		Assert.assertEquals(newCal.getResult(25, 0, '-'), "Result: 25 - 0 = 25");

	}

	@Test
	public void testSubtrucWithzeroPositive() {
		Assert.assertEquals(newCal.getResult(0, 25, '-'), "Result: 0 - 25 = -25");

	}

	@Test
	public void testSubtrucWithNegativeZero() {
		Assert.assertEquals(newCal.getResult(-25, 0, '-'), "Result: -25 - 0 = -25");

	}

	@Test
	public void testSubtrucWithZeroNegative() {
		Assert.assertEquals(newCal.getResult(0, -35, '-'), "Result: 0 - -35 = 35");

	}

	@Test
	public void testSubtrucWithZeroZero() {
		Assert.assertEquals(newCal.getResult(0, 0, '-'), "Result: 0 - 0 = 0");
	}
	// TODO Auto-generated method stub

}
