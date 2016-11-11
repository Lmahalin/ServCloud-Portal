package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Authentication_Page_Objects 
{
	
private static WebElement element = null;
	
	public static WebElement Left_Menu_Authentication(WebDriver driver)
	{

		element = driver.findElement(By.id("module_Auth"));
        return element;
    }
	
	public static WebElement Add_Authentication(WebDriver driver)
	{

		element = driver.findElement(By.id("auth_add"));
        return element;
    }
	
	public static WebElement Delete_Authentication(WebDriver driver)
	{

		element = driver.findElement(By.id("auth_delete"));
        return element;
    }
	public static WebElement SelectAll_Authentication(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[@ng-click='headerButtonClick($event)']"));
        return element;
    }
	public static WebElement Search_Authentication(WebDriver driver)
	{

		element = driver.findElement(By.id("auth_searchText"));
        return element;
    }
	public static WebElement AuthenticationName_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAuth_name"));
        return element;
    }
	public static WebElement LDAP_Host_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAuth_LDAPHost"));
        return element;
    }
	public static WebElement LDAP_Port_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAuth_LDAPPort"));
        return element;
    }
	
	public static WebElement Secured_Port_Checkbox(WebDriver driver)
	{

		element = driver.findElement(By.id("createAuth_isSecuredPort"));
        return element;
    }
	public static WebElement Search_Base_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAuth_searchBase"));
        return element;
    }
	public static WebElement Username_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAuth_userName"));
        return element;
    }
	public static WebElement Password_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAuth_password"));
        return element;
    }
	public static WebElement Confirm_Password_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAuth_confirmPassword"));
        return element;
    }
	public static WebElement Save_Button(WebDriver driver)
	{

		element = driver.findElement(By.id("createAuth_save"));
        return element;
    }
	public static WebElement Close_Icon(WebDriver driver)
	{

		element = driver.findElement(By.id("createAuth_cancel"));
        return element;
    }
	
	public static WebElement AuthenticationNameMandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.required']"));
        return element;
    }
	public static WebElement AuthenticationNameInvalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.pattern']"));
        return element;
    }
	public static WebElement AuthenticationNameMaxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.maxlength"));
        return element;
    }
	
	
	public static WebElement LDAPServerMandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.host.$error.required']"));
        return element;
    }
	public static WebElement LDAPServerInvalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.host.$error.pattern']"));
        return element;
    }
	public static WebElement LDAPServerMaxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.host.$error.maxlength"));
        return element;
    }
	
	public static WebElement LDAPPortMandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.port.$error.required']"));
        return element;
    }
	public static WebElement LDAPPortInvalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.port.$error.pattern']"));
        return element;
    }
	public static WebElement LDAPPortMaxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.port.$error.maxlength']"));
        return element;
    }	
	
	public static WebElement SearchBaseMandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.searchBase.$error.required']"));
        return element;
    }
	public static WebElement SearchBaseInvalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.searchBase.$error.pattern']"));
        return element;
    }
	public static WebElement SearchBaseMaxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.searchBase.$error.maxlength']"));
        return element;
    }
		
	public static WebElement UserNameMandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.user.$error.required']"));
        return element;
    }
	public static WebElement UsernameInvalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.user.$error.pattern']"));
        return element;
    }
	public static WebElement UsernameMaxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.user.$error.maxlength']"));
        return element;
    }
	public static WebElement PasswordMandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.pass.$error.required']"));
        return element;
    }
	public static WebElement ConfPasswordMismatch(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='!createForm.cpass.$error.required && createForm.cpass.$error.match']"));
        return element;
    }
	
	public static WebElement SaveSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Authentication added successfully')]"));
        return element;
    }

	public static WebElement UpdateSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Authentication updated successfully')]"));
        return element;
    }

	public static WebElement DeleteSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Authentication(s) deleted successfully')]"));
        return element;
    }
	
	public static WebElement Delete_Ok(WebDriver driver)
	{

		element = driver.findElement(By.id("modal_footer_ok"));
        return element;
    }
	
	public static WebElement DeleteClose(WebDriver driver)
	{

		element = driver.findElement(By.id("modal_footer_close"));
        return element;
    }
	
	public static WebElement CancelAlert(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//h3[contains(.,'Cancel Authentication')]"));
        return element;
    }
	
		
	public static void waitFor1000() throws Exception
	{	
		  
		Thread.sleep(1000);	
		
    }
	
	public static void waitFor2000() throws Exception
	{	
		  
		Thread.sleep(2000);	
		
    }
	public static void waitFor3000() throws Exception
	{	
		  
		Thread.sleep(3000);	
		
    }
	public static void waitFor4000() throws Exception
	{	
		  
		Thread.sleep(4000);	
		
    }
    
}
