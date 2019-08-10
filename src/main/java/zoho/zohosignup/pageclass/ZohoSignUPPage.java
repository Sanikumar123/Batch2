package zoho.zohosignup.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.utility.DriverFactory;

import zoho.zohosignin.pageclass.ZohoSignInPageClass;

public class ZohoSignUPPage {
	
	@FindBy(xpath="//*[@id='bloc-block-3']/div/div/div[3]/div[3]/a[1]")
	WebElement loginBtn;
	
	@FindBy(xpath="//input[@id='signupbtn']")
	WebElement getStartedbtn;
	
	public ZohoSignUPPage()
	{
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}
	
	public void verifySignUpPageTitle(String expectedTitle)
	{
		String actualTitle = DriverFactory.getDriver().getTitle();

       Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	public ZohoSignInPageClass clickOnSignInBtn()
	{
		loginBtn.click();
		return new ZohoSignInPageClass();
	}

}
