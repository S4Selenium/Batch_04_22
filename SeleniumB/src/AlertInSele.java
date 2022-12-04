import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AlertInSele {

	@Test
	public void AlertBoxes() throws InterruptedException
	{
	WebDriver driver = WebDriverManager.chromedriver().create();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	driver.findElement(By.id("runbtn")).click();
	driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	driver.findElement(By.xpath("//button")).click();
	Thread.sleep(3000);
	//handling alert boxes
	driver.switchTo().alert().accept();
	Thread.sleep(5000);
	}
}
//CI/CD Tools Jenkins, Github Actions
//Github--- Commit branch(50)--pipelines (51)------ RUN----Browsers