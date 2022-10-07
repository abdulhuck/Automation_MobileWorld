import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Order {

	@Test(dataProvider = "Order")
	public void odr(String Fname, String Lname, String Email, String Pword, String Mobile, String Address,
			String Address2, String City, String Zip, String Count, String Time) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abdul.naduthodiyil\\Desktop\\study materials\\Chrome driver 106\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		OrderLanding olp = new OrderLanding(driver);

		olp.goTo();
		olp.support().click();
		olp.order_hl().click();

		Set windows = driver.getWindowHandles();
		Iterator it = windows.iterator();
		String parentId = (String) it.next();
		String childId = (String) it.next();
		driver.switchTo().window(childId);

		olp.fname_o().sendKeys(Fname);
		olp.lname_o().sendKeys(Lname);
		olp.email_o().sendKeys(Email);
		olp.pword_o().sendKeys(Pword);
		olp.gmale_o().click();
		olp.mobile_o().sendKeys(Mobile);
		olp.address1_o().sendKeys(Address);
		olp.address2_o().sendKeys(Address2);
		olp.city_o().sendKeys(City);

		WebElement staticDropdown = driver.findElement(By.id("inputState"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);

		olp.zip_o().sendKeys(Zip);
		olp.apple_ocb().click();
		olp.count().sendKeys(Count);
		olp.bought().click();
		olp.have_yes().click();
		olp.time().sendKeys(Time);
		olp.check1().click();
		olp.check2().click();
		olp.order_now().click();
		olp.close_o().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://qualicoach.org/mwapp/index.html");
		driver.quit();
	}

	@DataProvider(name = "Order")
	public Object[][] order() {
		return new Object[][] { { "Edward", "Livingston", "edward@gmail.com", "edv123", "9877665533", "streat",
				"street2", "banglore", "12345", "2", "2" } };
	}

}
