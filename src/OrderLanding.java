import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderLanding {
	WebDriver driver;

	public OrderLanding(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//body/nav[@id='navbar']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav mx-auto']/li[4]/a[1]")
	WebElement support;

	@FindBy(xpath = "//a[@class='dropdown-item'][normalize-space()='Order']")
	WebElement order_hl;

	@FindBy(xpath = "//a[normalize-space()='Sign up']")
	WebElement signup_sil;

	@FindBy(id = "inputFirstName")
	WebElement fname_o;

	@FindBy(xpath = "//body/div[@class='container']/div[@class='card']/div[@class='card-body']/form[@id='myForm']/div[1]/div[2]/input[1]")
	WebElement lname_o;

	@FindBy(id = "inputEmail")
	WebElement email_o;

	@FindBy(id = "inputPassword")
	WebElement pword_o;

	@FindBy(id = "flexRadioDefault1")
	WebElement gmale_o;

	@FindBy(xpath = "flexRadioDefault2")
	WebElement gfemale_o;

	@FindBy(xpath = "//input[@placeholder='00000000000']")
	WebElement mobile_o;

	@FindBy(id = " address1")
	WebElement address1_o;

	@FindBy(id = "address2")
	WebElement address2_o;

	@FindBy(id = "inputCity")
	WebElement city_o;

	@FindBy(id = "inputZip")
	WebElement zip_o;

	@FindBy(xpath = "//input[@rel='apple']")
	WebElement apple_ocb;

	@FindBy(xpath = "//input[@rel='samsung']")
	WebElement samsung_ocb;

	@FindBy(xpath = "//input[@rel='lenovo']")
	WebElement lenovo_ocb;

	@FindBy(xpath = "//div[@class='samsung']//option[1]")
	WebElement samsuung1_o;

	@FindBy(xpath = "//input[@placeholder='no of mobiles']")
	WebElement count;

	@FindBy(id = "bought")
	WebElement bought;

	@FindBy(xpath = "//select[@id='bought']/option[1]")
	WebElement have_yes;

	@FindBy(id = "time")
	WebElement time;

	@FindBy(id = "gridCheck1")
	WebElement check1;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[9]/div[2]/input[1]")
	WebElement check2;

	@FindBy(xpath = "//button[normalize-space()='Order Now']")
	WebElement order_now;

	@FindBy(xpath = "//*[@id=\"exampleModal\"]/div/div/div[3]/a")
	WebElement close_o;
	
	public void goTo() {
		driver.get("https://qualicoach.org/mwapp/index.html");
		driver.manage().window().maximize();
	}
	
	public WebElement support() {
		return support;
	}

	public WebElement order_hl() {
		return order_hl;
	}

	public WebElement signup_sil() {
		return signup_sil;
	}

	public WebElement fname_o() {
		return fname_o;
	}

	public WebElement lname_o() {
		return lname_o;
	}

	public WebElement email_o() {
		return email_o;
	}

	public WebElement pword_o() {
		return pword_o;
	}

	public WebElement gmale_o() {
		return gmale_o;
	}

	public WebElement gfemale_o() {
		return gfemale_o;
	}

	public WebElement mobile_o() {
		return mobile_o;
		
	}public WebElement address1_o() {
		return address1_o;
	}

	public WebElement address2_o() {
		return address2_o;
	}

	public WebElement city_o() {
		return city_o;
	}

	public WebElement zip_o() {
		return zip_o;
	}

	public WebElement apple_ocb() {
		return apple_ocb;
	}

	public WebElement lenovo_ocb() {
		return email_o;
	}

	public WebElement samsuung1_o() {
		return samsuung1_o;
	}

	public WebElement count() {
		return count;
	}

	public WebElement bought() {
		return bought;
	}

	public WebElement have_yes() {
		return have_yes;
	}
	
	public WebElement time() {
		return time;
	}

	public WebElement check1() {
		return check1;
	}

	public WebElement check2() {
		return check2;
	}

	public WebElement order_now() {
		return order_now;
	}

	public WebElement close_o() {
		return close_o;
	}
}
