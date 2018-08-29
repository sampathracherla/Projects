package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestB {
	
	@BeforeTest
	public void before()
	{
		System.out.println("@BeforeTest");
	}
	@AfterTest
	public void after()
	{
		System.out.println("@AfterTest");
	}

@Test
public void testB()
{
	String expVal="A";
	String  actVal="A";
	System.out.println("InTestB");

	Assert.assertEquals(actVal, expVal);
	Assert.assertTrue(14>13, "This condition is pass or fail");
	//Assert.fail("Some error");
	}

}
