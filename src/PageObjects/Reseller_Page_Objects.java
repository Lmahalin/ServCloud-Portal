package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reseller_Page_Objects 
{
	
private static WebElement element = null;
	
	public static WebElement Left_Menu_Reseller(WebDriver driver)
	{

		element = driver.findElement(By.id("module_Reseller"));
        return element;
    }
	
	public static WebElement Add_Reseller(WebDriver driver)
	{

		element = driver.findElement(By.id("reseller_add"));
        return element;
    }
	
	public static WebElement Delete_Reseller(WebDriver driver)
	{

		element = driver.findElement(By.id("reseller_delete"));
        return element;
    }
	public static WebElement SelectAll_Reseller(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[@ng-click='headerButtonClick($event)']"));
        return element;
    }
	public static WebElement Search_Reseller(WebDriver driver)
	{

		element = driver.findElement(By.id("reseller_searchText"));
        return element;
    }
	public static WebElement ResellerName_Dropdown(WebDriver driver)
	{

		element = driver.findElement(By.id("createReseller_reseller"));
        return element;
    }
	public static WebElement Authentication_Dropdown(WebDriver driver)
	{

		element = driver.findElement(By.id("createReseller_authName"));
        return element;
    }
	
	public static WebElement Save_Button(WebDriver driver)
	{

		element = driver.findElement(By.id("createReseller_save"));
        return element;
    }
	public static WebElement Close_Icon(WebDriver driver)
	{

		element = driver.findElement(By.id("createReseller_cancel"));
        return element;
    }
	
	public static WebElement DeleteSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Reseller(s) deleted successfully')]"));
        return element;
    }
	public static WebElement SaveSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Reseller added successfully')]"));
        return element;
    }

	public static WebElement UpdateSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Reseller updated successfully')]"));
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
