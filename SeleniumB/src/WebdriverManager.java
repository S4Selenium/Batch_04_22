import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		//Driver Commands
		driver.get("https://www.qabible.in/payrollapp/site/login");
		//driver.findElement(By.className("form-control")).click();
		//driver.findElement(By.className("form-control")).sendKeys("abcdef");
		//driver.findElement(By.linkText("reset it")).click();
		driver.findElement(By.partialLinkText("set")).click();
		driver.findElement(By.xpath("//a[@href='/payrollapp/site/login']")).click();
		/*
		 * System.out.println("TITLE "+ driver.getTitle()); String URL =
		 * driver.getCurrentUrl(); System.out.println("Site URL "+URL);
		 * Thread.sleep(5000);
		 */
		//Avantages of WebDDriverManager
		//static path use not needed
		//driver.close or driver.quit not needed
		//code optimisation
      //Navigation Commands
		//driver.navigate().to("URL");
		/*
		 * driver.navigate().back(); Thread.sleep(3000); driver.navigate().forward();
		 * Thread.sleep(2000); driver.navigate().refresh(); Thread.sleep(5000);
		 */
		Thread.sleep(3000);
	}

}
