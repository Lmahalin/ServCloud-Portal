package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Site_Page_Objects 
{

	private static WebElement element = null;
	
	public static WebElement Left_Menu_Site(WebDriver driver)
	{

		element = driver.findElement(By.id("module_Site"));
        return element;
    }
	
	public static WebElement Add_Site(WebDriver driver)
	{

		element = driver.findElement(By.id("site_add"));
        return element;
    }
	
	public static WebElement Delete_Site(WebDriver driver)
	{

		element = driver.findElement(By.id("site_delete"));
        return element;
    }
	
	public static WebElement SelectAll_Site(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[@ng-click='headerButtonClick($event)']"));
        return element;
    }
	
	public static WebElement Search_Site(WebDriver driver)
	{

		element = driver.findElement(By.id("site_searchText"));
        return element;
    }

	public static WebElement SiteName_Add_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createSite_site"));
        return element;
    }
	
	public static WebElement SiteName_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createSite_siteName"));
        return element;
    }

	public static WebElement SiteName_Add_Button(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//button[contains(.,'Add Site Name')]"));
        return element;
    }
	
	public static WebElement FolderName_Add_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createSite_folder"));
        return element;
    }
	
	public static WebElement FolderName_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createSite_folderPath"));
        return element;
    }
	
	public static WebElement FolderName_Add_Button(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//button[contains(.,'Add Folder Path')]"));
        return element;
    }
	
	public static WebElement Save_Button(WebDriver driver)
	{

		element = driver.findElement(By.id("createSite_save"));
        return element;
    }
	
	public static WebElement Close_Icon(WebDriver driver)
	{

		element = driver.findElement(By.id("createSite_cancel"));
        return element;
    }
	
	public static WebElement SiteNameMandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.siteName.$error.required']"));
        return element;
    }
	
	public static WebElement SiteNameInvalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.siteName.$error.pattern']"));
        return element;
    }
	
	public static WebElement SiteNameMaxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.siteName.$error.maxlength']"));
        return element;
    }
	
	public static WebElement Folder_Name_Mandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.folderName.$error.required']"));
        return element;
    }
	
	public static WebElement Folder_Name_Invalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.folderName.$error.pattern']"));
        return element;
    }
	
	public static WebElement Folder_Name_Maxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.folderName.$error.maxlength']"));
        return element;
    }
	
	public static WebElement Edit_SiteName_List(WebDriver driver, String SiteName)
	{

		element = driver.findElement(By.xpath("//div[@title='"+SiteName+"']"));
        return element;
    }
	
	public static WebElement Edit_SiteName_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("editSite_site"));
        return element;
    }
	
	public static WebElement Update_Button(WebDriver driver)
	{

		element = driver.findElement(By.id("editSite_save"));
        return element;
    }
	
	public static WebElement Edit_Close(WebDriver driver)
	{

		element = driver.findElement(By.id("editSite_cancel"));
        return element;
    }	
	
	public static WebElement SaveSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Site added successfully')]"));
        return element;
    }
	
	public static WebElement SiteName_SaveSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Site created successfully')]"));
        return element;
    }
	
	public static WebElement FolderName_SaveSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Folder created successfully')]"));
        return element;
    }
	
	public static WebElement UpdateSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Site updated successfully')]"));
        return element; 
    }

	public static WebElement DeleteSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Site(s) deleted successfully"));
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
