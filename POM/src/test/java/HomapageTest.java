import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class HomapageTest extends LoginTest {

	{
	try {
		WebDriver driver=LoginTest();
		
		HomePage Hp = new HomePage(driver);
		Hp.ClickAdmin().click();
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		
		}
}
