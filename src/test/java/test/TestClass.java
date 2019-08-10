package test;

import org.testng.annotations.Test;

import com.testbase.TestBase;

public class TestClass extends TestBase {
	
	@Test
	public void setUp()
	{
		launchBrowser();
		tearDown();
	}

}
