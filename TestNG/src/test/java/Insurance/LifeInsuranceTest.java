package Insurance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LifeInsuranceTest {
	@Test(priority =1,groups= {"Regression"})
	public void LifeWebLogin()
	{
		System.out.println("Life Insurance WebLogin");
		
	}
	@Test(priority=2)
	public void LifeWebLogOut()
	{
		System.out.println("Life Insurance WebLogout");
	}
	@Test(priority=3)
	public void LifeMobileLogIn()
	{
		System.out.println("Life Insurance MobileLogIn");
		//Assert.assertEquals(false, true);
		//SoftAssert asert = new SoftAssert();
		//asert.assertEquals(1, 0);
		//System.out.println("I will get executed");
	}
	@Test(priority=4)
	public void  LifeMobileLogOut()
	{
		System.out.println("Life Insurance MobileLogout");
	}

}
