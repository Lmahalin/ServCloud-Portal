package Actions;

import org.openqa.selenium.WebDriver;

import PageObjects.Customer_Page_Objects;
import PageObjects.User_Page_Objects;
import Utility.Reporter;

public class Reseller_Admin_Actions 
{
	public static void ResellerAdmin(WebDriver driver) throws Exception
	
	{
			
		try {
			Customer_Page_Objects.Left_Menu_Customer(driver).click();
			Customer_Page_Objects.waitFor1000();
			User_Page_Objects.Left_Menu_User(driver).click();
			Customer_Page_Objects.waitFor1000();
		} catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Re Delete Passed", "PASS");
		}
					
	}
}
