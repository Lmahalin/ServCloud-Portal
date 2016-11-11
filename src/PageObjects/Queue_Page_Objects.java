package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Queue_Page_Objects 
{
private static WebElement element = null;

/************************************** Create Objects ***********************************************************/
	
	public static WebElement Left_Menu_Queue(WebDriver driver)
	{

		element = driver.findElement(By.id("module_Queue"));
        return element;
    }
	
	public static WebElement Add_Queue(WebDriver driver)
	{

		element = driver.findElement(By.id("queue_add"));
        return element;
    }
	
	public static WebElement Delete_Queue(WebDriver driver)
	{

		element = driver.findElement(By.id("queue_delete"));
        return element;
    }
	
	public static WebElement SelectAll_Queue(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[@ng-click='headerButtonClick($event)']"));
        return element;
    }
	
	public static WebElement Search_Queue(WebDriver driver)
	{

		element = driver.findElement(By.id("queue_searchText"));
        return element;
    }

	public static WebElement Site_selection(WebDriver driver)
	{

		element = driver.findElement(By.id("queue_siteSelection"));
        return element;
    }

	public static WebElement Site_Invalid(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Selected Site is not valid')]"));
        return element;
    }
	
	public static WebElement QueueName_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("CreateQueue_name"));
        return element;
    }
	
	public static WebElement Queue_Description_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("CreateQueue_description"));
        return element;
    }
	
	public static WebElement Queue_Agent_Order_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("CreateQueue_agentOrder"));
        return element;
    }
	
	public static WebElement Queue_Service_Level_Type_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("CreateQueue_serviceLevel"));
        return element;
    }

	public static WebElement Queue_Service_Level_Threshold_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("CreateQueue_threshold"));
        return element;
    }
	
	public static WebElement Queue_Attribute_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("CreateQueue_attributeName"));
        return element;
    }	
	
	public static WebElement Queue_Attribute_Symbol_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("CreateQueue_attrDataTypes"));
        return element;
    }
	
	public static WebElement Queue_Attribute_Value_Drop(WebDriver driver)
	{

		element = driver.findElement(By.id("CreateQueue_attrDefaultValue"));
        return element;
    }
	
	public static WebElement Save_Button(WebDriver driver)
	{

		element = driver.findElement(By.id("CreateQueue_save"));
        return element;
    }
	
	public static WebElement Close_Icon(WebDriver driver)
	{

		element = driver.findElement(By.id("CreateQueue_cancel"));
        return element;
    }
	
	/************************************** Validation Objects ***********************************************************/
		
	public static WebElement QueueNameMandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.required']"));
        return element;
    }
	
	public static WebElement QueueNameInvalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.pattern']"));
        return element;
    }

	public static WebElement QueueNameMaxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.maxlength']"));
        return element;
    }
	
	public static WebElement Queue_Description_Maxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.desc.$error.maxlength']"));
        return element;
    }
	
	public static WebElement Queue_Service_Level_Invalid(WebDriver driver)
	{
																	
		element = driver.findElement(By.xpath("//span[contains(.,'Please specify a whole number between 0 and 2147483647')]"));
        return element;
    }
	
	public static WebElement SaveSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Queue created successfully')]"));
        return element;
    }

	public static WebElement UpdateSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Queue updated successfully')]"));
        return element;
    }

	public static WebElement DeleteSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Queue(s) deleted successfully')]"));
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
	
		
	/************************************** Edit Objects ***************************************************************/
	
	public static WebElement Edit_Queue(WebDriver driver, String QueueName )
	{

		element = driver.findElement(By.xpath("//div[contains(.,'"+QueueName+"')]"));
        return element;
    }
	
	public static WebElement Update(WebDriver driver)
	{

		element = driver.findElement(By.id("editQueue_save"));
        return element;
    }
	
	public static WebElement Cancel(WebDriver driver)
	{

		element = driver.findElement(By.id("editQueue_cancel"));
        return element;
    }
	
	public static WebElement Edit_Queue_Name(WebDriver driver)
	{

		element = driver.findElement(By.id("editQueue_name"));
        return element;
    }
	
	public static WebElement Edit_Queue_Description(WebDriver driver)
	{

		element = driver.findElement(By.id("editQueue_description"));
        return element;
    }
	
	public static WebElement Edit_Queue_Order(WebDriver driver)
	{

		element = driver.findElement(By.id("editQueue_agentOrder"));
        return element;
    }
	
	public static WebElement Edit_Queue_ServiceType(WebDriver driver)
	{

		element = driver.findElement(By.id("editQueue_serviceLvelType"));
        return element;
    }
	
	public static WebElement Edit_Queue_Threshold(WebDriver driver)
	{

		element = driver.findElement(By.id("editQueue_threshold"));
        return element;
    }
	
	public static WebElement Edit_Attribute_AddStep(WebDriver driver)
	{

		element = driver.findElement(By.id("editQueue_addStep"));
        return element;
    }
	
	public static WebElement Edit_Queue_Select_Attribute_Name(WebDriver driver)
	{

		element = driver.findElement(By.id("editQueue_attrExpr_name"));
        return element;
    }
	
	public static WebElement Edit_Queue_Step_1(WebDriver driver)
	{

		element = driver.findElement(By.id("editQueue_selectStep_0"));
        return element;
    }
	
	public static WebElement Edit_Queue_Add_Attribute_Btn(WebDriver driver)
	{

		element = driver.findElement(By.id("editQueue_addAttribute"));
        return element;
    }
	
	public static WebElement Edit_Queue_Add_Expression_Btn(WebDriver driver)
	{

		element = driver.findElement(By.id("editQueue_addExpression"));
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
