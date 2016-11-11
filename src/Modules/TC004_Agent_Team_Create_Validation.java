package Modules;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Actions.Agent_Team_Page_Actions;
import Actions.Login_Page_Actions;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.GenericWrappers;

public class TC004_Agent_Team_Create_Validation extends GenericWrappers
{
	@BeforeClass
	public void PageDescription()
	{
		testCaseName	= "Agent Team Page";
		testDescription	= "Agent Team Create and Validation Check";
	}
	
	@Test
	public void AgentTeam_Page() throws Exception 
	{
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Login");
		driver.manage().window().maximize();
		driver.get(Constant.URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login_Page_Actions.ValidLogin(driver, ExcelUtils.getCellData(1, 3), ExcelUtils.getCellData(1, 1));
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Skill & Team");
		Agent_Team_Page_Actions.Agent_Team_Validation(driver);
		Agent_Team_Page_Actions.Agent_TeamCreate(driver);
	}
}
