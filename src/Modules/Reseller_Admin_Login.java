package Modules;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Actions.Login_Page_Actions;
import Actions.Reseller_Admin_Actions;
import Utility.Constant;
import Utility.ExcelUtils;

public class Reseller_Admin_Login 
{

	WebDriver driver;

	@Test
	public void SignIn_Page() throws Exception 
	{
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constant.URL);
		Login_Page_Actions.ValidLogin(driver, ExcelUtils.getCellData(1, 2), ExcelUtils.getCellData(1, 1));	
	}
	
	@Test(priority=1)
	public void Customer_User_Page() throws Exception 
	{
		Reseller_Admin_Actions.ResellerAdmin(driver);
	}
		
	@BeforeTest
	public void bft() 
	{
		// driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
	}

	@AfterTest
	public void Aft() 
	{
		driver.quit();
	}
	

}
