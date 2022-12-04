import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadInSelenium {
	@Test
	public void Scrolling() throws InterruptedException, AWTException
	{
	
	  WebDriver driver = WebDriverManager.chromedriver().create();
	  driver.manage().window().maximize();
	  driver.get("https://www.monsterindia.com/");
	  //1.SendKeys(Type='file')
	  //2.Robot Class
	  driver.findElement(By.xpath("(//a[@class='btn block resume-btn btn-orange mt20'])[1]")).click();
	  driver.findElement(By.id("file-upload")).sendKeys("D:\\software\\Mars-2020-Exploration-Mission-Guide (1).pdf");
	  Thread.sleep(5000);
	  
	
	
	
	
	
	
	
}	
}


