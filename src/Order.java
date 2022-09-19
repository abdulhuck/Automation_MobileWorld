import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Order {

	@Test

	public void odr() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/abdul.naduthodiyil/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		LandingPage lp = new LandingPage(driver);
		lp.goTo();
		lp.OrderApplication("Edward", "Livingston", "edward@gmail.com", "edv123", "9877665533", "streat", "street2",
				"banglore", "12345", "2", "2");

	}

}
