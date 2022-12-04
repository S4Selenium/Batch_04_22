import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQADragandDrop {
	@Test
	public void DragandDrop() throws InterruptedException
	{
	
	WebDriver driver = WebDriverManager.chromedriver().create();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	//to exit iframe
	//driver.switchTo().defaultContent();
	//driver.findElement(By.id("runbtn")).click();
	//driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	WebElement draggable = driver.findElement(By.xpath("//img[@src='img_w3slogo.gif']"));	
	WebElement droppable = driver.findElement(By.id("div2"));
	Actions act=new Actions(driver);		
	act.dragAndDrop(draggable,droppable).perform();
	Thread.sleep(5000);
	}
}