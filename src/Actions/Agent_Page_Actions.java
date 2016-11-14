package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PageObjects.Agent_Page_Objects;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Reporter;

public class Agent_Page_Actions 
{

	public static void AgentDelete(WebDriver driver, String AgentName) throws Exception
	
	{
		try 
		{
			///Github Check////
			Agent_Page_Objects.Left_Menu_Agent(driver).click();
			Agent_Page_Objects.waitFor2000();
			Agent_Page_Objects.Search_Agent(driver).sendKeys(AgentName);
			
			//WebElement web = (new WebDriverWait(driver, 10).until(ExpectedConditions.)
			Agent_Page_Objects.waitFor1000();
			Agent_Page_Objects.SelectAll_Agent(driver).click();
			Agent_Page_Objects.waitFor1000();
			String disabledVal = Agent_Page_Objects.Delete_Agent(driver).getAttribute("disabled");
			Agent_Page_Objects.waitFor2000();
			
			if(disabledVal != null)
			{
			
			Agent_Page_Objects.Search_Agent(driver).clear();
			Reporter.reportStep("No Agent Records to Delete", "PASS");	
			}
			
			else
			{		
			Agent_Page_Objects.Delete_Agent(driver).click();
			Agent_Page_Objects.waitFor1000();
			Agent_Page_Objects.Delete_Ok(driver).click();
			Agent_Page_Objects.waitFor2000();
			
			if(Agent_Page_Objects.DeleteSuccessMsg(driver).getText().equals("Agent(s) deleted successfully")==true)
			{
				Reporter.reportStep("Agent Delete Passed", "PASS");	
			}
			
			Agent_Page_Objects.waitFor1000();
			Agent_Page_Objects.Search_Agent(driver).clear();
			}
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
			Reporter.reportStep("Agent Delete Failed", "FAIL");	
		}
	}
	
	public static void AgentCreate(WebDriver driver) throws Exception
	
	{
		try {
			Agent_Page_Objects.Left_Menu_Agent(driver).click();
			Agent_Page_Objects.Site_Selection(driver).click();
			driver.findElement(By.partialLinkText(ExcelUtils.getCellData(1, 6))).click();
			Agent_Page_Objects.Add_Agent(driver).click();
			Agent_Page_Objects.AgentName_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 0));
			Agent_Page_Objects.First_Name_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 1));
			Agent_Page_Objects.Last_Name_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 2));
			Agent_Page_Objects.Login_Name_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 3)+Math.random());
			Agent_Page_Objects.waitFor1000();
			Agent_Page_Objects.Password_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 4));
			Agent_Page_Objects.waitFor1000();
			Agent_Page_Objects.Confirm_Password_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 5));
			Agent_Page_Objects.waitFor3000();
			Agent_Page_Objects.Save_Button(driver).click();
			Agent_Page_Objects.waitFor3000();
			
			if(Agent_Page_Objects.SaveSuccessMsg(driver).getText().equals("Agent created successfully")==true)
			{
				Reporter.reportStep("Agent Create Passed", "PASS");	
			}
			
			else if(Agent_Page_Objects.LoginAlreadyExist(driver).getText().startsWith("LoginName Already Exists:")==true)
			{
				Agent_Page_Objects.Login_Name_Txt(driver).clear();
				Agent_Page_Objects.Login_Name_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 3)+Math.random());
				Agent_Page_Objects.Save_Button(driver).click();
				Agent_Page_Objects.waitFor1000();
				if(Agent_Page_Objects.SaveSuccessMsg(driver).getText().equals("Agent created successfully")==true)
				{
					Reporter.reportStep("Agent Create Passed", "PASS");	
				}
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Reporter.reportStep("Agent Create Failed", "FAIL");	
		}
	}
	
	public static void AgentValidation(WebDriver driver) throws Exception
	
	{
		try {
			Agent_Page_Objects.waitFor1000();
			Agent_Page_Objects.Left_Menu_Agent(driver).click();
			Agent_Page_Objects.waitFor2000();
			Agent_Page_Objects.Add_Agent(driver).click();
			Agent_Page_Objects.waitFor1000();
			Assert.assertEquals(Agent_Page_Objects.Site_Invalid(driver).getText(), "Selected Site is not valid");
			Agent_Page_Objects.waitFor1000();
			Agent_Page_Objects.Site_Selection(driver).click();
			Agent_Page_Objects.waitFor1000();
			driver.findElement(By.partialLinkText(ExcelUtils.getCellData(1, 6))).click();
			Agent_Page_Objects.waitFor1000();
			Agent_Page_Objects.Add_Agent(driver).click();
			Agent_Page_Objects.waitFor2000();
			Agent_Page_Objects.AgentName_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 0));
			Agent_Page_Objects.First_Name_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 1));
			Agent_Page_Objects.Last_Name_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 2));
			Agent_Page_Objects.Login_Name_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 3));
			Agent_Page_Objects.Password_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 4));
			Agent_Page_Objects.Confirm_Password_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 5));
			Agent_Page_Objects.waitFor2000();
			
			//************ Validation Check ******************//
			
			Assert.assertEquals(Agent_Page_Objects.AgentNameInvalid(driver).getText(), "Only alphanumeric characters, _ or . are valid. First character must be alphanumeric.");
			Assert.assertEquals(Agent_Page_Objects.AgentNameMaxlength(driver).getText(), "Please enter no more than 32 characters.");
			Assert.assertEquals(Agent_Page_Objects.First_Name_Invalid(driver).getText(), "Only alphanumeric characters, _ or . are valid. First character must be alphanumeric.");
			Assert.assertEquals(Agent_Page_Objects.First_Name_Maxlength(driver).getText(), "Please enter no more than 32 characters.");
			Assert.assertEquals(Agent_Page_Objects.Last_Name_Invalid(driver).getText(), "Only alphanumeric characters, _ or . are valid. First character must be alphanumeric.");
			Assert.assertEquals(Agent_Page_Objects.Last_Name_Maxlength(driver).getText(), "Please enter no more than 32 characters.");
			Assert.assertEquals(Agent_Page_Objects.Login_Name_Invalid(driver).getText(), "Only alphanumeric characters, _ or . are valid. First character must be alphanumeric.");
			Assert.assertEquals(Agent_Page_Objects.Login_Name_Maxlength(driver).getText(), "Please enter no more than 32 characters.");
			Assert.assertEquals(Agent_Page_Objects.Password_Minlength(driver).getText(), "Please enter at least 8 characters.");
			Assert.assertEquals(Agent_Page_Objects.Password_Error(driver).getText(), "Password should contain atleast one uppercase, lowercase, number and symbol.");
			Assert.assertEquals(Agent_Page_Objects.ConfPasswordMismatch(driver).getText(), "Password does not match");
			
			Agent_Page_Objects.waitFor1000();
			Agent_Page_Objects.Password_Txt(driver).sendKeys("password@123456789 password1234565786");
			Agent_Page_Objects.waitFor1000();
			Assert.assertEquals(Agent_Page_Objects.Password_Maxlength(driver).getText(),"Please enter no more than 32 characters.");
			Agent_Page_Objects.waitFor1000();
			Agent_Page_Objects.AgentName_Txt(driver).clear();
			Agent_Page_Objects.First_Name_Txt(driver).clear();
			Agent_Page_Objects.Last_Name_Txt(driver).clear();
			Agent_Page_Objects.Login_Name_Txt(driver).clear();
			Agent_Page_Objects.Password_Txt(driver).clear();
			Agent_Page_Objects.Confirm_Password_Txt(driver).clear();
			Agent_Page_Objects.waitFor1000();
			
			//************ Mandatory Validation Check ******************//
			
			Assert.assertEquals(Agent_Page_Objects.AgentNameMandatory(driver).getText(),"Name is required.");
			Assert.assertEquals(Agent_Page_Objects.First_Name_Mandatory(driver).getText(),"First name is required.");
			Assert.assertEquals(Agent_Page_Objects.Last_Name_Mandatory(driver).getText(),"Last name is required.");
			Assert.assertEquals(Agent_Page_Objects.Login_Name_Mandatory(driver).getText(),"Login name is required.");
			Assert.assertEquals(Agent_Page_Objects.Password_Mandatory(driver).getText(),"Password is required.");
			Agent_Page_Objects.Close_Icon(driver).click();
			Agent_Page_Objects.waitFor1000();
			if((Agent_Page_Objects.CancelAlert(driver).getText().equalsIgnoreCase("Cancel Agent"))==true)
			{
				Agent_Page_Objects.waitFor1000();
				Agent_Page_Objects.Delete_Ok(driver).click();
				Reporter.reportStep("Agent Validation Passed", "PASS");	
			}
					
		}
		catch (Exception e) 
		{
		
			e.printStackTrace();
			Reporter.reportStep("Agent Validation Failed", "FAIL");	
		}
	}
	
	public static void AgentUpdate(WebDriver driver) throws Exception
	
	{
		try {
			Agent_Page_Objects.Left_Menu_Agent(driver).click();
			Agent_Page_Objects.waitFor2000();
			Agent_Page_Objects.Search_Agent(driver).sendKeys(ExcelUtils.getCellData(1, 0));
			Agent_Page_Objects.waitFor1000();
			Agent_Page_Objects.EditAgent(driver, ExcelUtils.getCellData(1, 0)).click();
			Agent_Page_Objects.waitFor2000();
			
			//		Assert.assertEquals(Agentnametext, ExcelUtils.getCellData(1, 0));
			//		Assert.assertEquals(Agent_Page_Objects.Edit_First_Name_Txt(driver).getText(), ExcelUtils.getCellData(1, 1));
			//		Assert.assertEquals(Agent_Page_Objects.Edit_Last_Name_Txt(driver).getText(), ExcelUtils.getCellData(1, 2));
			//		Assert.assertEquals(Agent_Page_Objects.Edit_Login_Name_Txt(driver).getText(), ExcelUtils.getCellData(1, 3));
			//		Assert.assertEquals(Agent_Page_Objects.Login_Enabled(driver).getText(), "true");
			//		Agent_Page_Objects.waitFor1000();
			
			//************ Skill Group Link to Agent ******************//
			
			Agent_Page_Objects.Edit_SkillGroup_Legend(driver).click();
			Agent_Page_Objects.waitFor1000();
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Skill & Team");
			Agent_Page_Objects.Link_SkillGroup_Search(driver).sendKeys(ExcelUtils.getCellData(1, 0));
			Agent_Page_Objects.waitFor1000();
			Agent_Page_Objects.Select_SkillGroup(driver).click();
			Agent_Page_Objects.waitFor2000();
			
			//************ Agent Team Link to Agent ******************//
			
			Agent_Page_Objects.Edit_AgentTeam_Legend(driver).click();
			Agent_Page_Objects.waitFor1000();
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Skill & Team");
			Agent_Page_Objects.Link_AgentTeam_Search(driver).sendKeys(ExcelUtils.getCellData(1, 5));
			Agent_Page_Objects.waitFor1000();
			Agent_Page_Objects.Select_AgentTeam(driver).click();
			Agent_Page_Objects.waitFor1000();
			Agent_Page_Objects.Select_AgentTeam_Member(driver).click();
			Agent_Page_Objects.waitFor1000();
			
			//************ Attribute Link to Agent ******************//
			
			Agent_Page_Objects.Edit_Attribute_Legend(driver).click();
			Agent_Page_Objects.waitFor1000();
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Attribute");
			Agent_Page_Objects.Link_Attribute_Search(driver).sendKeys(ExcelUtils.getCellData(1, 0));
			Agent_Page_Objects.waitFor1000();
			Agent_Page_Objects.Select_Attribute(driver).click();

			Agent_Page_Objects.waitFor2000();
			Agent_Page_Objects.Update_Button(driver).click();
			Agent_Page_Objects.waitFor2000();
			if(Agent_Page_Objects.UpdateSuccessMsg(driver).getText().equalsIgnoreCase("Agent updated successfully")==true)
			{
				Reporter.reportStep("Agent Update Passed", "PASS");	
			}
			Agent_Page_Objects.waitFor1000();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Reporter.reportStep("Agent Update Failed", "FAIL");	
		}
			
	}
	
}
