import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleInSelenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(2000);
	    String ActiveWindowhandle=	driver.getWindowHandle();
	    System.out.println(ActiveWindowhandle+"----Current window");	
		Set<String>MultipleWind=driver.getWindowHandles();
		for(String Wind:MultipleWind)
		{
			if(!Wind.equalsIgnoreCase(ActiveWindowhandle))
				driver.switchTo().window(Wind);
			    //driver.switchTo().wi
		
			System.out.println(Wind);
		}
		
		driver.findElement(By.id("firstName")).sendKeys("Selenium");
		Thread.sleep(5000);
	

}
}