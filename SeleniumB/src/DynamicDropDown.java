import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		Thread.sleep(3000);
		//Will continue after JAVA CLASS collections.. Array, set, list
		//Difference b/w findElements and findElement
		//driver.findElements(null) 1 2 3 4 5 
		String sele = "missouri";
		driver.findElement(By.xpath("(//span[@role='textbox'])[1]")).click();
		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("mi");
		Thread.sleep(3000);
		List <WebElement> Options = driver.findElements(By.xpath("//li[@role='option']"));
		for(WebElement choice:Options)
		{
			if(choice.getText().equalsIgnoreCase(sele))
			{
				choice.click();
				break;
			}
			//System.out.println("\n"+choice);
		}
		Thread.sleep(5000);
		

	}

}