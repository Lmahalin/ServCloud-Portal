package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Customer_Page_Objects 
{

private static WebElement element = null;
	
	public static WebElement Left_Menu_Customer(WebDriver driver)
	{

		element = driver.findElement(By.id("module_Customer"));
        return element;
    }
	
	public static WebElement Add_Customer(WebDriver driver)
	{

		element = driver.findElement(By.id("customer_add"));
        return element;
    }
	
	public static WebElement Delete_Customer(WebDriver driver)
	{

		element = driver.findElement(By.id("customer_delete"));
        return element;
    }
	public static WebElement SelectAll_Customer(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[@ng-click='headerButtonClick($event)']"));
        return element;
    }
	public static WebElement Search_Customer(WebDriver driver)
	{

		element = driver.findElement(By.id("customer_searchText"));
        return element;
    }
	
	public static WebElement ResellerName_Dropdown(WebDriver driver)
	{

		element = driver.findElement(By.id("createCustomer_reseller"));
        return element;
    }
	
	public static WebElement CustomerName_Dropdown(WebDriver driver)
	{

		element = driver.findElement(By.id("createCustomer_customer"));
        return element;
    }
	
	public static WebElement TenantName_Dropdown(WebDriver driver)
	{

		element = driver.findElement(By.id("createCustomer_tenant"));
        return element;
    }	
	
	public static WebElement Authentication_Dropdown(WebDriver driver)
	{

		element = driver.findElement(By.id("createCustomer_authenticationName"));
        return element;
    }
	
	public static WebElement Save_Button(WebDriver driver)
	{

		element = driver.findElement(By.id("createCustomer_save"));
        return element;
    }
	public static WebElement Close_Icon(WebDriver driver)
	{

		element = driver.findElement(By.id("createCustomer_cancel"));
        return element;
    }
	
	public static WebElement DeleteSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Customer(s) deleted successfully')]"));
        return element;
    }
	public static WebElement SaveSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Customer added successfully')]"));
        return element;
    }

	public static WebElement UpdateSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Customer updated successfully')]"));
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
