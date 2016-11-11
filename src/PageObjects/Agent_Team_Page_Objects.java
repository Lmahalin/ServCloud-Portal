package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Agent_Team_Page_Objects 
{
	private static WebElement element = null;
	
	// ********************************************** Add and List Page Objects *************************************************//
	
	
	public static WebElement Left_Menu_Agent_Team(WebDriver driver)
	{

		element = driver.findElement(By.id("module_AgentTeam"));
        return element;
    }
	
	public static WebElement Add_Agent_Team(WebDriver driver)
	{

		element = driver.findElement(By.id("agentTeam_add"));
        return element;
    }
	
	public static WebElement Delete_Agent_Team(WebDriver driver)
	{

		element = driver.findElement(By.id("agentTeam_delete"));
        return element;
    }
	public static WebElement SelectAll_Agent_Team(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[@ng-click='headerButtonClick($event)']"));
        return element;
    }
	public static WebElement Search_Agent_Team(WebDriver driver)
	{

		element = driver.findElement(By.id("agentTeam_searchText"));
        return element;
    }

	public static WebElement Site_selection(WebDriver driver)
	{

		element = driver.findElement(By.id("agentTeam_siteSelection"));
        return element;
    }

	public static WebElement Site_Invalid(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Selected Site is not valid')]"));
        return element;
    }
	
	public static WebElement Agent_TeamName_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAgentTeam_name"));
        return element;
    }
	
	public static WebElement Agent_Team_Description_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAgentTeam_description"));
        return element;
    }
	
	public static WebElement Save_Button(WebDriver driver)
	{

		element = driver.findElement(By.id("createAgentTeam_save"));
        return element;
    }
	public static WebElement Close_Icon(WebDriver driver)
	{

		element = driver.findElement(By.id("createAgentTeam_cancel"));
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
	
	
	public static WebElement Agent_TeamNameMandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.required']"));
        return element;
    }
	public static WebElement Agent_TeamNameInvalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.pattern']"));
        return element;
    }
	public static WebElement Agent_TeamNameMaxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.maxlength']"));
        return element;
    }
	
	public static WebElement Agent_Team_Description_Maxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.desc.$error.maxlength']"));
        return element;
    }
	
	public static WebElement SaveSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Agent Team created successfully')]"));
        return element;
    }

	public static WebElement UpdateSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Agent Team updated successfully')]"));
        return element;
    }

	public static WebElement DeleteSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Agent Team(s) deleted successfully')]"));
        return element;
    }
	
	// ********************************************** Update/Edit Page Objects *************************************************//
	
	
	public static WebElement EditAgentTeam(WebDriver driver, String AgentTeamName)
	{

		element = driver.findElement(By.xpath("//div[contains(@title,'"+AgentTeamName+"')]"));
        return element;
    }
	
	public static WebElement Edit_close(WebDriver driver)
	{

		element = driver.findElement(By.id("editAgentTeam_cancel"));
        return element;
    }
	
	public static WebElement Update_Save(WebDriver driver)
	{

		element = driver.findElement(By.id("editAgentTeam_save"));
        return element;
    }
	
	public static WebElement Edit_AgentName_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("editAgentTeam_name"));
        return element;
    }
	
	public static WebElement Edit_Agent_Description_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("editAgentTeam_description"));
        return element;
    }
	
	public static WebElement Edit_Agent_Legend(WebDriver driver)
	{

		element = driver.findElement(By.id("editAgentTeam_agentSection"));
        return element;
    }
	
	public static WebElement Select_Agent_Member(WebDriver driver)
	{

		element = driver.findElement(By.id("editAgentTeam_agentMemberRowSelect"));
        return element;
    }
	
	public static WebElement Select_Agent_Supervisor(WebDriver driver)
	{

		element = driver.findElement(By.id("editAgentTeam_agentSupervisorRowSelect"));
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
