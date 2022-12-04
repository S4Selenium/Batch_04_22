import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	//POM without PageObject Factory
	WebDriver driver;
		
	By username=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@name='password']");
	By LoginButton = By.xpath("//button[@type='submit']");
	
	
	 LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
		 
	}

	public WebElement uname()
	{
		return driver.findElement(username);
	}
	
	public WebElement pwd()
	{
		return driver.findElement(password);
	}
	
	public WebElement Login()
	{
		return driver.findElement(LoginButton);
		
	}
}
