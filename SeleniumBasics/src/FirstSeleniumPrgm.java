import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nithin\\eclipse-workspace\\Batch_04_22\\SeleniumBasics\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();	
driver.get("https://selenium.obsqurazone.com/index.php");

	}

}
