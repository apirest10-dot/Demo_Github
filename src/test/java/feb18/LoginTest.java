package feb18;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

	@Test
	public void verifyLogin() throws Throwable {
		test.assignAuthor("Ranga");
		driver.get("https://google.com");
		Thread.sleep(2000);
		String Expected ="Google";
		String Actual = driver.getTitle();
		test.info(Expected+"    "+Actual);
		if(Actual.equalsIgnoreCase(Expected))
		{
			test.pass("Title is Matching  "+ Expected+"---------"+Actual);
		}
		else
		{
			test.fail("Title is Not Matching   "+ Expected+"---------"+Actual);
			//obj.captureScreenshot("path");
			test.addScreenCaptureFromPath("path");
		}

	}
	@Test
	public void VerifyTitle() throws Throwable
	{
		test.assignAuthor("Ranga");
		driver.get("https://google.com");
		Thread.sleep(2000);
		String Expected ="Gmail";
		String Actual = driver.getTitle();
		test.info(Expected+"      "+Actual);
		if(Actual.equalsIgnoreCase(Expected))
		{
			test.pass("Title is Matching  "+ Expected+"---------"+Actual);
		}
		else
		{
			test.fail("Title is Not Matching   "+ Expected+"---------"+Actual);
			test.addScreenCaptureFromPath("path");
		}
	}
	@Test
	public void VerifyTitle1() throws Throwable
	{
		test.assignAuthor("Ranga");
		driver.get("https://gmail.com");
		Thread.sleep(2000);
		String Expected ="Gmail";
		String Actual = driver.getTitle();
		test.info(Expected+"      "+Actual);
		if(Actual.equalsIgnoreCase(Expected))
		{
			test.pass("Title is Matching  "+ Expected+"---------"+Actual);
		}
		else
		{
			test.fail("Title is Not Matching   "+ Expected+"---------"+Actual);
			test.addScreenCaptureFromPath("path");
		}
	}
}
