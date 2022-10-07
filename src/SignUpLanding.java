import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpLanding {
	WebDriver driver;

	public SignUpLanding(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[.='SIGN IN']")
	WebElement signin;

	@FindBy(xpath = "//a[normalize-space()='Sign up']")
	WebElement signup_hl;

	@FindBy(id = "myName")
	WebElement fname_su;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lname_su;

	@FindBy(xpath = "//input[@placeholder='Enter Email']")
	WebElement email_su;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password_su;

	@FindBy(xpath = "//input[@type='date']")
	WebElement calander;

	@FindBy(xpath = "//input[@name='gender']")
	WebElement gender;

	@FindBy(xpath = "//input[@placeholder='91XXXXXXXXXX']")
	WebElement phone;

	@FindBy(xpath = "//textarea[@placeholder='Short Bio']")
	WebElement bio;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement register_sub;

	@FindBy(xpath = "//button[@type='Submit']")
	WebElement signin_sub;

	public void goTo() {
		driver.get("https://qualicoach.org/mwapp/index.html");
		driver.manage().window().maximize();
	}

	public WebElement signinbutton() {
		return signin;
	}

	public WebElement signup_hl() {
		return signup_hl;
	}

	public WebElement fname_su() {
		return fname_su;
	}

	public WebElement lname_su() {
		return lname_su;
	}

	public WebElement email_su() {
		return email_su;
	}

	public WebElement password_su() {
		return password_su;
	}

	public WebElement calander() {
		return calander;
	}

	public WebElement gender() {
		return gender;
	}

	public WebElement phone() {
		return phone;
	}

	public WebElement bio() {
		return bio;
	}

	public WebElement register_sub() {
		return register_sub;
	}

	public WebElement signin_sub() {
		return signin_sub;
	}
}
