
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CallingTheURL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithin\\eclipse-workspace\\Batch_04_22\\FirstProgram\\Drivers\\chromedriver.exe");
		//ChromeDriver,EdgeDriver,FirefoxDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//driver.navigate().to("https://www.saucedemo.com");
		//driver.get();    driver.navigate().to()
		//driver.resetInputState(); is a method available only for ChromeDriver Class
		driver.manage().window().maximize();
		driver.close();
		//driver.quit();
		//What is the difference b/w driver.close and driver.quit()
		
	}

}
