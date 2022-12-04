import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingInSelenium {

	@Test
	public void Scrolling() throws InterruptedException, AWTException
	{
	//3 types scrolling (JS executor)
		//1. Scrolling to a particular element
		//2.pixel (0,100),(0,50)
		//3.Page bottom
	WebDriver driver = WebDriverManager.chromedriver().create();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	
	JavascriptExecutor jscript=(JavascriptExecutor)driver;
	//Page bottom
	//jscript.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	//Scrolling to a particular element
	Thread.sleep(3000);
	
	  WebElement ele = driver.findElement(By.xpath("//h2[@class='selenium']"));
	  jscript.executeScript("arguments[0].scrollIntoView();", ele);
	  Thread.sleep(3000);
	 boolean abc= ele.isDisplayed();
	 Assert.assertEquals(abc,true);
	 
	
	//2.pixel (0,100),(0,50)
	/*
	 * jscript.executeScript("window.scrollBy(0,1000)"); Thread.sleep(3000);
	 */
}	
}


//