package zoho.zohosignp.suitepack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testbase.TestBase;
import com.utility.ConstantClass;

import zoho.zohosignup.pageclass.ZohoSignUPPage;


public class ZohoSignUPTestPage extends TestBase {
	
	ZohoSignUPPage zohoSignUp;
	
	
	@BeforeMethod
	public void initialization()
	{
		launchBrowser();
		zohoSignUp = new ZohoSignUPPage();
	}
	
	@Test
	public void validateZohoHomepageTitle()
	{
		zohoSignUp.verifySignUpPageTitle(ConstantClass.EXPECTED_TITLE);
	}
	
	@Test
	public void clickOnSignInBtn()
	{
		zohoSignUp.clickOnSignInBtn();
	}
	
	
	
	@AfterMethod
	public void quit()
	{
		tearDown();
	}

}
