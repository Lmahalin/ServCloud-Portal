package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Config_Page_Objects 
{
	static WebElement element = null;
	 
	public static WebElement Left_Menu_Config(WebDriver driver)
    {

        element = driver.findElement(By.id("sidebar_moduleName_Config"));
        return element;
     }

    public static WebElement Search_Config(WebDriver driver)
    {

        element = driver.findElement(By.id("config_searchText"));
        return element;
     }
    
    public static WebElement Save_Button(WebDriver driver)
    {

        element = driver.findElement(By.id("editConfig_save"));
        return element;
       
     }
    public static WebElement Cancel_Button(WebDriver driver)
    {

        element = driver.findElement(By.id("editConfig_cancel"));
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
  
   
}


	