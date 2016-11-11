package Modules;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Actions.Customer_Page_Actions;
import Actions.Login_Page_Actions;
import Actions.Reseller_Page_Actions;
import Actions.User_Page_Actions;
import Utility.Constant;
import Utility.ExcelUtils;
import Actions.Authentication_Page_Actions;

public class ServCloud_Admin_Login 
{

	WebDriver driver;

	@Test
	public void SignIn_Page() throws Exception 
	{
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constant.URL);
		Login_Page_Actions.ValidLogin(driver, ExcelUtils.getCellData(1, 0), ExcelUtils.getCellData(1, 1));	
	}
	
	@Test(priority=2)
	public void Authentication_Page() throws Exception 
	{
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Authentication");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Authentication_Page_Actions.AuthenticationValidation(driver);
		Authentication_Page_Actions.AuthenticationCreate(driver);
	}
	@Test(priority=3)
	public void Reseller_Page() throws Exception 
	{
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Reseller, Cust & User");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reseller_Page_Actions.ResellerCreate(driver);
	}
	@Test(priority=4)
	public void Customer_Page() throws Exception 
	{
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Reseller, Cust & User");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Customer_Page_Actions.CustomerCreate(driver);
	}
	
	@Test(priority=5)
	public void User_Page() throws Exception 
	{
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Reseller, Cust & User");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		User_Page_Actions.UserCreate(driver, ExcelUtils.getCellData(10, 0),ExcelUtils.getCellData(10, 1), "", "");
		User_Page_Actions.UserCreate(driver, ExcelUtils.getCellData(11, 0),ExcelUtils.getCellData(11, 1), ExcelUtils.getCellData(11, 2), "");
		User_Page_Actions.UserCreate(driver, ExcelUtils.getCellData(12, 0),ExcelUtils.getCellData(12, 1), ExcelUtils.getCellData(12, 2),ExcelUtils.getCellData(12, 3));
	}
	
//	@Test(priority=1)
//	public void Delete() throws Exception 
//	{
//
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Reseller, Cust & User");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		User_Page_Actions.UserDelete(driver,"Peers", ExcelUtils.getCellData(10, 1));
//		User_Page_Actions.UserDelete(driver,"All Resellers", ExcelUtils.getCellData(11, 1));
//		User_Page_Actions.UserDelete(driver,"All Customers", ExcelUtils.getCellData(12, 1));
//		Customer_Page_Actions.CustomerDelete(driver, ExcelUtils.getCellData(6, 1));
//		Reseller_Page_Actions.ResellerDelete(driver, ExcelUtils.getCellData(2, 0));
//		
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Authentication");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Authentication_Page_Actions.AuthenticationDelete(driver, ExcelUtils.getCellData(1, 0));
//		Authentication_Page_Actions.AuthenticationDelete(driver, ExcelUtils.getCellData(2, 0));
//	}
	
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
