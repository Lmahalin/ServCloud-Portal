package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class User_Page_Objects 
{
	private static WebElement element = null;
	
	public static WebElement Left_Menu_User(WebDriver driver)
	{

		element = driver.findElement(By.id("module_User"));
        return element;
    }
	
	public static WebElement Add_User(WebDriver driver)
	{

		element = driver.findElement(By.id("user_add"));
        return element;
    }
	
	public static WebElement Delete_User(WebDriver driver)
	{

		element = driver.findElement(By.id("user_delete"));
        return element;
    }
	
	public static WebElement Delete_Ok(WebDriver driver)
	{

		element = driver.findElement(By.id("modal_footer_ok"));
        return element;
    }
	
	public static WebElement Delete_No(WebDriver driver)
	{

		element = driver.findElement(By.id("modal_footer_close"));
        return element;
    }
	
	public static WebElement SelectAll_User(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[@ng-click='headerButtonClick($event)']"));
        return element;
    }
	public static WebElement Search_User(WebDriver driver)
	{

		element = driver.findElement(By.id("user_searchText"));
        return element;
    }
	
	public static WebElement List_Filter_User(WebDriver driver)
	{

		element = driver.findElement(By.id("user_siteSelection"));
        return element;
    }

	public static WebElement Role_Dropdown(WebDriver driver)
	{

		element = driver.findElement(By.id("createUser_role"));
        return element;
    }
	
	public static WebElement ResellerName_Dropdown(WebDriver driver)
	{

		element = driver.findElement(By.id("createUser_reseller"));
        return element;
    }
	
	public static WebElement UserName_Dropdown(WebDriver driver)
	{

		element = driver.findElement(By.id("createUser_userName"));
        return element;
    }
	
	public static WebElement CustomerName_Dropdown(WebDriver driver)
	{

		element = driver.findElement(By.id("createUser_customer"));
        return element;
    }	
	
	public static WebElement LoginName_ReadOnly(WebDriver driver)
	{

		element = driver.findElement(By.id("createUser_loginName"));
        return element;
    }
	
		public static WebElement Save_Button(WebDriver driver)
	{

		element = driver.findElement(By.id("createUser_save"));
        return element;
    }
		
	public static WebElement Close_Icon(WebDriver driver)
	{

		element = driver.findElement(By.id("createUser_cancel"));
        return element;
    }
	
	public static WebElement DeleteSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'User(s) deleted successfully')]"));
        return element;
    }
	
	public static WebElement SaveSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'User added successfully')]"));
        return element;
    }

	public static WebElement UpdateSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'User updated successfully')]"));
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
