import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {
	@Test
	public void JSExec() throws InterruptedException
	{

	WebDriver driver = WebDriverManager.chromedriver().create();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://login.yahoo.com/");
	WebElement CheckBox = driver.findElement(By.xpath("//label[@for='persistent']"));
	//CheckBox.click();
	Thread.sleep(5000);
	 JavascriptExecutor jscript=(JavascriptExecutor)driver;
	 jscript.executeScript("arguments[0].click();", CheckBox); 
	 Thread.sleep(5000);
	 
	
	  }

	}