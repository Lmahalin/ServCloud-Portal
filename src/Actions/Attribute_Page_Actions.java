package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.Attribute_Page_Objects;
import Utility.ExcelUtils;
import Utility.Reporter;

public class Attribute_Page_Actions 
{
	
	public static void AttributeDelete(WebDriver driver, String AttributeName) throws Exception
	
	{
		try {
			Attribute_Page_Objects.Left_Menu_Attribute(driver).click();
			Attribute_Page_Objects.Search_Attribute(driver).sendKeys(AttributeName);
			
//			WebDriverWait wait = new WebDriverWait(driver, 20);
//			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Attribute_Page_Objects.SelectAll_Attribute(driver)));
//			element.click();
			Attribute_Page_Objects.waitFor2000();		
			Attribute_Page_Objects.SelectAll_Attribute(driver).click();
			Attribute_Page_Objects.waitFor1000();	
			String disabledVal = Attribute_Page_Objects.Delete_Attribute(driver).getAttribute("disabled");
				
			if(disabledVal != null)
			{
				Attribute_Page_Objects.Search_Attribute(driver).clear();
				Reporter.reportStep("No Attribute Records to Delete", "PASS");	
			}
			
			else
			{	
				Attribute_Page_Objects.waitFor1000();	
				Attribute_Page_Objects.Delete_Attribute(driver).click();
				Attribute_Page_Objects.waitFor1000();			
				Attribute_Page_Objects.Delete_Ok(driver).click();
				Attribute_Page_Objects.waitFor2000();		
				if((Attribute_Page_Objects.DeleteSuccessMsg(driver).getText().equalsIgnoreCase("Attribute(s) deleted successfully")) == true)
				{
					Attribute_Page_Objects.Search_Attribute(driver).clear();
					Reporter.reportStep("Attribute Delete Passed", "PASS");
				}
				else if((Attribute_Page_Objects.DeleteSuccessMsg(driver).getText().startsWith("The Attribute"))==true)
				{
					Attribute_Page_Objects.Search_Attribute(driver).clear();
					Reporter.reportStep("Attribute Cannot be Deleted since it is linked to Precision Queues", "PASS");
				}
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Attribute Delete Failed", "FAIL");
		}
	
	}
	
	public static void AttributeCreate(WebDriver driver) throws Exception
	
	{
		try 
		{
			Attribute_Page_Objects.Left_Menu_Attribute(driver).click();
			Attribute_Page_Objects.Site_selection(driver).click();
			driver.findElement(By.partialLinkText(ExcelUtils.getCellData(1, 4))).click();
			Attribute_Page_Objects.Add_Attribute(driver).click();
			Attribute_Page_Objects.AttributeName_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 0));
			Attribute_Page_Objects.Attribute_Description_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 1));
			Attribute_Page_Objects.Attribute_Data_Type_Drop(driver).click();
			Attribute_Page_Objects.Attribute_Data_Type_Drop(driver).sendKeys(ExcelUtils.getCellData(1, 2));
			Attribute_Page_Objects.Attribute_Default_value_Drop(driver).click();
			Attribute_Page_Objects.Attribute_Default_value_Drop(driver).sendKeys(ExcelUtils.getCellData(1, 3));
			Attribute_Page_Objects.Save_Button(driver).click();
			Attribute_Page_Objects.waitFor2000();				
			Assert.assertEquals(Attribute_Page_Objects.SaveSuccessMsg(driver).getText(), "Attribute created successfully");
			Reporter.reportStep("Attribute Create Passed", "PASS");	
		} 
		
		catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Attribute Create Failed", "FAIL");
		}
	}
	
	public static void Attribute_Validation(WebDriver driver) throws Exception
	
	{
		try {
			Attribute_Page_Objects.Left_Menu_Attribute(driver).click();
			Attribute_Page_Objects.waitFor2000();
			Attribute_Page_Objects.Add_Attribute(driver).click();
			Attribute_Page_Objects.waitFor1000();
			Reporter.reportStep("Site Invalid - " + Attribute_Page_Objects.Site_Invalid(driver).getText().equalsIgnoreCase("Selected Site is not valid") + " Actual Text - " + Attribute_Page_Objects.Site_Invalid(driver).getText(), "INFO");
			Attribute_Page_Objects.Site_selection(driver).click();
			driver.findElement(By.partialLinkText(ExcelUtils.getCellData(1, 4))).click();
			Attribute_Page_Objects.waitFor1000();
			Attribute_Page_Objects.Add_Attribute(driver).click();
			Attribute_Page_Objects.waitFor2000();
			Attribute_Page_Objects.AttributeName_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 0));
			Attribute_Page_Objects.Attribute_Description_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 1));
			Attribute_Page_Objects.waitFor1000();
 			
			Reporter.reportStep("Attribute Name Invalid - " + Attribute_Page_Objects.AttributeNameInvalid(driver).getText().equals("Only alphanumeric characters, _ or . are valid. First character must be alphanumeric.") + " Actual Text - " + Attribute_Page_Objects.AttributeNameInvalid(driver).getText(), "INFO");
			Attribute_Page_Objects.waitFor1000();
			Reporter.reportStep("Attribute Description Max - " + Attribute_Page_Objects.Attribute_Description_Maxlength(driver).getText().equals("Please enter no more than 100 characters.") + " Actual Text - " + Attribute_Page_Objects.Attribute_Description_Maxlength(driver).getText(),"INFO");
			//Reporter.reportStep("Attribute Description Invalid - " + Attribute_Page_Objects.Attribute_Description_Invalid(driver).getText().equals("Only alphanumeric characters, _ or . or space are valid. First character must be alphanumeric.") + " Actual Text - " + Attribute_Page_Objects.Attribute_Description_Invalid(driver).getText(), "info");
			Attribute_Page_Objects.AttributeName_Txt(driver).clear();
			Attribute_Page_Objects.Attribute_Description_Txt(driver).clear();
			Attribute_Page_Objects.waitFor1000();
			Reporter.reportStep("Attribute Mandatory - " + Attribute_Page_Objects.AttributeNameMandatory(driver).getText().equalsIgnoreCase("Name is required.") + " Actual Text - " + Attribute_Page_Objects.AttributeNameMandatory(driver).getText(), "INFO");
			Attribute_Page_Objects.Close_Icon(driver).click();
			Attribute_Page_Objects.waitFor1000();
			Attribute_Page_Objects.Delete_Ok(driver).click();
			Attribute_Page_Objects.waitFor1000();
			Reporter.reportStep("Attribute Validation Passed", "PASS");
			Attribute_Page_Objects.waitFor1000();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Reporter.reportStep("Attribute Validation Failed", "FAIL");
		}
	}
	
	public static void Attribute_Update(WebDriver driver) throws Exception
	
	{
		try {
			Attribute_Page_Objects.Left_Menu_Attribute(driver).click();
			Attribute_Page_Objects.waitFor2000();
			Attribute_Page_Objects.Search_Attribute(driver).sendKeys(ExcelUtils.getCellData(1, 0));
			Attribute_Page_Objects.waitFor1000();
			Attribute_Page_Objects.EditAttribute(driver, ExcelUtils.getCellData(1, 0)).click();
			Attribute_Page_Objects.waitFor2000();
			Attribute_Page_Objects.Edit_Attribute_Description_Txt(driver).clear();
			Attribute_Page_Objects.Edit_Attribute_Description_Txt(driver).sendKeys(ExcelUtils.getCellData(3, 1));
			Attribute_Page_Objects.waitFor1000();
			Attribute_Page_Objects.Edit_DefaultValue_Drop(driver).sendKeys(ExcelUtils.getCellData(3, 3));
			Attribute_Page_Objects.waitFor1000();
			Attribute_Page_Objects.Update_Save(driver).click();
			Attribute_Page_Objects.waitFor2000();
			Attribute_Page_Objects.UpdateSuccessMsg(driver).getText().equalsIgnoreCase("Attribute updated successfully");
			Reporter.reportStep("Attribute Update Passed", "PASS");
			Attribute_Page_Objects.waitFor1000();
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Attribute Update Failed", "FAIL");
		}
	}
	
}
