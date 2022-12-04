import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginTest  {

	@Test
	public WebDriver LoginTest() throws InterruptedException
	{
	WebDriver driver = WebDriverManager.chromedriver().create();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/");
	LoginPage Lp = new LoginPage(driver);
	Lp.uname().click();
	Lp.uname().sendKeys("Admin");
	Lp.pwd().click();
	Lp.pwd().sendKeys("admin123");
	Lp.Login().click();
	Thread.sleep(3000);
	Thread.sleep(5000);
	return driver;

	
	}
}