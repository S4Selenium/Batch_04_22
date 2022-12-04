package Insurance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HealthInsurance {
	@Test(priority=1,groups= {"Regression"})
	public void HealthWebLogin()
	{
		System.out.println("Health Insurance WebLogin");
	}
	@Test(priority=2)
	public void HealthWebLogOut()
	{
		System.out.println("Health Insurance WebLogout");
	}
	@Test(priority=3)
	public void HealthMobileLogIn()
	{
		System.out.println("Health Insurance MobileLogIn");
		//Assert.assertEquals(false, true);
		//SoftAssert asert = new SoftAssert();
		//asert.assertEquals(1, 0);
		//System.out.println("I will get executed");
		
	
	}
	@Test(priority=4)
	public void  HealthMobileLogOut()
	{
		System.out.println("Health Insurance MobileLogout");
	}

}
