import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsInSelenium {
	
	@Test
	public void flipkart() throws InterruptedException
	{
	
	WebDriver driver = WebDriverManager.chromedriver().create();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//img[@alt='Electronics']"))).perform();
	//act.moveToElement(driver.findElement(By.xpath("//a[@class='_6WOcW9 _3YpNQe']"))).click().perform();
	act.moveToElement(driver.findElement(By.linkText("Home Theatres"))).click().perform();
	Thread.sleep(10000);
	}
}