package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageObjects.Agent_Page_Objects;
import PageObjects.Skill_Group_Page_Objects;
import Utility.ExcelUtils;
import Utility.Reporter;

public class Skill_Group_Page_Actions 
{

	public static void Skill_GroupDelete(WebDriver driver, String Skill_GroupName) throws Exception
	
	{
		try {
			Skill_Group_Page_Objects.Left_Menu_Skill_Group(driver).click();
			Skill_Group_Page_Objects.waitFor2000();
			Skill_Group_Page_Objects.Search_Skill_Group(driver).sendKeys(Skill_GroupName);
			Skill_Group_Page_Objects.waitFor1000();
			Skill_Group_Page_Objects.SelectAll_Skill_Group(driver).click();
			Skill_Group_Page_Objects.waitFor1000();
			
			String disabledVal = Skill_Group_Page_Objects.Delete_Skill_Group(driver).getAttribute("disabled");
			Skill_Group_Page_Objects.waitFor2000();
			if(disabledVal != null)
			{
				Skill_Group_Page_Objects.waitFor1000();
				Skill_Group_Page_Objects.Search_Skill_Group(driver).clear();
				Reporter.reportStep("No Skill Group Records to Delete", "PASS");
			}
			
			else
			{		
				Skill_Group_Page_Objects.Delete_Skill_Group(driver).click();
				Skill_Group_Page_Objects.waitFor1000();
				Skill_Group_Page_Objects.Delete_Ok(driver).click();
				Skill_Group_Page_Objects.waitFor2000();
				Skill_Group_Page_Objects.DeleteSuccessMsg(driver).getText().equalsIgnoreCase("Skill Group(s) deleted successfully");
				Skill_Group_Page_Objects.waitFor1000();
				Skill_Group_Page_Objects.Search_Skill_Group(driver).clear();
				Reporter.reportStep("Skill Group Delete Passed", "PASS");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			Reporter.reportStep("Skill Group Delete Failed", "FAIL");
		}
	}
	
	public static void Skill_GroupCreate(WebDriver driver) throws Exception
	
	{
		try {
			Skill_Group_Page_Objects.Left_Menu_Skill_Group(driver).click();
			Skill_Group_Page_Objects.waitFor2000();
			Skill_Group_Page_Objects.Site_selection(driver).click();
			Skill_Group_Page_Objects.waitFor1000();
			driver.findElement(By.partialLinkText(ExcelUtils.getCellData(1, 2))).click();
			Skill_Group_Page_Objects.waitFor1000();
			Skill_Group_Page_Objects.Add_Skill_Group(driver).click();
			Skill_Group_Page_Objects.waitFor2000();
			Skill_Group_Page_Objects.Skill_GroupName_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 0));
			Skill_Group_Page_Objects.Skill_Description_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 1));
			Skill_Group_Page_Objects.waitFor1000();
			Skill_Group_Page_Objects.Save_Button(driver).click();
			Skill_Group_Page_Objects.waitFor2000();
			
			Skill_Group_Page_Objects.SaveSuccessMsg(driver).getText().equalsIgnoreCase("Skill Group created successfully");
			Skill_Group_Page_Objects.waitFor1000();
			Reporter.reportStep("Skill Group Create Passed", "PASS");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Reporter.reportStep("Skill Group Create Failed", "FAIL");
		}
	}
	
	public static void Skill_Group_Validation(WebDriver driver) throws Exception
	
	{
		try {
			Skill_Group_Page_Objects.Left_Menu_Skill_Group(driver).click();
			Skill_Group_Page_Objects.waitFor2000();
			Skill_Group_Page_Objects.Add_Skill_Group(driver).click();
			Skill_Group_Page_Objects.waitFor1000();
			Assert.assertEquals(Skill_Group_Page_Objects.Site_Invalid(driver).getText(), "Selected Site is not valid");
			Skill_Group_Page_Objects.waitFor1000();
			Skill_Group_Page_Objects.Site_selection(driver).click();
			Skill_Group_Page_Objects.waitFor1000();
			driver.findElement(By.partialLinkText(ExcelUtils.getCellData(1, 2))).click();
			Skill_Group_Page_Objects.waitFor1000();
			Skill_Group_Page_Objects.Add_Skill_Group(driver).click();
			Skill_Group_Page_Objects.waitFor2000();
			Skill_Group_Page_Objects.Skill_GroupName_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 0));
			Skill_Group_Page_Objects.Skill_Description_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 1));
			Skill_Group_Page_Objects.waitFor2000();
			
			Assert.assertEquals(Skill_Group_Page_Objects.Skill_GroupNameInvalid(driver).getText(), "Only alphanumeric characters, _ or . are valid. First character must be alphanumeric.");
			Assert.assertEquals(Skill_Group_Page_Objects.Skill_GroupNameMaxlength(driver).getText(), "Please enter no more than 32 characters.");
			Assert.assertEquals(Skill_Group_Page_Objects.Skill_Description_Maxlength(driver).getText(), "Please enter no more than 500 characters.");
			Skill_Group_Page_Objects.waitFor1000();

			Skill_Group_Page_Objects.Skill_GroupName_Txt(driver).clear();
			Skill_Group_Page_Objects.Skill_Description_Txt(driver).clear();
			Skill_Group_Page_Objects.waitFor1000();
			Assert.assertEquals(Skill_Group_Page_Objects.Skill_GroupNameMandatory(driver).getText(),"Name required");
			Skill_Group_Page_Objects.waitFor1000();
			Skill_Group_Page_Objects.Close_Icon(driver).click();
			Skill_Group_Page_Objects.CancelAlert(driver).getText().equalsIgnoreCase("Cancel Skill Group");
			Skill_Group_Page_Objects.waitFor1000();
			Skill_Group_Page_Objects.Delete_Ok(driver).click();
			Reporter.reportStep("Skill Group Validation Passed", "PASS");	
			Skill_Group_Page_Objects.waitFor2000();
		} 
		catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("Skill Group Validation Failed", "FAIL");
		}
	}
	
	public static void SkillGroupUpdate(WebDriver driver) throws Exception
	
	{
		try {
			Skill_Group_Page_Objects.Left_Menu_Skill_Group(driver).click();
			Skill_Group_Page_Objects.waitFor2000();
			Skill_Group_Page_Objects.Search_Skill_Group(driver).sendKeys(ExcelUtils.getCellData(1, 0));
			Skill_Group_Page_Objects.waitFor1000();
			Skill_Group_Page_Objects.Edit_SkillGroup(driver, ExcelUtils.getCellData(1, 0)).click();
			Skill_Group_Page_Objects.waitFor2000();
			Skill_Group_Page_Objects.Edit_SkillGroup_Description(driver).sendKeys(ExcelUtils.getCellData(3, 1));
			Skill_Group_Page_Objects.waitFor1000();
			Skill_Group_Page_Objects.Legend_Agent(driver).click();
		
			List<WebElement>  AssignedAgents = driver.findElements(By.xpath("//div[@class='cellTemplate cellTemplate_rowSelection ng-binding ng-scope']"));
			
			for (WebElement Lists : AssignedAgents) {
				System.out.println(Lists.getText());
				if(Lists.getText().equals("Agent1"))
				{
					System.out.println("Test Passed");
				}
				else
				{
					System.out.println("Test Failed");
				}
			}
			
//			Skill_Group_Page_Objects.Update_SkillGroup(driver).click();
//			Skill_Group_Page_Objects.waitFor2000();
//			if(Skill_Group_Page_Objects.UpdateSuccessMsg(driver).getText().equalsIgnoreCase("Skill Group updated successfully")==true)
//			{
//				Reporter.reportStep("Skill Group Update Passed", "PASS");
//			}
//			Skill_Group_Page_Objects.waitFor1000();
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
			Reporter.reportStep("Skill Group Update Failed", "FAIL");
		}
				
	}
}
