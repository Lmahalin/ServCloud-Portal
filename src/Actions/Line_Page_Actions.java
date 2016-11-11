package Actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import PageObjects.Line_Page_Objects;
import Utility.ExcelUtils;
import Utility.Reporter;

public class Line_Page_Actions 
{

	public static void LineDelete(WebDriver driver, String LineName) throws Exception
	
	{
		try {
			Line_Page_Objects.Left_Menu_Line(driver).click();
			Line_Page_Objects.waitFor2000();
			Line_Page_Objects.Search_Line(driver).sendKeys(LineName);
			Line_Page_Objects.waitFor2000();
			Line_Page_Objects.SelectAll_Line(driver).click();
			Line_Page_Objects.waitFor1000();
			String disabledVal = Line_Page_Objects.Delete_Line(driver).getAttribute("disabled");
			Line_Page_Objects.waitFor1000();
			
			if(disabledVal != null)
			{
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.Search_Line(driver).clear();
			Reporter.reportStep("No Line Records to Delete ", "PASS");	
			}
			
			else
			{		
			Line_Page_Objects.Delete_Line(driver).click();
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.Delete_Cancel_Ok(driver).click();
			Line_Page_Objects.waitFor2000();
			Line_Page_Objects.DeleteSuccessMsg(driver).getText().equalsIgnoreCase("Line(s) delete request submitted successfully");
			Line_Page_Objects.waitFor1000();
			Reporter.reportStep("Line Deleted Successfully", "PASS");
			Line_Page_Objects.Search_Line(driver).clear();
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Line Delete Failed", "FAIL");
		}
	}
						//for Data Purpose //public static void LineCreate(WebDriver driver, String ProductType, String DeviceName, String Description, String CallingSearch, String OwnerUserID, String SoftkeyTemplate, String DoNotDisturb ) throws Exception
	
	public static void LineCreate(WebDriver driver) throws Exception
	
	{
		try {
			Line_Page_Objects.Left_Menu_Line(driver).click();
			Line_Page_Objects.waitFor2000();
			Line_Page_Objects.Site_Selection(driver).click();
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.ClickPartialLinkText(driver, ExcelUtils.getCellData(1, 6));
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.Add_Line(driver).click();
			Line_Page_Objects.waitFor2000();
			Line_Page_Objects.DirectoryNum_Drop(driver).click();
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.ClickLinkText(driver, ExcelUtils.getCellData(1, 0));
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.Route_Partition_Drop(driver).click();
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.ClickLinkText(driver, ExcelUtils.getCellData(1, 1));
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.Description_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 2));
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.Calling_Search_Space_Name_Drop(driver).click();
			Line_Page_Objects.waitFor2000();
			Line_Page_Objects.ClickLinkText(driver, ExcelUtils.getCellData(1, 3));
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.VoiceMail_Drop(driver).click();
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.ClickLinkText(driver, ExcelUtils.getCellData(1, 4));
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.Auto_Answer_Drop(driver).click();
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.ClickLinkText(driver, ExcelUtils.getCellData(1, 5));
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.Save_Button(driver).click();
			Line_Page_Objects.waitFor2000();
			Line_Page_Objects.SaveSuccessMsg(driver).getText().equalsIgnoreCase("Line create request submitted successfully");
			Line_Page_Objects.waitFor3000();
			Reporter.reportStep("Line Create Passed", "PASS");
		} catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Line Create Failed", "FAIL");
		}
	}
	
	
	public static void LineValidation(WebDriver driver) throws Exception
	
	{
		try {
			Line_Page_Objects.Left_Menu_Line(driver).click();
			Line_Page_Objects.waitFor2000();
			Line_Page_Objects.Add_Line(driver).click();
			Line_Page_Objects.waitFor1000();
			Assert.assertEquals(Line_Page_Objects.Site_Invalid(driver).getText(), "Selected Site is not valid");
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.Site_Selection(driver).click();
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.ClickPartialLinkText(driver, ExcelUtils.getCellData(1, 6));
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.Add_Line(driver).click();
			Line_Page_Objects.waitFor4000();

			Line_Page_Objects.Description_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 2));
			Line_Page_Objects.waitFor1000();
			
			//************ Validation Check ******************//
			
			Assert.assertEquals(Line_Page_Objects.DescriptionInvalid(driver).getText(), "The description field contains alphanumeric characters, space, _ or . are valid. First character must be alphanumeric.");
			Assert.assertEquals(Line_Page_Objects.DescriptionMaxlength(driver).getText(), "Please enter no more than 50 characters.");
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.Description_Txt(driver).clear();
			Line_Page_Objects.waitFor1000();

			// ************ Mandatory Validation Check ****************** //
			
			Line_Page_Objects.Close_Icon(driver).click();
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.CancelAlert(driver).getText().equalsIgnoreCase("The entered values will be cleared, would you want to cancel?");
			Line_Page_Objects.waitFor1000();
			Line_Page_Objects.Delete_Cancel_Ok(driver).click();
			Reporter.reportStep("Line Validation Passed", "PASS");
			Line_Page_Objects.waitFor1000();
		} catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Line Validation Failed", "FAIL");
		}
	}
	
	public static void LineUpdate(WebDriver driver) throws Exception
	
	{
		Line_Page_Objects.Left_Menu_Line(driver).click();
		Line_Page_Objects.waitFor2000();
		Line_Page_Objects.Search_Line(driver).sendKeys(ExcelUtils.getCellData(1, 0));
		Line_Page_Objects.waitFor1000();
		Line_Page_Objects.EditLine(driver, ExcelUtils.getCellData(1, 0)).click();
		Line_Page_Objects.waitFor2000();
		/*
		
//		Assert.assertEquals(Linenametext, ExcelUtils.getCellData(1, 0));
//		Assert.assertEquals(Line_Page_Objects.Edit_First_Name_Txt(driver).getText(), ExcelUtils.getCellData(1, 1));
//		Assert.assertEquals(Line_Page_Objects.Edit_Last_Name_Txt(driver).getText(), ExcelUtils.getCellData(1, 2));
//		Assert.assertEquals(Line_Page_Objects.Edit_Login_Name_Txt(driver).getText(), ExcelUtils.getCellData(1, 3));
//		Assert.assertEquals(Line_Page_Objects.Login_Enabled(driver).getText(), "true");
//		Line_Page_Objects.waitFor1000();
	*/	
		//************ Skill Group Link to Line ******************//
	/*	
		Line_Page_Objects.Edit_SkillGroup_Legend(driver).click();
		Line_Page_Objects.waitFor1000();
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Skill & Team");
		Line_Page_Objects.Link_SkillGroup_Search(driver).sendKeys(ExcelUtils.getCellData(1, 0));
		Line_Page_Objects.waitFor1000();
		Line_Page_Objects.Select_SkillGroup(driver).click();
		Line_Page_Objects.waitFor2000();
	*/	
		//************ Line Team Link to Line ******************//
		
//		Line_Page_Objects.Edit_LineTeam_Legend(driver).click();
//		Line_Page_Objects.waitFor1000();
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Skill & Team");
//		Line_Page_Objects.Link_LineTeam_Search(driver).sendKeys(ExcelUtils.getCellData(1, 5));
//		Line_Page_Objects.waitFor1000();
//		Line_Page_Objects.Select_LineTeam(driver).click();
//		Line_Page_Objects.waitFor1000();
//		Line_Page_Objects.Select_LineTeam_Member(driver).click();
//		Line_Page_Objects.waitFor1000();
		
		//************ Attribute Link to Line ******************//
	/*	
		Line_Page_Objects.Edit_Attribute_Legend(driver).click();
		Line_Page_Objects.waitFor1000();
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Attribute");
		Line_Page_Objects.Link_Attribute_Search(driver).sendKeys(ExcelUtils.getCellData(1, 0));
		Line_Page_Objects.waitFor1000();
		Line_Page_Objects.Select_Attribute(driver).click();
	
		Line_Page_Objects.waitFor2000();
		Line_Page_Objects.Update_Button(driver).click();
		Line_Page_Objects.waitFor2000();
		Assert.assertEquals(Line_Page_Objects.UpdateSuccessMsg(driver).getText(), "Line updated successfully");
		Line_Page_Objects.waitFor1000();*/
			
	}
	
}
