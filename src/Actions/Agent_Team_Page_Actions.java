package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import PageObjects.Agent_Team_Page_Objects;
import Utility.ExcelUtils;
import Utility.Reporter;

public class Agent_Team_Page_Actions 
{
	public static void Agent_TeamDelete(WebDriver driver, String AgentTeamName) throws Exception
	
	{
		try {
			Agent_Team_Page_Objects.Left_Menu_Agent_Team(driver).click();
			Agent_Team_Page_Objects.waitFor2000();
			Agent_Team_Page_Objects.Search_Agent_Team(driver).sendKeys(AgentTeamName);
			Agent_Team_Page_Objects.waitFor1000();
			Agent_Team_Page_Objects.SelectAll_Agent_Team(driver).click();
			Agent_Team_Page_Objects.waitFor1000();

			
			String disabledVal = Agent_Team_Page_Objects.Delete_Agent_Team(driver).getAttribute("disabled");
			Agent_Team_Page_Objects.waitFor2000();
			if(disabledVal != null)
			{
				Agent_Team_Page_Objects.waitFor1000();
				Agent_Team_Page_Objects.Search_Agent_Team(driver).clear();
				Reporter.reportStep("No Agent Team Records to Delete", "PASS");	
			}
			
			else
			{		
				Agent_Team_Page_Objects.Delete_Agent_Team(driver).click();
				Agent_Team_Page_Objects.waitFor1000();
				Agent_Team_Page_Objects.Delete_Ok(driver).click();
				Agent_Team_Page_Objects.waitFor2000();
				Agent_Team_Page_Objects.DeleteSuccessMsg(driver).getText().equalsIgnoreCase("Agent Team(s) deleted successfully");
				Reporter.reportStep("Agent Team Delete Passed", "PASS");	
				Agent_Team_Page_Objects.waitFor1000();
				Agent_Team_Page_Objects.Search_Agent_Team(driver).clear();
			}
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Agent Team Delete Failed", "FAIL");	
			
		}
	
	}
	
	public static void Agent_TeamCreate(WebDriver driver) throws Exception
	
	{
		try {
			Agent_Team_Page_Objects.Left_Menu_Agent_Team(driver).click();
			Agent_Team_Page_Objects.waitFor2000();
			Agent_Team_Page_Objects.Site_selection(driver).click();
			Agent_Team_Page_Objects.waitFor1000();
			driver.findElement(By.partialLinkText(ExcelUtils.getCellData(1, 7))).click();
			Agent_Team_Page_Objects.waitFor1000();
			Agent_Team_Page_Objects.Add_Agent_Team(driver).click();
			Agent_Team_Page_Objects.waitFor2000();
			Agent_Team_Page_Objects.Agent_TeamName_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 5));
			Agent_Team_Page_Objects.Agent_Team_Description_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 6));
			Agent_Team_Page_Objects.waitFor1000();
			Agent_Team_Page_Objects.Save_Button(driver).click();
			Agent_Team_Page_Objects.waitFor2000();
			Agent_Team_Page_Objects.SaveSuccessMsg(driver).getText().equalsIgnoreCase("Agent Team created successfully");
			Reporter.reportStep("Agent Team Create Passed", "PASS");	
			Agent_Team_Page_Objects.waitFor1000();
		} catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Agent Team Create Failed", "FAIL");	
		}
	}
	
	public static void Agent_Team_Validation(WebDriver driver) throws Exception
	
	{
		try {
			Agent_Team_Page_Objects.Left_Menu_Agent_Team(driver).click();
			Agent_Team_Page_Objects.waitFor2000();
			Agent_Team_Page_Objects.Add_Agent_Team(driver).click();
			Agent_Team_Page_Objects.waitFor1000();
			Assert.assertEquals(Agent_Team_Page_Objects.Site_Invalid(driver).getText(), "Selected Site is not valid");
			Agent_Team_Page_Objects.waitFor1000();
			Agent_Team_Page_Objects.Site_selection(driver).click();
			Agent_Team_Page_Objects.waitFor1000();
			driver.findElement(By.partialLinkText(ExcelUtils.getCellData(1, 7))).click();
			Agent_Team_Page_Objects.waitFor1000();
			Agent_Team_Page_Objects.Add_Agent_Team(driver).click();
			Agent_Team_Page_Objects.waitFor2000();
			Agent_Team_Page_Objects.Agent_TeamName_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 5));
			Agent_Team_Page_Objects.Agent_Team_Description_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 6));
			Agent_Team_Page_Objects.waitFor2000();
			
			Assert.assertEquals(Agent_Team_Page_Objects.Agent_TeamNameInvalid(driver).getText(), "Only alphanumeric characters, _ or . are valid. First character must be alphanumeric.");
			Assert.assertEquals(Agent_Team_Page_Objects.Agent_TeamNameMaxlength(driver).getText(), "Please enter no more than 32 characters.");
			Assert.assertEquals(Agent_Team_Page_Objects.Agent_Team_Description_Maxlength(driver).getText(), "Please enter no more than 500 characters.");
			Agent_Team_Page_Objects.waitFor1000();

			Agent_Team_Page_Objects.Agent_TeamName_Txt(driver).clear();
			Agent_Team_Page_Objects.Agent_Team_Description_Txt(driver).clear();
			Agent_Team_Page_Objects.waitFor1000();
			Assert.assertEquals(Agent_Team_Page_Objects.Agent_TeamNameMandatory(driver).getText(),"Name is required.");
			Agent_Team_Page_Objects.waitFor1000();
			Agent_Team_Page_Objects.Close_Icon(driver).click();
			Agent_Team_Page_Objects.waitFor2000();
			Reporter.reportStep("Agent Team Validation Passed", "PASS");	
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Agent Team Validation Failed", "FAIL");	
		}
	}
	
	
	public static void AgentTeam_Update(WebDriver driver) throws Exception
	
	{
		try {
			Agent_Team_Page_Objects.Left_Menu_Agent_Team(driver).click();
			Agent_Team_Page_Objects.waitFor2000();
			Agent_Team_Page_Objects.Search_Agent_Team(driver).sendKeys(ExcelUtils.getCellData(3, 5));
			Agent_Team_Page_Objects.waitFor2000();
			Agent_Team_Page_Objects.EditAgentTeam(driver, ExcelUtils.getCellData(3, 5)).click();
			Agent_Team_Page_Objects.waitFor2000();
			Agent_Team_Page_Objects.Edit_Agent_Description_Txt(driver).clear();
			Agent_Team_Page_Objects.Edit_Agent_Description_Txt(driver).sendKeys(ExcelUtils.getCellData(3, 6));
			Agent_Team_Page_Objects.waitFor1000();
			Agent_Team_Page_Objects.Update_Save(driver).click();
			Agent_Team_Page_Objects.waitFor2000();
			Assert.assertEquals(Agent_Team_Page_Objects.UpdateSuccessMsg(driver).getText(), "Agent Team updated successfully");
			Reporter.reportStep("Agent Team Update Passed", "PASS");	
			Agent_Team_Page_Objects.waitFor1000();
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Agent Team Update Failed", "FAIL");	
		}
	}
}
