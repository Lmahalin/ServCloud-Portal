package Modules;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Actions.Login_Page_Actions;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.GenericWrappers;

public class TC001_SignIn_Page extends GenericWrappers
{
	@BeforeClass
	public void PageDescription()
	{
	testCaseName	= "Login Check";
	testDescription	= "Login Check with Valid and Invalid UserName Passwords";
	}
	
	@Test
	public void SignIn_Page() throws Exception {

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constant.URL);
		Login_Page_Actions.InValidLogin(driver);
		Login_Page_Actions.ValidLogin(driver, ExcelUtils.getCellData(1, 3), ExcelUtils.getCellData(1, 1));

	}
}
