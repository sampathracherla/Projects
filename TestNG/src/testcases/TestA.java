package testcases;

import org.testng.annotations.Test;

public class TestA {
	@Test(priority=2)
	public void doLogin(){
		System.out.println("Do login test");
		
	}
	@Test (priority=1)
	public void doPasswordChange()
	{
		System.out.println("Change password");
	}

	@Test(priority=3)
	public void doLogout(){
		System.out.println("Do logout test");
	}
}
