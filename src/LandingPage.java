import java.time.Duration;

import java.util.Iterator;
import java.util.Set;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LandingPage {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// sign up
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

	// sign in
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin_hb;

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//a[@type='submit']")
	WebElement login_hb;

	// order

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

	@FindBy(id = "inputState")
	WebElement state_o;

	@FindBy(xpath = "//select[@id='inputState']/option[2]")
	WebElement tamil_odd;

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

	// input[@placeholder='no of mobiles']

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
		driver.get("https://mobileworld.banyanpro.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

//	public void SignInApplication(String Uname,String Pword) {
//		signin_hb.click();
//		username.sendKeys(Uname);
//		password.sendKeys(Pword);
//		login_hb.click();
//	}
	public void SignUpApplication(String Fname, String Lname, String Email, String Pword, String Calander, String Phone,
			String Bio) {
		signin_hb.click();
		signup_hl.click();
		fname_su.sendKeys(Fname);
		lname_su.sendKeys(Lname);
		email_su.sendKeys(Email);
		password_su.sendKeys(Pword);
		calander.sendKeys(Calander);
		gender.click();
		phone.sendKeys(Phone);
		bio.sendKeys(Bio);
		register_sub.click();
		driver.switchTo().alert().accept();
		signin_sub.click();
	}

	public void OrderApplication(String Fname, String Lname, String Email, String Pword, String Mobile, String Address,
			String Address2, String City, String Zip, String Count, String Time) {

		support.click();
		order_hl.click();
		Set windows = driver.getWindowHandles();
		Iterator it = windows.iterator();
		String parentId = (String) it.next();
		String childId = (String) it.next();
		driver.switchTo().window(childId);

		fname_o.sendKeys(Fname);
		lname_o.sendKeys(Lname);
		email_o.sendKeys(Email);
		pword_o.sendKeys(Pword);
		gmale_o.click();
		mobile_o.sendKeys(Mobile);
		address1_o.sendKeys(Address);
		address2_o.sendKeys(Address2);
		city_o.sendKeys(City);
		state_o.click();
		tamil_odd.click();
		zip_o.sendKeys(Zip);
		apple_ocb.click();
		count.sendKeys(Count);
		bought.click();
		have_yes.click();
		time.sendKeys(Time);
		check1.click();
		check2.click();
		order_now.click();
		close_o.click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/index.html");
		driver.quit();
		
	}

}