import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	
	@Test
	public void DragandDrop() throws InterruptedException
	{
	
	WebDriver driver = WebDriverManager.chromedriver().create();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
	driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	//to exit iframe
	driver.switchTo().defaultContent();
	driver.findElement(By.id("runbtn")).click();
	driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	WebElement draggable = driver.findElement(By.xpath("//img[@id='drag1']"));	
	WebElement droppable = driver.findElement(By.xpath("//div[@id='div1']"));	
	Actions act=new Actions(driver);		
	//act.dragAndDrop(draggable, droppable).perform();
	//act.clickAndHold(draggable).pause(Duration.ofSeconds(3)).moveToElement(droppable).perform();
    act.dragAndDropBy(draggable,336,69).perform();
	Thread.sleep(5000);
	}
}
