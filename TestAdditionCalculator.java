package testCal;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseCal.NewCalculator;

public class TestAdditionCalculator  {
	NewCalculator newCal;
	
	@BeforeClass 
	public void classSetUp(){
		newCal = new NewCalculator();
	}
	
	@Test
	public void testAdditionWithPositivePositive(){
		Assert.assertEquals(newCal.getResult(25, 35, '+'), "Result: 25 + 35 = 60");
		
	}
	@Test
	public void testAdditionWithPositiveNegative(){
		Assert.assertEquals(newCal.getResult(45, -35, '+'), "Result: 45 + -35 = 10");
		
	}
	@Test
	public void testAdditionWithNegativeNagetive(){
		Assert.assertEquals(newCal.getResult(-25, -35, '+'), "Result: -25 + -35 = -60");
		
	}
	@Test
	public void testAdditionWithNegativePositive(){
		Assert.assertEquals(newCal.getResult(-45, 35, '+'), "Result: -45 + 35 = -10");
		
	}

	 @Test
	 public void testAdditionWithPositivezero(){
	 Assert.assertEquals(newCal.getResult(25, 0, '+'), "Result: 25 + 0 = 25");
	
 }
	@Test
	 public void testAdditionWithzeroPositive(){
	 Assert.assertEquals(newCal.getResult(0, 25, '+'), "Result: 0 + 25 = 25");
	
	}
	 @Test
	public void testAdditionWithNegativeZero(){
	 Assert.assertEquals(newCal.getResult(-25, 0, '+'), "Result: -25 + 0 = -25");
	
	}
	 @Test
	public void testAdditionWithZeroNegative(){
	 Assert.assertEquals(newCal.getResult(0, -35, '+'), "Result: 0 + -35 = -35");

	}
	 @Test
	public void testAdditionWithZeroZero(){
	 Assert.assertEquals(newCal.getResult(0, 0, '+'), "Result: 0 + 0 = 0");
	 }
}
