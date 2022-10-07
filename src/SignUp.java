import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignUp {

	@Test(dataProvider = "SignUp")
	public void signUp(String Fname, String Lname, String Email, String Pword, String Calander, String Phone,
			String Bio) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abdul.naduthodiyil\\Desktop\\study materials\\Chrome driver 106\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SignUpLanding sul = new SignUpLanding(driver);
		sul.goTo();
		sul.signinbutton().click();
		sul.signup_hl().click();
		sul.fname_su().sendKeys(Fname);
		sul.lname_su().sendKeys(Lname);
		sul.email_su().sendKeys(Email);
		sul.password_su().sendKeys(Pword);
		sul.calander().sendKeys(Calander);
		sul.gender().click();
		sul.phone().sendKeys(Phone);
		sul.bio().sendKeys(Bio);
		sul.register_sub().click();
		sul.driver.switchTo().alert().accept();
		sul.signin_sub().click();

	}

	@DataProvider(name = "SignUp")
	public Object[][] Signup() {
		return new Object[][] { { "Fname", "Lname", "abc@gmail.com", "Pword", "01/01/2000", "9633552011", "Bio" } };
	}

}
