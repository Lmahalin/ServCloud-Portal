package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.User_Page_Objects;
import Utility.Reporter;

public class User_Page_Actions 
{
	public static void UserDelete(WebDriver driver, String Filter, String Username) throws Exception
	
	{
			
		try {
			User_Page_Objects.Left_Menu_User(driver).click();
			User_Page_Objects.waitFor2000();
			User_Page_Objects.List_Filter_User(driver).click();
			driver.findElement(By.linkText(Filter)).click();
			User_Page_Objects.waitFor1000();
			User_Page_Objects.Search_User(driver).sendKeys(Username);
			User_Page_Objects.waitFor1000();
			User_Page_Objects.SelectAll_User(driver).click();
			User_Page_Objects.waitFor1000();
			
			String disabledVal = User_Page_Objects.Delete_User(driver).getAttribute("disabled");
			User_Page_Objects.waitFor1000();
			if(disabledVal == null)
			{
				User_Page_Objects.Delete_User(driver).click();
				User_Page_Objects.waitFor1000();
				User_Page_Objects.Delete_Ok(driver).click();
				User_Page_Objects.waitFor2000();
				User_Page_Objects.DeleteSuccessMsg(driver).getText().equalsIgnoreCase("User(s) deleted successfully");
				User_Page_Objects.waitFor1000();
				User_Page_Objects.Search_User(driver).clear();
				Reporter.reportStep("User Deleted Successfully", "PASS");

			}
			else
			{
				User_Page_Objects.waitFor1000();
				User_Page_Objects.Search_User(driver).clear();
				Reporter.reportStep("No User records to Delete", "PASS");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("User Delete Failed", "FAIL");
		}
		
	}
	
	public static void UserCreate(WebDriver driver, String Role, String Username, String Reseller, String Customer) throws Exception
	{
		//String sUserName = ExcelUtils.getCellData(1, 0);
					
		try {
			User_Page_Objects.Left_Menu_User(driver).click();
			User_Page_Objects.waitFor2000();
			User_Page_Objects.Add_User(driver).click();
			User_Page_Objects.waitFor1000();
			User_Page_Objects.Role_Dropdown(driver).click();
			User_Page_Objects.waitFor1000();
			driver.findElement(By.linkText(Role)).click();
			User_Page_Objects.waitFor2000();
			
			if(Role == "ServCloudAdmin")
			{
				User_Page_Objects.UserName_Dropdown(driver).click();
				User_Page_Objects.waitFor1000();
				driver.findElement(By.linkText(Username)).click();
				User_Page_Objects.waitFor1000();
				User_Page_Objects.Save_Button(driver).click();
				User_Page_Objects.waitFor2000();
				User_Page_Objects.SaveSuccessMsg(driver).getText().equalsIgnoreCase("User added successfully");
				User_Page_Objects.waitFor2000();
				Reporter.reportStep("ServCloudAdmin User Created Successfully", "PASS");
			}
			
			else if(Role == "ResellerAdmin")
			{
				
				User_Page_Objects.ResellerName_Dropdown(driver).click();
				User_Page_Objects.waitFor1000();
				driver.findElement(By.linkText(Reseller)).click();
				User_Page_Objects.waitFor1000();
				User_Page_Objects.UserName_Dropdown(driver).click();
				User_Page_Objects.waitFor1000();
				driver.findElement(By.linkText(Username)).click();
				User_Page_Objects.waitFor1000();
				User_Page_Objects.Save_Button(driver).click();
				User_Page_Objects.waitFor2000();
				User_Page_Objects.SaveSuccessMsg(driver).getText().equalsIgnoreCase("User added successfully");
				User_Page_Objects.waitFor2000();
				Reporter.reportStep("ResellerAdmin User Created Successfully", "PASS");
			}
			
			else
			{
				
				User_Page_Objects.ResellerName_Dropdown(driver).click();
				User_Page_Objects.waitFor1000();
				driver.findElement(By.linkText(Reseller)).click();
				User_Page_Objects.waitFor1000();
				User_Page_Objects.CustomerName_Dropdown(driver).click();
				User_Page_Objects.waitFor1000();
				driver.findElement(By.linkText(Customer)).click();
				User_Page_Objects.waitFor1000();
				User_Page_Objects.UserName_Dropdown(driver).click();
				User_Page_Objects.waitFor1000();
				driver.findElement(By.linkText(Username)).click();
				User_Page_Objects.waitFor1000();
				User_Page_Objects.Save_Button(driver).click();
				User_Page_Objects.waitFor2000();
				Assert.assertEquals(User_Page_Objects.SaveSuccessMsg(driver).getText(),"User added successfully");
				User_Page_Objects.waitFor2000();
				Reporter.reportStep("Customer User Created Successfully", "PASS");
			}
		} catch (Exception e) {
		
			e.printStackTrace();
			Reporter.reportStep("User Creation Failed", "FAIL");
		}
		
	}
	
}
