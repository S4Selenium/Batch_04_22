import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

	@Test   
	public void demo() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		Thread.sleep(3000);
		//Static Drop Down
		//Select sele = new Select(driver.findElement(By.id("single-input-field")));
		//sele.selectByValue("Green");
		//sele.selectByIndex(1);
		//sele.selectByVisibleText("Red");
		//Thread.sleep(3000);
		//Two Input Fields (Assignment)
        driver.findElement(By.id("single-input-field")).sendKeys("Sachin");
        Thread.sleep(3000);
        driver.findElement(By.id("button-one")).click();
        String Expected ="Your Message : Sachin";
       String Actual = driver.findElement(By.id("message-one")).getText();
       Assert.assertEquals(Actual, Expected);
       Thread.sleep(3000);
   
	}

}
