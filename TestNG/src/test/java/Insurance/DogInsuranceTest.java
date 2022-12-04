package Insurance;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class DogInsuranceTest {
	//Annotations in TESTNG  Before Method
	
	   @BeforeMethod 
	  public void Bmethod() {
	  System.out.println("!!!I will get executed before each method!!!"); 
	  }
	   
	   @AfterMethod
	   public void Amethod() {
			  System.out.println("!!!I will get executed after each method!!!"); 
			  }
	   @BeforeClass
	   public void BClass()
	   {
		   System.out.println("I will get executed before each class");
	   }
	   @AfterClass
	   public void AClass()
	   {
		   System.out.println("I will get executed after each class");
	   }
	   @BeforeSuite
	   public void Bsuite()
	   {
		   System.out.println("I will get executed before each Suite");
	   }
	   @AfterSuite
	   public void Asuite()
	   {
		   System.out.println("I will get executed after each Suite");
	   }
	   @BeforeTest
	   public void BTest()
	   {
		   System.out.println("I will get executed before the Test");
	   }
	   @AfterTest
	   public void ATest()
	   {
		   System.out.println("I will get executed after the Test");
	   }
	   
	   @BeforeGroups(groups= {"Regression"})
	   public void Bgroups()
	   {
		   System.out.println("I will get executed before the GROUP");
	   }
	   @AfterGroups(groups= {"Regression"})
	   public void Agroups()
	   {
		   System.out.println("I will get executed afer the GROUP");
	   }
	 
	@Test(priority =1,groups= {"Regression"})
	public void DogWebLogin()
	{
		System.out.println("Dog Insurance WebLogin");
		
	}
	@Test
	public void CatWebLogin()
	{
		System.out.println("Cat Insurance WebLogin");
	}
	@Test(priority=2)
	public void DogWebLogOut()
	{
		System.out.println("Dog Insurance WebLogout");
	}
	@Test(priority=3)
	public void DogMobileLogIn()
	{
		System.out.println("Dog Insurance MobileLogIn");
		//Assert.assertEquals(false, true);
		//SoftAssert asert = new SoftAssert();
		//asert.assertEquals(1, 0);
		//System.out.println("I will get executed");
	}
	@Test(priority=4)
	public void  DogMobileLogOut()
	{
		System.out.println("Dog Insurance MobileLogout");
	}

}
