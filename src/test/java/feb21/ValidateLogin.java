package feb21;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import feb18.BaseClass;
public class ValidateLogin extends BaseClass{
	@Test(priority = 0)
	public void ValidTest() throws Throwable
	{
		test.assignAuthor("Ranga");
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		String Expected ="dashboard";
		String Actual = driver.getCurrentUrl();
		test.info(Expected+"--------------"+Actual);
		if(Actual.contains(Expected))
		{
			test.pass("Valid Username and password");
		}
		else
		{
			test.fail("Failed");
			test.addScreenCaptureFromPath("path");
		}
	}
	@Test(priority = 1)
	public void InvalidTest() throws Throwable
	{
		test.assignAuthor("Ranga");
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge");
		driver.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		String Expected ="dashboard";
		String Actual = driver.getCurrentUrl();
		test.info(Expected+"--------------"+Actual);
		if(Actual.contains(Expected))
		{
			test.pass("Valid Username and password");
		}
		else
		{
			//capture error message
			String Error_Message = driver.findElement(By.id("spanMessage")).getText();
			test.fail(Error_Message+"    "+"Failed");
			test.addScreenCaptureFromPath("path");
		}
	}
}
