package Insurance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VehicleInsuranceTest {
	
	@Test (priority =1,groups= {"Regression"})
	public void VehicleWebLogin()
	{
		System.out.println("Vehicle Insurance WebLogin");
	
	}
	@Test(priority=2)
	public void VehicleWebLogOut()
	{
		System.out.println("Vehicle Insurance WebLogout");
	}
	@Test(priority=3)
	public void VehicleMobileLogIn()
	{
		System.out.println("Vehicle Insurance MobileLogIn");
		//Assert.assertEquals(false, true);
		//SoftAssert asert = new SoftAssert();
		//asert.assertEquals(1, 0);
		//System.out.println("I will get executed");
		
	
	}
	@Test(priority=4)
	public void  VehicleMobileLogOut()
	{
		System.out.println("Vehicle Insurance MobileLogout");
	}

}
