package Modules;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Actions.Login_Page_Actions;
import Actions.Skill_Group_Page_Actions;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.GenericWrappers;

public class TC003_SkillGroup_Create_Validation extends GenericWrappers
{
	@BeforeClass
	public void PageDescription()
	{
		testCaseName	= "Skill Group";
		testDescription	= "Skill Group Create and Validation Check";
			
	}
	
	@Test
	public void SkillGroup() throws Exception 
	{
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Login");
		driver.manage().window().maximize();
		driver.get(Constant.URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login_Page_Actions.ValidLogin(driver, ExcelUtils.getCellData(1, 3), ExcelUtils.getCellData(1, 1));
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Skill & Team");
		//Skill_Group_Page_Actions.Skill_Group_Validation(driver);
		//Skill_Group_Page_Actions.Skill_GroupCreate(driver);
		Skill_Group_Page_Actions.SkillGroupUpdate(driver);
	}
}