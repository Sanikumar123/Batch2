package zoho.zohosignIn.suitepack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testbase.TestBase;
import com.utility.ConstantClass;

import zoho.zohosignin.pageclass.ZohoSignInPageClass;
import zoho.zohosignup.pageclass.ZohoSignUPPage;

public class ZohoSignInTestClass extends  TestBase{
	
	ZohoSignUPPage signUpPage;
	ZohoSignInPageClass signInPage;
	
	@BeforeMethod
	public void initialization()
	{
		launchBrowser();
		signUpPage  = new ZohoSignUPPage();
		signInPage = signUpPage.clickOnSignInBtn();
		
		
	}
	
	@Test
	public void validateSignIn()
	{
		signInPage.loginIn(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
	}
	
	
	
	@AfterMethod
	public void quit()
	{
		tearDown();
	}


}
