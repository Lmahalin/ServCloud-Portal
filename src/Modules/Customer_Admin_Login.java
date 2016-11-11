package Modules;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import Actions.Agent_Page_Actions;
import Actions.Login_Page_Actions;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.GenericWrappers;
import Utility.Reporter;

public class Customer_Admin_Login extends GenericWrappers

{
	
	static
	{
	testCaseName	= "Customer Admin Login";
	testDescription	= "Customer Admin Login Description";
		
	}
	
	
	@Test
	public void SignIn_Page() throws Exception 
	{
		try {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Login");
			driver.manage().window().maximize();
			driver.get(Constant.URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Login_Page_Actions.ValidLogin(driver, ExcelUtils.getCellData(1, 3), ExcelUtils.getCellData(1, 1));
						
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			Reporter.reportStep("Login Failed", "FAIL");
		}
		
	}
	
	@Test(priority=1)
	public void Delete_Resources() throws Exception 
	{
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Agent");
		Agent_Page_Actions.AgentDelete(driver, ExcelUtils.getCellData(1, 0));
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Skill & Team");
//		Skill_Group_Page_Actions.Skill_GroupDelete(driver, ExcelUtils.getCellData(1, 0)); 
//		Agent_Team_Page_Actions.Agent_TeamDelete(driver, ExcelUtils.getCellData(1, 5)); 
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Attribute");
//		Attribute_Page_Actions.AttributeDelete(driver, ExcelUtils.getCellData(1, 0)); 
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Queue");
//		Queue_Page_Actions.QueueDelete(driver, ExcelUtils.getCellData(1, 0)); 
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Phones");
//		Phone_Page_Actions.PhoneDelete(driver, ExcelUtils.getCellData(1, 1));
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Lines");
//		Line_Page_Actions.LineDelete(driver, ExcelUtils.getCellData(1, 0));
	}
	
//	@Test(priority=4)
//	public void Agent_Team_Page() throws Exception 
//	{
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Skill & Team");
//		Agent_Team_Page_Actions.Agent_Team_Validation(driver);
//		Agent_Team_Page_Actions.Agent_TeamCreate(driver);
//	}
//
//	@Test(priority=5
//	public void Attribute_Page() throws Exception 
//	{
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Attribute");
//		Attribute_Page_Actions.Attribute_Validation(driver);
//		Attribute_Page_Actions.AttributeCreate(driver);
//	}
//	
//	@Test(priority=6)

//	public void PQueue_Page() throws Exception 
//	{
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Queue");
//		Queue_Page_Actions.Queue_Validation(driver);
//		Queue_Page_Actions.QueueCreate(driver);
//	}
	
//	@Test(priority=7)
//	
//	public void Site_Page() throws Exception 
//	{
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Site");
//		Site_Page_Actions.SiteValidation(driver);
//		Site_Page_Actions.SiteCreate(driver);
//		Site_Page_Actions.SiteDelete(driver, ExcelUtils.getCellData(1, 0));
//	}
	
//	@Test(priority=8)
//	public void Edit_Update_Page() throws Exception 
//	{
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Agent");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Agent_Page_Actions.AgentUpdate(driver);
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Skill & Team");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Skill_Group_Page_Actions.SkillGroupUpdate(driver);
//		Agent_Team_Page_Actions.AgentTeam_Update(driver);
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Attribute");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Attribute_Page_Actions.Attribute_Update(driver);
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Queue");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Queue_Page_Actions.Queue_Update(driver);
//	}
	
//	@Test(priority=9)
//	public void Phone_Page() throws Exception 
//	{
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Phones");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Phone_Page_Actions.PhoneValidation(driver);
//		Phone_Page_Actions.PhoneCreate(driver);
//						
//	}
	
//	@Test(priority=10)
//	public void Line_Page() throws Exception 
//	{
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Lines");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Line_Page_Actions.LineValidation(driver);
//		Line_Page_Actions.LineCreate(driver);
//	}
	
//	@Test(priority=4)
//	public void User_Page() throws Exception 
//	{
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Reseller, Cust & User");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		//User_Page_Actions.UserDelete(driver,ExcelUtils.getCellData(6, 1));
//		User_Page_Actions.UserCreate(driver, ExcelUtils.getCellData(10, 0),ExcelUtils.getCellData(10, 1), "", "");
//		User_Page_Actions.UserCreate(driver, ExcelUtils.getCellData(11, 0),ExcelUtils.getCellData(11, 1), ExcelUtils.getCellData(11, 2), "");
//		User_Page_Actions.UserCreate(driver, ExcelUtils.getCellData(12, 0),ExcelUtils.getCellData(12, 1), ExcelUtils.getCellData(12, 2),ExcelUtils.getCellData(12, 3));
//	}
		
	
//	@AfterMethod
//	public void takeScreenShotOnFailure(ITestResult testResult) throws Exception 
//	{ 
//		
//		Calendar cal = Calendar.getInstance();
//		Date time = cal.getTime();
//		String timestamp = time.toString();
//		String systime = timestamp.replace(":", "-");
//		
//		if (testResult.getStatus() == ITestResult.FAILURE) 
//		{ 
//			System.out.println(testResult.getStatus()); 
//			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//			FileUtils.copyFile(scrFile, new File("./Screenshot", testResult.getName() + "\\Error_" + systime + ".jpg")); 
//		} 
//		
//	}

}
