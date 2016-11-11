package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page_Objects 
{
	static WebElement element = null;
	 
	public static WebElement Username(WebDriver driver)
    {

        element = driver.findElement(By.id("login_userName"));
        return element;
     }

    public static WebElement Password(WebDriver driver)
    {

        element = driver.findElement(By.id("login_password"));
        return element;
     }
    
    public static WebElement Loginbtn(WebDriver driver)
    {

        element = driver.findElement(By.id("login_action"));
        return element;
       
     }
    public static WebElement LoginError(WebDriver driver)
    {

        element = driver.findElement(By.xpath("//strong[contains(.,'Invalid login credential')]"));
        return element;
     }
    public static WebElement LoginEmptyError(WebDriver driver)
    {

        element = driver.findElement(By.xpath("//strong[contains(.,'Please enter the login credentials.')]"));
        return element;
     }
    
    public static WebElement Logout(WebDriver driver)
    {

        element = driver.findElement(By.id("header_logout"));
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


	