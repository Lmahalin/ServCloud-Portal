package Modules;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Actions.Login_Page_Actions;
import Actions.Queue_Page_Actions;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.GenericWrappers;

public class TC006_PQ_Create_Validation extends GenericWrappers
{
	@BeforeClass
	public void PageDescription()
	{
		testCaseName	= "Precision Queue Page";
		testDescription	= "Precision Queue Create and Validation Test";
	}
	
	@Test
	public void PrecisionQ_Page() throws Exception 
	{
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Login");
		driver.manage().window().maximize();
		driver.get(Constant.URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login_Page_Actions.ValidLogin(driver, ExcelUtils.getCellData(1, 3), ExcelUtils.getCellData(1, 1));
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Queue");
		Queue_Page_Actions.Queue_Validation(driver);
		Queue_Page_Actions.QueueCreate(driver);
			}
}
