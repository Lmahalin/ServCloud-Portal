package Actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.Phone_Page_Objects;
import Utility.ExcelUtils;
import Utility.Reporter;

public class Phone_Page_Actions 
{

	public static void PhoneDelete(WebDriver driver, String PhoneName) throws Exception
	
	{
		try {
			Phone_Page_Objects.Left_Menu_Phones(driver).click();
			Phone_Page_Objects.waitFor2000();
			Phone_Page_Objects.Search_Phones(driver).sendKeys(PhoneName);
			Phone_Page_Objects.waitFor2000();
			Phone_Page_Objects.SelectAll_Phones(driver).click();
			Phone_Page_Objects.waitFor1000();
			String disabledVal = Phone_Page_Objects.Delete_Phones(driver).getAttribute("disabled");
			Phone_Page_Objects.waitFor1000();
			
			if(disabledVal != null)
			{
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Search_Phones(driver).clear();
			Reporter.reportStep("No Phone Records to Delete", "FAIL");
			}
			
			else
			{		
			Phone_Page_Objects.Delete_Phones(driver).click();
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Delete_Cancel_Ok(driver).click();
			Phone_Page_Objects.waitFor2000();
			Phone_Page_Objects.DeleteSuccessMsg(driver).getText().equalsIgnoreCase("Phone(s) delete request submitted successfully");
			Phone_Page_Objects.waitFor1000();
			Reporter.reportStep("Phone Delete Passed", "PASS");
			Phone_Page_Objects.Search_Phones(driver).clear();
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Phone Delete Failed", "FAIL");
		}
	}
						//for Data Purpose //public static void PhoneCreate(WebDriver driver, String ProductType, String DeviceName, String Description, String CallingSearch, String OwnerUserID, String SoftkeyTemplate, String DoNotDisturb ) throws Exception
	
	public static void PhoneCreate(WebDriver driver) throws Exception
	
	{
		try {
			Phone_Page_Objects.Left_Menu_Phones(driver).click();
			Phone_Page_Objects.waitFor2000();
			Phone_Page_Objects.Site_Selection(driver).click();
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.ClickPartialLinkText(driver, ExcelUtils.getCellData(1, 12));
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Add_Phones(driver).click();
			Phone_Page_Objects.waitFor2000();
			Phone_Page_Objects.ProductType_Drop(driver).click();
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.ClickLinkText(driver, ExcelUtils.getCellData(1, 0));
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Device_Name_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 1));
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Description_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 2));
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.DevicePool_Name_Drop(driver).click();
			Phone_Page_Objects.waitFor2000();
			Phone_Page_Objects.ClickLinkText(driver, ExcelUtils.getCellData(1, 3));
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Location_Drop(driver).click();
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.ClickLinkText(driver, ExcelUtils.getCellData(1, 4));
			Phone_Page_Objects.waitFor1000();
			
			Phone_Page_Objects.Device_Mobility_Drop(driver).click();
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.ClickLinkText(driver, ExcelUtils.getCellData(1, 5));
			Phone_Page_Objects.waitFor1000();
			
			Phone_Page_Objects.Calling_Search_Space_Name_Drop(driver).click();
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.ClickLinkText(driver, ExcelUtils.getCellData(1, 6));
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Owner_User_ID_Drop(driver).click();
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.ClickLinkText(driver, ExcelUtils.getCellData(1, 7));
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Softkey_Template_Drop(driver).click();
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.ClickLinkText(driver, ExcelUtils.getCellData(1, 8));
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Do_Not_Disturb_Drop(driver).click();
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.ClickLinkText(driver, ExcelUtils.getCellData(1, 9));
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Line_Legend(driver).click();
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Add_Line_Btn(driver).click();
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Add_Line_Pattern_Drop(driver).click();
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.ClickLinkText(driver, ExcelUtils.getCellData(1, 10));
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Add_Line_Route_Partition_Drop(driver).click();
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.ClickLinkText(driver, ExcelUtils.getCellData(1, 11));
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Save_Button(driver).click();
			Phone_Page_Objects.waitFor2000();
			Phone_Page_Objects.SaveSuccessMsg(driver).getText().equalsIgnoreCase("Phone create request submitted successfully");
			Reporter.reportStep("Phone Create Passed", "PASS");
			Phone_Page_Objects.waitFor2000();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Phone Create Failed", "FAIL");
		}
	}
	
	
	public static void PhoneValidation(WebDriver driver) throws Exception
	
	{
		try {
			Phone_Page_Objects.Left_Menu_Phones(driver).click();
			Phone_Page_Objects.waitFor2000();
			Phone_Page_Objects.Add_Phones(driver).click();
			Phone_Page_Objects.waitFor1000();
			Assert.assertEquals(Phone_Page_Objects.Site_Invalid(driver).getText(), "Selected Site is not valid");
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Site_Selection(driver).click();
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.ClickPartialLinkText(driver, ExcelUtils.getCellData(1, 12));
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Add_Phones(driver).click();
			Phone_Page_Objects.waitFor4000();

			Phone_Page_Objects.Device_Name_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 1));
			Phone_Page_Objects.Description_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 2));
			Phone_Page_Objects.waitFor1000();
			
			//************ Validation Check ******************//
			
			Assert.assertEquals(Phone_Page_Objects.DeviceNameInvalid(driver).getText(), "Name format should match ([sS][eE][pP]|BAT)[0-9a-fA-F]{12} pattern");
			Assert.assertEquals(Phone_Page_Objects.DescriptionInvalid(driver).getText(), "The description field contains alphanumeric characters, space, _ or . are valid. First character must be alphanumeric.");
			Assert.assertEquals(Phone_Page_Objects.DescriptionMaxlength(driver).getText(), "Please enter no more than 50 characters.");
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Device_Name_Txt(driver).clear();
			Phone_Page_Objects.Description_Txt(driver).clear();
			Phone_Page_Objects.waitFor1000();

			// ************ Mandatory Validation Check ****************** //
			
			Assert.assertEquals(Phone_Page_Objects.DeviceNameMandatory(driver).getText(),"Device name is required.");
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Close_Icon(driver).click();
			Phone_Page_Objects.waitFor1000();
			Assert.assertEquals(Phone_Page_Objects.CancelAlert(driver).getText(), "The entered values will be cleared, would you want to cancel?");
			Phone_Page_Objects.waitFor1000();
			Phone_Page_Objects.Delete_Cancel_Ok(driver).click();
			
			Phone_Page_Objects.waitFor1000();
			Reporter.reportStep("Phone Validation Passed", "PASS");
		} catch (Exception e) {
		
			e.printStackTrace();
			Reporter.reportStep("Phone Validation Failed", "FAIL");
		}
	}
	
	public static void PhoneUpdate(WebDriver driver) throws Exception
	
	{
//		
//		try {
//			Phone_Page_Objects.Left_Menu_Phone(driver).click();
//			Phone_Page_Objects.waitFor2000();
//			Phone_Page_Objects.Search_Phone(driver).sendKeys(ExcelUtils.getCellData(1, 0));
//			Phone_Page_Objects.waitFor1000();
//			Phone_Page_Objects.EditPhone(driver, ExcelUtils.getCellData(1, 0)).click();
//			Phone_Page_Objects.waitFor2000();
//
//			Assert.assertEquals(Phonenametext, ExcelUtils.getCellData(1, 0));
//			Assert.assertEquals(Phone_Page_Objects.Edit_First_Name_Txt(driver).getText(), ExcelUtils.getCellData(1, 1));
//			Assert.assertEquals(Phone_Page_Objects.Edit_Last_Name_Txt(driver).getText(), ExcelUtils.getCellData(1, 2));
//			Assert.assertEquals(Phone_Page_Objects.Edit_Login_Name_Txt(driver).getText(), ExcelUtils.getCellData(1, 3));
//			Assert.assertEquals(Phone_Page_Objects.Login_Enabled(driver).getText(), "true");
//			Phone_Page_Objects.waitFor1000();
//			
//			//************ Skill Group Link to Phone ******************//
//			
//			Phone_Page_Objects.Edit_SkillGroup_Legend(driver).click();
//			Phone_Page_Objects.waitFor1000();
//			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Skill & Team");
//			Phone_Page_Objects.Link_SkillGroup_Search(driver).sendKeys(ExcelUtils.getCellData(1, 0));
//			Phone_Page_Objects.waitFor1000();
//			Phone_Page_Objects.Select_SkillGroup(driver).click();
//			Phone_Page_Objects.waitFor2000();
//
//			//************ Phone Team Link to Phone ******************//
//			
//			Phone_Page_Objects.Edit_PhoneTeam_Legend(driver).click();
//			Phone_Page_Objects.waitFor1000();
//			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Skill & Team");
//			Phone_Page_Objects.Link_PhoneTeam_Search(driver).sendKeys(ExcelUtils.getCellData(1, 5));
//			Phone_Page_Objects.waitFor1000();
//			Phone_Page_Objects.Select_PhoneTeam(driver).click();
//			Phone_Page_Objects.waitFor1000();
//			Phone_Page_Objects.Select_PhoneTeam_Member(driver).click();
//			Phone_Page_Objects.waitFor1000();
//			
//			//************ Attribute Link to Phone ******************//
//
//			Phone_Page_Objects.Edit_Attribute_Legend(driver).click();
//			Phone_Page_Objects.waitFor1000();
//			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Attribute");
//			Phone_Page_Objects.Link_Attribute_Search(driver).sendKeys(ExcelUtils.getCellData(1, 0));
//			Phone_Page_Objects.waitFor1000();
//			Phone_Page_Objects.Select_Attribute(driver).click();
//
//			Phone_Page_Objects.waitFor2000();
//			Phone_Page_Objects.Update_Button(driver).click();
//			Phone_Page_Objects.waitFor2000();
//			Assert.assertEquals(Phone_Page_Objects.UpdateSuccessMsg(driver).getText(), "Phone updated successfully");
//			Phone_Page_Objects.waitFor1000();
//		}
//		catch (Exception e) {
//
//			e.printStackTrace();
//		}
			
	}
	
}
