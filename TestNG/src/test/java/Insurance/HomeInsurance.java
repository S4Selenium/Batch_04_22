package Insurance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeInsurance {
	@Test(priority =1,groups= {"Regression"})
	public void HomeWebLogin()
	{
		System.out.println("Home Insurance WebLogin");
	}
	@Test(priority=2)
	public void HomeWebLogOut()
	{
		System.out.println("Home Insurance WebLogout");
		
	}
	@Test(priority=3)
	public void HomeMobileLogIn()
	{
		System.out.println("Home Insurance MobileLogIn");
		//Assert.assertEquals(false, true);
		//SoftAssert asert = new SoftAssert();
		//asert.assertEquals(1, 0);
		//System.out.println("I will get executed");
		
	}
	@Test(priority=4)
	public void  HomeMobileLogOut()
	{
		System.out.println("Home Insurance MobileLogout");
	}

	
}
