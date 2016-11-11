package Actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.Authentication_Page_Objects;
import Utility.ExcelUtils;
import Utility.Reporter;

public class Authentication_Page_Actions 
{

	public static void AuthenticationDelete(WebDriver driver, String AuthName) throws Exception
	
	{
			
		try {
			Authentication_Page_Objects.Left_Menu_Authentication(driver).click();
			Authentication_Page_Objects.waitFor2000();
			Authentication_Page_Objects.Search_Authentication(driver).sendKeys(AuthName);
			Authentication_Page_Objects.waitFor1000();
			Authentication_Page_Objects.SelectAll_Authentication(driver).click();
			Authentication_Page_Objects.waitFor1000();
			
			String disabledVal = Authentication_Page_Objects.Delete_Authentication(driver).getAttribute("disabled");
			Authentication_Page_Objects.waitFor1000();
			
			if(disabledVal == null)
			{
				Authentication_Page_Objects.Delete_Authentication(driver).click();
				Authentication_Page_Objects.waitFor1000();
				Authentication_Page_Objects.Delete_Ok(driver).click();
				Authentication_Page_Objects.waitFor2000();
				Authentication_Page_Objects.DeleteSuccessMsg(driver).getText().equalsIgnoreCase("Authentication(s) deleted successfully");
				Reporter.reportStep("Authentication Delete Passed", "PASS");
				Authentication_Page_Objects.waitFor1000();
				Authentication_Page_Objects.Search_Authentication(driver).clear();
			}
			else
			{
				
				Authentication_Page_Objects.waitFor1000();
				Authentication_Page_Objects.Search_Authentication(driver).clear();
				Reporter.reportStep("No Authentication Records to Delete", "PASS");
			}
		} 
		catch (Exception e) 
		{
			Reporter.reportStep("Authentication Delete Failed", "FAIL");
			e.printStackTrace();
		}
		
	}
	
	public static void AuthenticationValidation(WebDriver driver) throws Exception
	{
				
		try {
			Authentication_Page_Objects.Left_Menu_Authentication(driver).click();
			Authentication_Page_Objects.waitFor2000();
			Authentication_Page_Objects.Add_Authentication(driver).click();
			Authentication_Page_Objects.waitFor2000();
			Authentication_Page_Objects.AuthenticationName_Txt(driver).sendKeys(ExcelUtils.getCellData(3, 0));
			
			Authentication_Page_Objects.LDAP_Host_Txt(driver).sendKeys(ExcelUtils.getCellData(3, 1));
			Authentication_Page_Objects.LDAP_Port_Txt(driver).sendKeys(ExcelUtils.getCellData(3, 2));
			Authentication_Page_Objects.Secured_Port_Checkbox(driver).click();
			Authentication_Page_Objects.Search_Base_Txt(driver).sendKeys(ExcelUtils.getCellData(3, 3));
			Authentication_Page_Objects.Username_Txt(driver).sendKeys(ExcelUtils.getCellData(3, 4));
			Authentication_Page_Objects.Password_Txt(driver).sendKeys(ExcelUtils.getCellData(3, 5));
			Authentication_Page_Objects.Confirm_Password_Txt(driver).sendKeys(ExcelUtils.getCellData(3, 6));
			
			Authentication_Page_Objects.waitFor2000();
			
			Assert.assertEquals(Authentication_Page_Objects.AuthenticationNameInvalid(driver).getText(),"Only alphanumeric characters, _ or . are valid. First character must be alphanumeric.");
			Assert.assertEquals(Authentication_Page_Objects.LDAPServerInvalid(driver).getText(), "Only alphanumeric characters, _ or . are valid. First character must be alphanumeric.");
			Assert.assertEquals(Authentication_Page_Objects.LDAPPortInvalid(driver).getText(), "Only enter valid port number");
			Assert.assertEquals(Authentication_Page_Objects.SearchBaseInvalid(driver).getText(), "Only enter valid Search Base");
			Assert.assertEquals(Authentication_Page_Objects.UsernameInvalid(driver).getText(), "Only alphanumeric characters, _ or . are valid. First character must be alphanumeric.");
			Assert.assertEquals(Authentication_Page_Objects.AuthenticationNameMaxlength(driver).getText(), "Please enter no more than 32 characters.");
			Assert.assertEquals(Authentication_Page_Objects.LDAPServerMaxlength(driver).getText(), "Please enter no more than 64 characters.");
			Assert.assertEquals(Authentication_Page_Objects.LDAPPortMaxlength(driver).getText(), "Please enter no more than 5 digits.");
			Assert.assertEquals(Authentication_Page_Objects.SearchBaseMaxlength(driver).getText(), "Please enter no more than 255 characters.");
			Assert.assertEquals(Authentication_Page_Objects.UsernameMaxlength(driver).getText(), "Please enter no more than 64 characters.");
			Assert.assertEquals(Authentication_Page_Objects.ConfPasswordMismatch(driver).getText(), "Password does not match");
					
			Authentication_Page_Objects.waitFor2000();
			
			Authentication_Page_Objects.AuthenticationName_Txt(driver).clear();
			Authentication_Page_Objects.LDAP_Host_Txt(driver).clear();
			Authentication_Page_Objects.LDAP_Port_Txt(driver).clear();
			Authentication_Page_Objects.Search_Base_Txt(driver).clear();
			Authentication_Page_Objects.Username_Txt(driver).clear();
			Authentication_Page_Objects.Password_Txt(driver).clear();
			Authentication_Page_Objects.Confirm_Password_Txt(driver).clear();
			
			Authentication_Page_Objects.waitFor2000();
			
			Assert.assertEquals(Authentication_Page_Objects.AuthenticationNameMandatory(driver).getText(),"Name is required");
			Assert.assertEquals(Authentication_Page_Objects.LDAPServerMandatory(driver).getText(),"Host name is required");
			Assert.assertEquals(Authentication_Page_Objects.LDAPPortMandatory(driver).getText(),"Port number is required");
			Assert.assertEquals(Authentication_Page_Objects.SearchBaseMandatory(driver).getText(),"Search Base is required");
			Assert.assertEquals(Authentication_Page_Objects.UserNameMandatory(driver).getText(),"User name is required");
			Assert.assertEquals(Authentication_Page_Objects.PasswordMandatory(driver).getText(),"Password is required");
			
			Authentication_Page_Objects.waitFor1000();
			Authentication_Page_Objects.Close_Icon(driver).click();
			Authentication_Page_Objects.CancelAlert(driver).getText().equalsIgnoreCase("Cancel Authentication");
			Authentication_Page_Objects.Delete_Ok(driver).click();
			Reporter.reportStep("Authentication Validation Passed", "PASS");
			Authentication_Page_Objects.waitFor1000();
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
			Reporter.reportStep("Authentication Validation failed", "FAIL");
		}
	}
	
	public static void AuthenticationCreate(WebDriver driver) throws Exception
	{
		//String sUserName = ExcelUtils.getCellData(1, 0);
					
		try {
			Authentication_Page_Objects.Left_Menu_Authentication(driver).click();
			Authentication_Page_Objects.waitFor2000();
			Authentication_Page_Objects.Add_Authentication(driver).click();
			Authentication_Page_Objects.waitFor1000();
			Authentication_Page_Objects.AuthenticationName_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 0));
			Authentication_Page_Objects.LDAP_Host_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 1));
			Authentication_Page_Objects.LDAP_Port_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 2));
			Authentication_Page_Objects.Search_Base_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 3));
			Authentication_Page_Objects.Username_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 4));
			Authentication_Page_Objects.Password_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 5));
			Authentication_Page_Objects.Confirm_Password_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 6));
			Authentication_Page_Objects.waitFor1000();
			Authentication_Page_Objects.Save_Button(driver).click();
			Authentication_Page_Objects.waitFor2000();
			
			Assert.assertEquals(Authentication_Page_Objects.SaveSuccessMsg(driver).getText(),"Authentication added successfully");
			
			//Authentication updated successfully
					
			Authentication_Page_Objects.waitFor2000();
			
			Authentication_Page_Objects.Add_Authentication(driver).click();
			Authentication_Page_Objects.waitFor1000();
			Authentication_Page_Objects.AuthenticationName_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 0));
			Authentication_Page_Objects.LDAP_Host_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 1));
			Authentication_Page_Objects.LDAP_Port_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 2));
			Authentication_Page_Objects.Search_Base_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 3));
			Authentication_Page_Objects.Username_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 4));
			Authentication_Page_Objects.Password_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 5));
			Authentication_Page_Objects.Confirm_Password_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 6));
			Authentication_Page_Objects.waitFor1000();
			Authentication_Page_Objects.Save_Button(driver).click();
			Authentication_Page_Objects.waitFor2000();
			
			Authentication_Page_Objects.SaveSuccessMsg(driver).getText().equalsIgnoreCase("Authentication added successfully");
			Reporter.reportStep("Authentication Create Passed", "PASS");
			Authentication_Page_Objects.waitFor2000();
		} 
		
		catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Authentication Create Failed", "FAIL");	
		}
		
	}
	
}
