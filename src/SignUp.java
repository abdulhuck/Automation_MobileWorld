import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUp {

	@Test

	public void signUp() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/abdul.naduthodiyil/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		LandingPage lp = new LandingPage(driver);
		lp.goTo();
		lp.SignUpApplication("Fname", "Lname", "abc@gmail.com", "Pword", "01/01/2000", "9633552011", "Bio");

	}

}
