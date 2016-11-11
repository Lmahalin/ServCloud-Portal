package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import PageObjects.Customer_Page_Objects;
import Utility.ExcelUtils;
import Utility.Reporter;

public class Customer_Page_Actions 
{
	
	public static void CustomerDelete(WebDriver driver, String AuthName) throws Exception
	
	{
			
		try {
			Customer_Page_Objects.Left_Menu_Customer(driver).click();
			Customer_Page_Objects.waitFor2000();
			Customer_Page_Objects.Search_Customer(driver).sendKeys(AuthName);
			Customer_Page_Objects.waitFor1000();
			Customer_Page_Objects.SelectAll_Customer(driver).click();
			Customer_Page_Objects.waitFor1000();
			
			String disabledVal = Customer_Page_Objects.Delete_Customer(driver).getAttribute("disabled");
			Customer_Page_Objects.waitFor1000();
			
			if(disabledVal == null)
			{
				Customer_Page_Objects.Delete_Customer(driver).click();
				Customer_Page_Objects.waitFor1000();
				Customer_Page_Objects.Delete_Ok(driver).click();
				Customer_Page_Objects.waitFor2000();
				Customer_Page_Objects.DeleteSuccessMsg(driver).getText().equalsIgnoreCase("Customer(s) deleted successfully");
				Reporter.reportStep("Customer Deleted Successfully", "PASS");	
				Customer_Page_Objects.waitFor1000();
				Customer_Page_Objects.Search_Customer(driver).clear();

			}
			else
			{
				Customer_Page_Objects.waitFor1000();
				Customer_Page_Objects.Search_Customer(driver).clear();
				Reporter.reportStep("No Customer Records to Delete", "PASS");	
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Customer Delete Failed", "FAIL");	
		}
		
	}
	
	public static void CustomerCreate(WebDriver driver) throws Exception
	{
		//String sUserName = ExcelUtils.getCellData(1, 0);
					
		try {
			Customer_Page_Objects.Left_Menu_Customer(driver).click();
			Customer_Page_Objects.waitFor2000();
			Customer_Page_Objects.Add_Customer(driver).click();
			Customer_Page_Objects.waitFor1000();
			
			String ResellerName = ExcelUtils.getCellData(6, 0);
			String Customername = ExcelUtils.getCellData(6, 1);
			String Tenantname = ExcelUtils.getCellData(6, 2);
			String AuthName = ExcelUtils.getCellData(6, 3);
					
			Customer_Page_Objects.ResellerName_Dropdown(driver).click();
			Customer_Page_Objects.waitFor2000();
			driver.findElement(By.linkText(ResellerName)).click();
			Customer_Page_Objects.waitFor1000();
			Customer_Page_Objects.CustomerName_Dropdown(driver).click();
			Customer_Page_Objects.waitFor2000();
			driver.findElement(By.linkText(Customername)).click();
			Customer_Page_Objects.waitFor1000();
			Customer_Page_Objects.TenantName_Dropdown(driver).click();
			Customer_Page_Objects.waitFor2000();
			driver.findElement(By.linkText(Tenantname)).click();
			Customer_Page_Objects.waitFor1000();
			Customer_Page_Objects.Authentication_Dropdown(driver).click();
			Customer_Page_Objects.waitFor2000();
			driver.findElement(By.linkText(AuthName)).click();
			Customer_Page_Objects.waitFor1000();
			Customer_Page_Objects.Save_Button(driver).click();
			Customer_Page_Objects.waitFor2000();
			
			Customer_Page_Objects.SaveSuccessMsg(driver).getText().equalsIgnoreCase("Customer added successfully");
			Reporter.reportStep("Customer Create Passed", "PASS");	
			Customer_Page_Objects.waitFor2000();
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Customer Create Failed", "FAIL");	
		}
		
	}
	
}
