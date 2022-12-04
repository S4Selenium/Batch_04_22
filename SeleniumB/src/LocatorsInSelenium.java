import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LocatorsInSelenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		//driver.findElement(By.className("nav-item")).click();
		// Locators in Selenium
		/*
		 * 1.ID 2.Name 3.ClassName 4.LinkText 5.PartialLinkText 6.xpath 7.css
		 */
        //driver.findElement(By.id("user-name")).click();
        //driver.findElement(By.name("user-name")).sendKeys("standard_user");
		//Input Form
		Thread.sleep(5000);
	}

}
