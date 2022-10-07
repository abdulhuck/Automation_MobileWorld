import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInLanding {
	WebDriver driver;

	public SignInLanding(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[.='SIGN IN']")
	WebElement signin;
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//a[.='Log In']")
	WebElement logbutton;
	@FindBy(xpath = "//a[normalize-space()='Sign up']")
	WebElement signuplink;

	public void goTo() {
		driver.get("https://qualicoach.org/mwapp/index.html");
		driver.manage().window().maximize();
	}

	public WebElement signinbutton() {
		return signin;
	}

	public WebElement uname() {
		return username;
	}

	public WebElement pwd() {
		return password;
	}

	public WebElement loginbutton() {
		return logbutton;
	}
	public WebElement signUpLink() {
		// TODO Auto-generated method stub
		return signuplink;
	}
	public void closeWindow() {
		driver.quit();
	}


}


