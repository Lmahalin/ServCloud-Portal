package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Line_Page_Objects 
{
private static WebElement element = null;

	// ************************************ ADD and List Page Objects *************************************************//
	
	public static WebElement Left_Menu_Line(WebDriver driver)
	{

		element = driver.findElement(By.id("module_Line"));
        return element;
    }
	
	public static WebElement Add_Line(WebDriver driver)
	{

		element = driver.findElement(By.id("line_add"));
        return element;
    }
	
	public static WebElement Delete_Line(WebDriver driver)
	{

		element = driver.findElement(By.id("line_delete"));
        return element;
    }
	public static WebElement SelectAll_Line(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[@ng-click='headerButtonClick($event)']"));
        return element;
    }
	public static WebElement Search_Line(WebDriver driver)
	{

		element = driver.findElement(By.id("line_searchText"));
        return element;
    }

	public static WebElement Site_Selection(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//button[@ng-click='mainForm.open_menu = true']"));
        return element;
    }
		
	public static WebElement DirectoryNum_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createLine_pattern"));
        return element;
    }
	
	public static WebElement Route_Partition_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createLine_routePartition"));
        return element;
    }
	
	public static WebElement Description_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createLine_description"));
        return element;
    }
	
	public static WebElement Calling_Search_Space_Name_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createLine_searchSpaceName"));
        return element;
    }
	
	public static WebElement VoiceMail_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createLine_voiceMailProfile"));
        return element;
    }

	public static WebElement Auto_Answer_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createLine_autoAnswer"));
        return element;
    }
	
	public static WebElement Save_Button(WebDriver driver)
	{

		element = driver.findElement(By.id("createLine_save"));
        return element;
    }
	public static WebElement Close_Icon(WebDriver driver)
	{

		element = driver.findElement(By.id("createLine_cancel"));
        return element;
    }
	
	
	public static WebElement SaveSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Line create request submitted successfully')]"));
        return element;
    }
	
	public static WebElement UpdateSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Line update request submitted successfully')]"));
        return element;
    }

	public static WebElement DeleteSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Line(s) delete request submitted successfully')]"));
        return element;
    }
	
	public static WebElement Delete_Cancel_Ok(WebDriver driver)
	{

		element = driver.findElement(By.id("modal_footer_ok"));
        return element;
    }
	
	public static WebElement Delete_Cancel_No(WebDriver driver)
	{

		element = driver.findElement(By.id("modal_footer_close"));
        return element;
    }
	
	
	public static void ClickLinkText(WebDriver driver, String Linktext)
	{

		driver.findElement(By.linkText(Linktext)).click();
        
    }
	
	public static void ClickPartialLinkText(WebDriver driver,String PartialLinktext)
	{

		driver.findElement(By.partialLinkText(PartialLinktext)).click();
       
    }
	
	// ************************************ Validation Objects *************************************************//
	
	public static WebElement Site_Invalid(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Selected Site is not valid')]"));
        return element;
    }
	
	public static WebElement Profile_Legend_Wrap(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[contains(.,'Profile')]"));
        return element;
    }
	
		
	public static WebElement DescriptionMaxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.desc.$error.maxlength']"));
        return element;
    }
	
	public static WebElement DescriptionInvalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.desc.$error.pattern']"));
        return element;
    }
	
	public static WebElement CancelAlert(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//p[contains(.,'The entered values will be cleared, would you want to cancel?')]"));
        return element;
    }	
		
	// ********************************************** Edit Page Objects *************************************************//
	
	public static WebElement EditLine(WebDriver driver, String LineName)
	{

		element = driver.findElement(By.xpath("//div[contains(.,'"+LineName+"')]"));
        return element;
    }
	
	public static WebElement Edit_LineName_Txt(WebDriver driver)
	{

		element = driver.findElement(By.name("name"));
        return element;
    }
	
		
	public static WebElement Edit_Profile_Legend(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[contains(.,'Profile')]"));
        return element;
    }
	
		
	public static WebElement Update_Button(WebDriver driver)
	{

		element = driver.findElement(By.id("editLine_save"));
        return element;
    }
	
	// ********************************************** Waits *************************************************//
	
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
