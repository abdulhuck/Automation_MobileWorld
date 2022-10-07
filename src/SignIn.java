import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignIn {
	// Verifying inputs

	
		@Test(dataProvider = "Signin")
		public void sign(String username, String Password) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\abdul.naduthodiyil\\Desktop\\study materials\\Chrome driver 106\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			SignInLanding page = new SignInLanding(driver);
			page.goTo();
			page.signinbutton().click();
			page.uname().sendKeys(username);
			page.pwd().sendKeys(Password);
			page.loginbutton().click();

			int un = username.length();
			int pd = Password.length();

			if ((un < 3) || (un > 20)) {
				Assert.assertEquals(driver.getCurrentUrl(), "https://qualicoach.org/mwapp/sign.html");
			}

			else if ((pd < 3) || (pd > 10)) {

				Assert.assertEquals(driver.getCurrentUrl(), "https://qualicoach.org/mwapp/sign.html");

			}

			else {
				Assert.assertEquals(driver.getCurrentUrl(), "https://qualicoach.org/mwapp/index.html");
			}

			driver.close();

		}

		@DataProvider(name = "Signin")
		public Object[][] Signin() {
			return new Object[][] { 
				
				//valid case
				{ "Edward", "pass123" }, 
				
				//invalid cases
				
				{ "Ed", "pass123" },
				{ "asdfghjgfdkndskjfnksdjnfksdjfnkjfnkj", "pass" }, 
				{ "", "pass123" },
				{ "Edward", "pa" },
				{ "Edward", "pass1234567890" }, 
				{ "Edward", "" }

			};
		}

		@Test
		public void SignUpLink() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\abdul.naduthodiyil\\Desktop\\study materials\\Chrome driver 106\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			SignInLanding page = new SignInLanding(driver);
			page.goTo();
			page.signinbutton().click();
			page.signUpLink().click();
			Assert.assertEquals(driver.getCurrentUrl(), "https://qualicoach.org/mwapp/signup.html");
			driver.close();

		}
}
