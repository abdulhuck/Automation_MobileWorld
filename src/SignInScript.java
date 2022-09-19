
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignInScript {

	// Verifying inputs

	@Test(dataProvider = "Signin")
	public void sign(String username, String Password) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/abdul.naduthodiyil/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		SignInPackage page = new SignInPackage(driver);
		page.goTo();
		page.signinbutton().click();
		page.uname().sendKeys(username);
		page.pwd().sendKeys(Password);
		page.loginbutton().click();

		int un = username.length();
		int pd = Password.length();

		if ((un < 3) || (un > 20)) {
			Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/sign.html");
		}

		else if ((pd < 3) || (pd > 10)) {

			Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/sign.html");

		}

		else {
			Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/index.html");
		}

		driver.close();

	}

	@DataProvider(name = "Signin")
	public Object[][] getdata() {
		Object[][] data = new Object[7][2];

		// valid data

		data[0][0] = "Edward";
		data[0][1] = "pass123";

		// invalid usernames

		data[1][0] = "Ed";
		data[1][1] = "pass123";
		data[2][0] = "";
		data[2][1] = "pass123";
		data[3][0] = "asdfghjgfdkndskjfnksdjnfksdjfnkjfnkj";
		data[3][1] = "pass123";

		// invalid passwords

		data[4][0] = "Edward";
		data[4][1] = "";
		data[5][0] = "Edward";
		data[5][1] = "pa";
		data[6][0] = "Edward";
		data[6][1] = "pass1234567890";

		return data;

	}

	@Test

	public void SignInLink() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/abdul.naduthodiyil/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		SignInPackage page = new SignInPackage(driver);
		page.goTo();
		page.signinbutton().click();
		page.signUpLink().click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/signup.html");
		driver.close();

	}
}