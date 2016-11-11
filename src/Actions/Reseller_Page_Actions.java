package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import PageObjects.Reseller_Page_Objects;
import Utility.ExcelUtils;
import Utility.Reporter;

public class Reseller_Page_Actions 
{
	public static void ResellerDelete(WebDriver driver, String AuthName) throws Exception
	
	{
			
		try {
			Reseller_Page_Objects.Left_Menu_Reseller(driver).click();
			Reseller_Page_Objects.waitFor2000();
			Reseller_Page_Objects.Search_Reseller(driver).sendKeys(AuthName);
			Reseller_Page_Objects.waitFor1000();
			Reseller_Page_Objects.SelectAll_Reseller(driver).click();
			Reseller_Page_Objects.waitFor1000();
			
			String disabledVal = Reseller_Page_Objects.Delete_Reseller(driver).getAttribute("disabled");
			Reseller_Page_Objects.waitFor1000();
			
			if(disabledVal != null)
			{		
				Reseller_Page_Objects.waitFor1000();
				Reseller_Page_Objects.Search_Reseller(driver).clear();
				Reporter.reportStep("No Reseller Records to Delete", "PASS");
			}
			else
			{		
				Reseller_Page_Objects.Delete_Reseller(driver).click();
				Reseller_Page_Objects.waitFor1000();
				Reseller_Page_Objects.Delete_Ok(driver).click();
				Reseller_Page_Objects.waitFor2000();
				Reseller_Page_Objects.DeleteSuccessMsg(driver).getText().equalsIgnoreCase("Reseller(s) deleted successfully");
				Reseller_Page_Objects.waitFor1000();
				Reseller_Page_Objects.Search_Reseller(driver).clear();
				Reporter.reportStep("Reseller Delete Passed", "PASS");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Reseller Delete Failed", "FAIL");
		}
		
	}
	
	public static void ResellerCreate(WebDriver driver) throws Exception
	{
		//String sUserName = ExcelUtils.getCellData(1, 0);
					
		try {
			Reseller_Page_Objects.Left_Menu_Reseller(driver).click();
			Reseller_Page_Objects.waitFor2000();
			Reseller_Page_Objects.Add_Reseller(driver).click();
			Reseller_Page_Objects.waitFor1000();
			Reseller_Page_Objects.ResellerName_Dropdown(driver).click();
			Reseller_Page_Objects.waitFor1000();
			String ResellerName = ExcelUtils.getCellData(2, 0);
			driver.findElement(By.linkText(ResellerName)).click();
			Reseller_Page_Objects.waitFor2000();
			String AuthName = ExcelUtils.getCellData(2, 1);
			Reseller_Page_Objects.Authentication_Dropdown(driver).click();
			Reseller_Page_Objects.waitFor1000();
			driver.findElement(By.linkText(AuthName)).click();
			Reseller_Page_Objects.waitFor2000();
			Reseller_Page_Objects.Save_Button(driver).click();
			Reseller_Page_Objects.waitFor2000();
			
			Reseller_Page_Objects.SaveSuccessMsg(driver).getText().equalsIgnoreCase("Reseller added successfully");
			Reseller_Page_Objects.waitFor2000();
			Reporter.reportStep("Reseller Create Passed", "PASS");
		} catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Reseller Create Failed", "FAIL");
		}
		
	}
}
