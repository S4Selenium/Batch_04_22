import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//with page object factory	
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement Admin;
	
	@FindBy(xpath="//span[text()='Leave']")
	WebElement Leave;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	public WebElement ClickAdmin()
	{
		return Admin;
	}
    public WebElement ClickLeave()
    {
    	return Leave;
    }
}
