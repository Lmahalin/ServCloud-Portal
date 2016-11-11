package Actions;

import org.openqa.selenium.WebDriver;

import PageObjects.Config_Page_Objects;

public class Config_Page_Actions 
{
	public static void Configpage(WebDriver driver, String UserName, String Password) throws Exception
	{
				
		try {
			Config_Page_Objects.Left_Menu_Config(driver).click();
			Config_Page_Objects.waitFor2000();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	     
	}
}