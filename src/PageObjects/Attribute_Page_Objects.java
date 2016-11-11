package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Attribute_Page_Objects 
{
	
	// ********************************************** Add and List Page Objects *************************************************//
	
	private static WebElement element = null;
	
	public static WebElement Left_Menu_Attribute(WebDriver driver)
	{

		element = driver.findElement(By.id("module_Attribute"));
        return element;
    }
	
	public static WebElement Add_Attribute(WebDriver driver)
	{

		element = driver.findElement(By.id("attribute_add"));
        return element;
    }
	
	public static WebElement Delete_Attribute(WebDriver driver)
	{

		element = driver.findElement(By.id("attribute_delete"));
        return element;
    }
	public static WebElement SelectAll_Attribute(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[@ng-click='headerButtonClick($event)']"));
        return element;
    }
	public static WebElement Search_Attribute(WebDriver driver)
	{

		element = driver.findElement(By.id("attribute_searchText"));
        return element;
    }

	public static WebElement Site_selection(WebDriver driver)
	{

		element = driver.findElement(By.id("attribute_siteSelection"));
        return element;
    }

	public static WebElement Site_Invalid(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Selected Site is not valid')]"));
        return element;
    }
	
	public static WebElement AttributeName_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAttribute_name"));
        return element;
    }
	
	public static WebElement Attribute_Description_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAttribute_description"));
        return element;
    }
	
	public static WebElement Attribute_Data_Type_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createAttribute_dataType"));
        return element;
    }
	
	public static WebElement Attribute_Default_value_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("createAttribute_defaultValue"));
        return element;
    }
	
	public static WebElement Save_Button(WebDriver driver)
	{

		element = driver.findElement(By.id("createAttribute_save"));
        return element;
    }
	public static WebElement Close_Icon(WebDriver driver)
	{

		element = driver.findElement(By.id("createAttribute_cancel"));
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
	
	
	// ********************************************** Validation Objects *************************************************//
	
	
	public static WebElement AttributeNameMandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.required']"));
        return element;
    }
	public static WebElement AttributeNameInvalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.pattern']"));
        return element;
    }
	public static WebElement AttributeNameMaxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.maxlength']"));
        return element;
    }
	
	public static WebElement Attribute_Description_Maxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.desc.$error.maxlength']"));
        return element;
    }
	
	public static WebElement Attribute_Description_Invalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.desc.$invalid && !createForm.desc.$pristine']"));
        return element;
    }
	
	
	
	public static WebElement SaveSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Attribute created successfully')]"));
        return element;
    }

	public static WebElement UpdateSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Attribute updated successfully')]"));
        return element;
    }

	public static WebElement DeleteSuccessMsg(WebDriver driver)
	{

		//driver.findElement(By.xpath());
		element = driver.findElement(By.xpath("//strong[contains(@class,'ng-binding ng-scope')]"));
        return element;
    }
	
	
	
	// ********************************************** Update/Edit Page Objects *************************************************//
	
	
	public static WebElement EditAttribute(WebDriver driver, String Attribute)
	{
		element = driver.findElement(By.xpath("//div[contains(.,'"+Attribute+"')]"));
        return element;
    }
	
	public static WebElement Edit_close(WebDriver driver)
	{
		element = driver.findElement(By.id("editAttribute_cancel"));
		return element;
	}
		
	public static WebElement Update_Save(WebDriver driver)
	{
		element = driver.findElement(By.id("editAttribute_save"));
        return element;
    }
		
	public static WebElement Edit_AttributeName_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("editAttribute_name"));
	    return element;
	}
		
	public static WebElement Edit_Attribute_Description_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("editAttribute_description"));
        return element;
    }
	
	public static WebElement Edit_DataType_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("editAttribute_dataType"));
        return element;
    }	

	public static WebElement Edit_DefaultValue_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("editAttribute_defaultValue"));
        return element;
    }
	
	public static WebElement Edit_Agent_Legend(WebDriver driver)
	{
		element = driver.findElement(By.id("editAttribute_agentsSection"));
		return element;
    }
	
	public static WebElement Link_Agent_Unassigned(WebDriver driver)
	{
		element = driver.findElement(By.id("editAttribute_agentRowSelect"));
		return element;
    }
	
	public static WebElement Link_Agent_Unassigned_Value(WebDriver driver)
	{
		element = driver.findElement(By.id("editAttribute_agentRowSelect_attrValue"));
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
