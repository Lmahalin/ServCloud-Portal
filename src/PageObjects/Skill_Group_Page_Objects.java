package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Skill_Group_Page_Objects 
{
	private static WebElement element = null;
	
	public static WebElement Left_Menu_Skill_Group(WebDriver driver)
	{

		element = driver.findElement(By.id("module_SkillGroup"));
        return element;
    }
	
	public static WebElement Add_Skill_Group(WebDriver driver)
	{

		element = driver.findElement(By.id("skill_add"));
        return element;
    }
	
	public static WebElement Delete_Skill_Group(WebDriver driver)
	{

		element = driver.findElement(By.id("skill_delete"));
        return element;
    }
	public static WebElement SelectAll_Skill_Group(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[@ng-click='headerButtonClick($event)']"));
        return element;
    }
	public static WebElement Search_Skill_Group(WebDriver driver)
	{

		element = driver.findElement(By.id("skill_searchText"));
        return element;
    }

	public static WebElement Site_selection(WebDriver driver)
	{

		element = driver.findElement(By.id("skill_siteSelection"));
        return element;
    }

	public static WebElement Site_Invalid(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Selected Site is not valid')]"));
        return element;
    }
	
	public static WebElement Skill_GroupName_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createSkill_name"));
        return element;
    }
	
	public static WebElement Skill_Description_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createSkill_description"));
        return element;
    }
	
	public static WebElement Save_Button(WebDriver driver)
	{

		element = driver.findElement(By.id("createSkill_save"));
        return element;
    }
	public static WebElement Close_Icon(WebDriver driver)
	{

		element = driver.findElement(By.id("createSkill_cancel"));
        return element;
    }
	
	public static WebElement Skill_GroupNameMandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.required']"));
        return element;
    }
	public static WebElement Skill_GroupNameInvalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.pattern']"));
        return element;
    }
	public static WebElement Skill_GroupNameMaxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.maxlength']"));
        return element;
    }
	
	public static WebElement Skill_Description_Maxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.desc.$error.maxlength']"));
        return element;
    }
	
	public static WebElement SaveSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Skill Group created successfully')]"));
        return element;
    }

	public static WebElement UpdateSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Skill Group updated successfully')]"));
        return element;
    }

	public static WebElement DeleteSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Skill Group(s) deleted successfully')]"));
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
	
	public static WebElement Edit_SkillGroup(WebDriver driver, String SkillGroup)
	{

		element = driver.findElement(By.xpath("//div[@title='"+SkillGroup+"']"));
        return element;
    }
	
	public static WebElement Legend_Details(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[contains(.,'    Details')]"));
        return element;
    }
	
	public static WebElement Legend_Agent(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[@id='editSkill_agentSection']"));
        return element;
    }
	
	public static WebElement Link_Agent_Search(WebDriver driver)
	{

		element = driver.findElement(By.xpath("	editSkill_agentsSearchText"));
        return element;
    }
	
	public static WebElement Select_Agent(WebDriver driver)
	{

		element = driver.findElement(By.xpath("	editSkill_agentRowSelect"));
        return element;
    }
	
	public static WebElement Update_SkillGroup(WebDriver driver)
	{

		element = driver.findElement(By.id("editSkill_save"));
        return element;
    }
	
	public static WebElement Edit_SkillGroup_Name(WebDriver driver)
	{

		element = driver.findElement(By.id("editSkill_name"));
        return element;
    }
	
	public static WebElement Edit_SkillGroup_Description(WebDriver driver)
	{

		element = driver.findElement(By.id("editSkill_description"));
        return element;
    }
	
	public static WebElement Edit_SkillGroup_Close(WebDriver driver)
	{

		element = driver.findElement(By.id("editSkill_cancel"));
        return element;
    }
	
	public static WebElement CancelAlert(WebDriver driver) 
	{
		element = driver.findElement(By.xpath("//h3[contains(.,'Cancel Skill Group')]"));
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
