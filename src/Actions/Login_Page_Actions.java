package Actions;

import org.openqa.selenium.WebDriver;
import PageObjects.Login_Page_Objects;
import Utility.Reporter;

public class Login_Page_Actions 
{
	public static void ValidLogin(WebDriver driver, String UserName, String Password) throws Exception
	{
				
		try {
			Login_Page_Objects.Username(driver).clear();
			Login_Page_Objects.Password(driver).clear();
			Login_Page_Objects.Username(driver).sendKeys(UserName);		
			Login_Page_Objects.Password(driver).sendKeys(Password);			
			Login_Page_Objects.Loginbtn(driver).click();
						
			if(Login_Page_Objects.Logout(driver).isDisplayed())
			{
			Reporter.reportStep("Login Passed", "PASS");
			}
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Login FAILED", "FAIL");
		}
	     
	}
	public static void InValidLogin(WebDriver driver) throws Exception
	{
		
		try {
			Login_Page_Objects.Loginbtn(driver).click();
			Login_Page_Objects.LoginEmptyError(driver).getText().equals("Please enter the login credentials.");
			Login_Page_Objects.Username(driver).sendKeys("UsernameInvalid");	
			Login_Page_Objects.Loginbtn(driver).click();
			Login_Page_Objects.LoginEmptyError(driver).getText().equalsIgnoreCase("Please enter the login credentials.");
			Login_Page_Objects.Username(driver).clear();
			Login_Page_Objects.Username(driver).sendKeys("UserName");		
			Login_Page_Objects.Password(driver).sendKeys("Password");			
			Login_Page_Objects.Loginbtn(driver).click();
			
			if(Login_Page_Objects.LoginError(driver).getText().equals("Invalid login credential")==true)
			{
				Reporter.reportStep("Invalid Login Passed", "PASS");	
			}
				
			Login_Page_Objects.waitFor2000();
		} 
		
		catch (Exception e) 
		{
			Reporter.reportStep("Invalid Login FAILED", "FAIL");
			e.printStackTrace();
		}
		    
	}
}
