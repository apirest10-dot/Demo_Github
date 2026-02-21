package feb18;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class Register {
Properties conpro;
WebDriver driver;
@Test
public void register_test()throws Throwable
{
	conpro = new Properties();
	conpro.load(new FileInputStream("Register.properties"));
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(conpro.getProperty("Url"));
	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath(conpro.getProperty("ObjReg"))).click();
	driver.findElement(By.xpath(conpro.getProperty("ObjName"))).sendKeys(conpro.getProperty("EnterName"));
	driver.findElement(By.xpath(conpro.getProperty("ObjcNumber"))).sendKeys(conpro.getProperty("EnterCnumber"));
	driver.findElement(By.xpath(conpro.getProperty("ObjEmail"))).sendKeys(conpro.getProperty("EnterEmail"));
	driver.findElement(By.xpath(conpro.getProperty("Objpass"))).sendKeys(conpro.getProperty("EnterPass"));
	new Select(driver.findElement(By.xpath(conpro.getProperty("ObjGender")))).selectByVisibleText(conpro.getProperty("SelectGender"));
	Thread.sleep(2000);
	driver.findElement(By.xpath(conpro.getProperty("ObjDOB"))).click();
	driver.findElement(By.xpath(conpro.getProperty("ObjDOB"))).sendKeys(conpro.getProperty("EnterDod"));
	Thread.sleep(2000);
	driver.findElement(By.xpath(conpro.getProperty("Objcheckbox"))).click();
	driver.findElement(By.xpath(conpro.getProperty("Objregister"))).click();
	Thread.sleep(5000);
	driver.quit();
}
}
