package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import PageObjects.Queue_Page_Objects;
import Utility.ExcelUtils;
import Utility.Reporter;

public class Queue_Page_Actions 
{
	
	public static void QueueDelete(WebDriver driver, String AgentTeamName) throws Exception
	
	{
		try {
			Queue_Page_Objects.Left_Menu_Queue(driver).click();
			Queue_Page_Objects.waitFor2000();
			Queue_Page_Objects.Search_Queue(driver).sendKeys(AgentTeamName);
			Queue_Page_Objects.waitFor1000();
			Queue_Page_Objects.SelectAll_Queue(driver).click();
			Queue_Page_Objects.waitFor1000();
			
			String disabledVal = Queue_Page_Objects.Delete_Queue(driver).getAttribute("disabled");
			Queue_Page_Objects.waitFor2000();
			if(disabledVal != null)
			{
				Queue_Page_Objects.waitFor1000();
				Queue_Page_Objects.Search_Queue(driver).clear();
				Reporter.reportStep("No Queue records to Delete", "PASS");
			}
			
			else
			{		
				Queue_Page_Objects.Delete_Queue(driver).click();
				Queue_Page_Objects.waitFor1000();
				Queue_Page_Objects.Delete_Ok(driver).click();
				Queue_Page_Objects.waitFor2000();
				Queue_Page_Objects.DeleteSuccessMsg(driver).getText().equalsIgnoreCase("Queue(s) deleted successfully" );
				Queue_Page_Objects.waitFor1000();
				Queue_Page_Objects.Search_Queue(driver).clear();
				Reporter.reportStep("Queue Delete Passed", "PASS");
			}
		} 
		catch (Exception e) 
		{

			e.printStackTrace();
			Reporter.reportStep("Queue Delete Failed", "FAIL");
		}
	
	}
	
	public static void QueueCreate(WebDriver driver) throws Exception
	
	{
		try {
			Queue_Page_Objects.Left_Menu_Queue(driver).click();
			Queue_Page_Objects.waitFor2000();
			Queue_Page_Objects.Site_selection(driver).click();
			Queue_Page_Objects.waitFor1000();
			driver.findElement(By.partialLinkText(ExcelUtils.getCellData(1, 8))).click();
			Queue_Page_Objects.waitFor1000();
			Queue_Page_Objects.Add_Queue(driver).click();
			Queue_Page_Objects.waitFor2000();
			Queue_Page_Objects.QueueName_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 0));
			Queue_Page_Objects.waitFor1000();
			Queue_Page_Objects.Queue_Description_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 1));
			Queue_Page_Objects.waitFor1000();
			
			Queue_Page_Objects.Queue_Agent_Order_Drop(driver).click();
			Queue_Page_Objects.waitFor1000();
			Queue_Page_Objects.Queue_Agent_Order_Drop(driver).sendKeys(ExcelUtils.getCellData(1, 2));
			Queue_Page_Objects.waitFor1000();
			Queue_Page_Objects.Queue_Service_Level_Type_Drop(driver).click();
			Queue_Page_Objects.waitFor1000();
			Queue_Page_Objects.Queue_Service_Level_Type_Drop(driver).sendKeys(ExcelUtils.getCellData(1, 3));
			Queue_Page_Objects.waitFor1000();
			Queue_Page_Objects.Queue_Service_Level_Threshold_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 4));
			Queue_Page_Objects.waitFor1000();
			Queue_Page_Objects.Queue_Attribute_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 5));
			Queue_Page_Objects.waitFor1000();
			driver.findElement(By.linkText(ExcelUtils.getCellData(1, 5))).click();
			Queue_Page_Objects.waitFor1000();
			Queue_Page_Objects.Queue_Attribute_Symbol_Drop(driver).sendKeys(ExcelUtils.getCellData(1, 6));
			Queue_Page_Objects.waitFor1000();
			Queue_Page_Objects.Queue_Attribute_Value_Drop(driver).sendKeys(ExcelUtils.getCellData(1, 7));
			Queue_Page_Objects.waitFor2000();
			Queue_Page_Objects.Save_Button(driver).click();
			Queue_Page_Objects.waitFor2000();
			Queue_Page_Objects.SaveSuccessMsg(driver).getText().equalsIgnoreCase("Queue created successfully");
			Queue_Page_Objects.waitFor1000();
			Reporter.reportStep("Queue Create Passed", "PASS");
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Queue Create Failed", "FAIL");
		}

	}
	
	public static void Queue_Validation(WebDriver driver) throws Exception
	
	{
		try {
			Queue_Page_Objects.Left_Menu_Queue(driver).click();
			Queue_Page_Objects.waitFor2000();
			Queue_Page_Objects.Add_Queue(driver).click();
			Queue_Page_Objects.waitFor1000();
			Assert.assertEquals(Queue_Page_Objects.Site_Invalid(driver).getText(), "Selected Site is not valid");
			Queue_Page_Objects.waitFor1000();
			Queue_Page_Objects.Site_selection(driver).click();
			Queue_Page_Objects.waitFor2000();
			driver.findElement(By.partialLinkText(ExcelUtils.getCellData(1, 8))).click();
			Queue_Page_Objects.waitFor1000();
			Queue_Page_Objects.Add_Queue(driver).click();
			Queue_Page_Objects.waitFor2000();
			Queue_Page_Objects.QueueName_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 0));
			Queue_Page_Objects.Queue_Description_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 1));
			Queue_Page_Objects.waitFor1000();
			Queue_Page_Objects.Queue_Service_Level_Threshold_Txt(driver).sendKeys(ExcelUtils.getCellData(2, 4));
			Queue_Page_Objects.waitFor2000();
			
			Assert.assertEquals(Queue_Page_Objects.QueueNameInvalid(driver).getText(), "Only alphanumeric characters, _ or . are valid. First character must be alphanumeric.");
			Assert.assertEquals(Queue_Page_Objects.QueueNameMaxlength(driver).getText(), "Please enter no more than 50 characters.");
			Assert.assertEquals(Queue_Page_Objects.Queue_Description_Maxlength(driver).getText(), "Please enter no more than 255 characters.");
			Assert.assertEquals(Queue_Page_Objects.Queue_Service_Level_Invalid(driver).getText(), "Please specify a whole number between 0 and 2147483647");
			Queue_Page_Objects.waitFor1000();

			Queue_Page_Objects.QueueName_Txt(driver).clear();
			Queue_Page_Objects.Queue_Description_Txt(driver).clear();
			Queue_Page_Objects.Queue_Service_Level_Threshold_Txt(driver).clear();
			Queue_Page_Objects.waitFor1000();
			Assert.assertEquals(Queue_Page_Objects.QueueNameMandatory(driver).getText(),"Name is required.");
			Assert.assertEquals(Queue_Page_Objects.Queue_Service_Level_Invalid(driver).getText(), "Please specify a whole number between 0 and 2147483647");
			Queue_Page_Objects.waitFor1000();
			Queue_Page_Objects.Close_Icon(driver).click();
			Queue_Page_Objects.waitFor2000();
			Reporter.reportStep("Queue Validation Passed", "PASS");
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Queue Validation Failed", "FAIL");
		}
	}
	
	public static void Queue_Update(WebDriver driver) throws Exception
	
	{
		try {
			Queue_Page_Objects.Left_Menu_Queue(driver).click();
			Queue_Page_Objects.Search_Queue(driver).sendKeys(ExcelUtils.getCellData(3, 0));
			Queue_Page_Objects.waitFor1000();
			Queue_Page_Objects.Edit_Queue(driver, ExcelUtils.getCellData(3, 0)).click();
			Queue_Page_Objects.Edit_Queue_Description(driver).clear();
			Queue_Page_Objects.Edit_Queue_Description(driver).sendKeys(ExcelUtils.getCellData(3, 1));
			Queue_Page_Objects.Edit_Queue_Order(driver).sendKeys(ExcelUtils.getCellData(3, 2));
			Queue_Page_Objects.Edit_Queue_ServiceType(driver).sendKeys(ExcelUtils.getCellData(3, 3));
			Queue_Page_Objects.Edit_Queue_Threshold(driver).clear();
			Queue_Page_Objects.Edit_Queue_Threshold(driver).sendKeys(ExcelUtils.getCellData(3, 4));
			Queue_Page_Objects.Edit_Attribute_AddStep(driver).click();
			Queue_Page_Objects.Edit_Queue_Select_Attribute_Name(driver).sendKeys(ExcelUtils.getCellData(3, 5));
			Queue_Page_Objects.waitFor1000();
			driver.findElement(By.linkText(ExcelUtils.getCellData(3, 5))).click();
//		Queue_Page_Objects.Edit_Queue_Add_Attribute_Btn(driver).click();
//		Queue_Page_Objects.Edit_Queue_Select_Attribute_Name(driver).sendKeys();
//		Queue_Page_Objects.waitFor1000();
//		driver.findElement(By.linkText(ExcelUtils.getCellData(3, 5))).click();
			Queue_Page_Objects.waitFor1000();
			Queue_Page_Objects.Update(driver).click();
			Queue_Page_Objects.waitFor2000();
			Assert.assertEquals(Queue_Page_Objects.UpdateSuccessMsg(driver).getText(), "Queue updated successfully");
			Reporter.reportStep("Queue Delete Passed", "PASS");
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Queue Update Failed", "FAIL");
		}
		
	}
}
