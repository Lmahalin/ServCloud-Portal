package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Phone_Page_Objects 
{
private static WebElement element = null;

	// ************************************ ADD and List Page Objects *************************************************//
	
	public static WebElement Left_Menu_Phones(WebDriver driver)
	{

		element = driver.findElement(By.id("module_Phone"));
        return element;
    }
	
	public static WebElement Add_Phones(WebDriver driver)
	{

		element = driver.findElement(By.id("phone_add"));
        return element;
    }
	
	public static WebElement Delete_Phones(WebDriver driver)
	{

		element = driver.findElement(By.id("phone_delete"));
        return element;
    }
	public static WebElement SelectAll_Phones(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[@ng-click='headerButtonClick($event)']"));
        return element;
    }
	public static WebElement Search_Phones(WebDriver driver)
	{

		element = driver.findElement(By.id("phone_searchText"));
        return element;
    }

	public static WebElement Site_Selection(WebDriver driver)
	{

		element = driver.findElement(By.id("phone_siteSelection"));
        return element;
    }
		
	public static WebElement ProductType_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createPhone_productType"));
        return element;
    }
	
	public static WebElement Device_Name_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createPhone_name"));
        return element;
    }
	
	public static WebElement Description_Txt(WebDriver driver)
	{

		element = driver.findElement(By.name("desc"));
        return element;
    }
	
	public static WebElement DevicePool_Name_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createPhone_poolName"));
        return element;
    }
	
	public static WebElement Location_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createPhone_location"));
        return element;
    }
	
	public static WebElement Device_Mobility_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createPhone_deviceMobilityMode"));
        return element;
    }
	
	public static WebElement Calling_Search_Space_Name_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createPhone_searchSpaceName"));
        return element;
    }

	public static WebElement Owner_User_ID_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createPhone_ownerUserID"));
        return element;
    }
	
	public static WebElement Softkey_Template_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createPhone_softkeyTemplate"));
        return element;
    }
	
	public static WebElement Do_Not_Disturb_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createPhone_DND"));
        return element;
    }
	
	public static WebElement Save_Button(WebDriver driver)
	{

		element = driver.findElement(By.id("createPhone_save"));
        return element;
    }
	public static WebElement Close_Icon(WebDriver driver)
	{

		element = driver.findElement(By.id("createPhone_cancel"));
        return element;
    }
	
	
	public static WebElement SaveSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Phone create request submitted successfully')]"));
        return element;
    }
	
	public static WebElement UpdateSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Phone update request submitted successfully')]"));
        return element;
    }

	public static WebElement DeleteSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Phone(s) delete request submitted successfully')]"));
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
	
	public static WebElement Line_Legend(WebDriver driver)
	{

		element = driver.findElement(By.xpath("(//div[@ng-click='toggleAttrSection()'])[1]"));
		return element;
       
    }
	
	public static WebElement Add_Line_Btn(WebDriver driver)
	{

		element = driver.findElement(By.id("createPhone_addLine"));
		return element;
       
    }
	
	public static WebElement Add_Line_Pattern_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createPhone_pattern"));
		return element;
       
    }
	
	public static WebElement Add_Line_Route_Partition_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createPhone_routePartition"));
		return element;
       
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
	
	public static WebElement DeviceNameMandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.deviceName.$error.required']"));
        return element;
    }
	
	public static WebElement DeviceNameInvalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='!createForm.deviceName.$error.required && createForm.deviceName.$error.myPattern']"));
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
	
	public static WebElement EditPhones(WebDriver driver, String PhonesName)
	{

		element = driver.findElement(By.xpath("//div[contains(.,'"+PhonesName+"')]"));
        return element;
    }
	
	public static WebElement Edit_PhonesName_Txt(WebDriver driver)
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

		element = driver.findElement(By.id("editPhone_save"));
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
