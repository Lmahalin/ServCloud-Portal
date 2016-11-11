package Modules;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Actions.Agent_Page_Actions;
import Actions.Login_Page_Actions;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.GenericWrappers;

public class TC002_Agent_Create_Validation extends GenericWrappers
{
	@BeforeClass
	public void PageDescription()
	{
		testCaseName	= "Agent Page";
		testDescription	= "Agent Create and Validation";
			
	}
	
	@Test
	public void Agent_Page() throws Exception 
	{
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Login");
		driver.manage().window().maximize();
		driver.get(Constant.URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login_Page_Actions.ValidLogin(driver, ExcelUtils.getCellData(1, 3), ExcelUtils.getCellData(1, 1));
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Agent");
		Agent_Page_Actions.AgentValidation(driver);
		Agent_Page_Actions.AgentCreate(driver);
	}
}
