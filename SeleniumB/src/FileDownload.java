import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {
	
	@Test
	public void DowloadingPDF() throws InterruptedException, AWTException
	{
	
	WebDriver driver = WebDriverManager.chromedriver().create();
	driver.manage().window().maximize();
	driver.get("https://rocketstem.b-cdn.net/wp-content/uploads/2020/07/Mars-2020-Exploration-Mission-Guide.pdf");
	Thread.sleep(8000);
	Robot rb = new Robot();
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_S);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_S);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);

	Thread.sleep(3000);

}
}