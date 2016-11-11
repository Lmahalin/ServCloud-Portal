package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class Agent_Page_Objects 
{
private static WebElement element = null;

	// ************************************ ADD and List Page Objects *************************************************//
	
	public static WebElement Left_Menu_Agent(WebDriver driver)
	{

		element = driver.findElement(By.id("sidebar_moduleName_Agent"));
        return element;
    }
	
	public static WebElement Add_Agent(WebDriver driver)
	{

		element = driver.findElement(By.id("agent_add"));
        return element;
    }
	
	public static WebElement Delete_Agent(WebDriver driver)
	{

		element = driver.findElement(By.id("agent_delete"));
        return element;
    }
	public static WebElement SelectAll_Agent(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[@ng-click='headerButtonClick($event)']"));
        return element;
    }
	public static WebElement Search_Agent(WebDriver driver)
	{

		element = driver.findElement(By.id("agent_searchText"));
        return element;
    }

	public static WebElement Site_Selection(WebDriver driver)
	{

		element = driver.findElement(By.id("agent_siteSeletion"));
        return element;
    }

	public static WebElement Site_Invalid(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Selected Site is not valid')]"));
        return element;
    }
	
	public static WebElement AgentName_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAgent_name"));
        return element;
    }
	
	public static WebElement First_Name_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAgent_firstName"));
        return element;
    }
	
	public static WebElement Last_Name_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAgent_lastName"));
        return element;
    }

	public static WebElement Login_Name_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAgent_loginName"));
        return element;
    }
	
	public static WebElement Password_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAgent_password"));
        return element;
    }
	
	public static WebElement Confirm_Password_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("createAgent_confirmPassword"));
        return element;
    }
	
	public static WebElement Supervisor_Checkbox(WebDriver driver)
	{

		element = driver.findElement(By.id("createAgent_supervisor"));
        return element;
    }
	
	public static WebElement Save_Button(WebDriver driver)
	{

		element = driver.findElement(By.id("createAgent_save"));
        return element;
    }
	public static WebElement Close_Icon(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//span[@class='sprit closeIcon']"));
        return element;
    }
			
	public static WebElement UpdateSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Agent updated successfully')]"));
        return element;
    }

	public static WebElement DeleteSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Agent(s) deleted successfully')]"));
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
	
	public static WebElement CancelAlert(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//h3[contains(.,'Cancel Agent')]"));
        return element;
    }
	
	
	// ************************************ Validation Objects *************************************************//
	
	public static WebElement Profile_Legend_Wrap(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[contains(.,'Profile')]"));
        return element;
    }
	
	public static WebElement AgentNameInvalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.pattern']"));
        return element;
    }
		
	public static WebElement AgentNameMaxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.maxlength']"));
        return element;
    }
	
	public static WebElement AgentNameMandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.name.$error.required']"));
        return element;
    }
	
	public static WebElement First_Name_Mandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.firstName.$error.required']"));
        return element;
    }
	public static WebElement First_Name_Invalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.firstName.$error.pattern']"));
        return element;
    }
	public static WebElement First_Name_Maxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.firstName.$error.maxlength']"));
        return element;
    }
	
	public static WebElement Last_Name_Mandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.lastName.$error.required']"));
        return element;
    }
	public static WebElement Last_Name_Invalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.lastName.$error.pattern']"));
        return element;
    }
	public static WebElement Last_Name_Maxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.lastName.$error.maxlength']"));
        return element;
    }	
	
	public static WebElement Login_Name_Mandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.loginName.$error.required']"));
        return element;
    }
	public static WebElement Login_Name_Invalid(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.loginName.$error.pattern']"));
        return element;
    }
	public static WebElement Login_Name_Maxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.loginName.$error.maxlength']"));
        return element;
    }
		
	public static WebElement Password_Mandatory(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.password.$error.required']"));
        return element;
    }
	
	public static WebElement Password_Minlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.password.$error.minlength']"));
        return element;
    }
	
	public static WebElement Password_Maxlength(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.password.$error.maxlength']"));
        return element;
    }
	
	public static WebElement Password_Error(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='createForm.password.$error.pattern']"));
        return element;
    }
	
	public static WebElement ConfPasswordMismatch(WebDriver driver)
	{

		element = driver.findElement(By.cssSelector("span[ng-show='!createForm.cpass.$error.required && createForm.cpass.$error.match']"));
        return element;
    }
	
	public static WebElement SaveSuccessMsg(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'Agent created successfully')]"));
        return element;
    }
	
	public static WebElement LoginAlreadyExist(WebDriver driver) throws Exception
	{

		element = driver.findElement(By.xpath("//strong[contains(.,'LoginName Already Exists: "+ExcelUtils.getCellData(1, 3)+"')]"));
        return element;
    }
	
	
	// ********************************************** Edit Page Objects *************************************************//
	
	public static WebElement EditAgent(WebDriver driver, String AgentName)
	{

		element = driver.findElement(By.xpath("//div[contains(.,'"+AgentName+"')]"));
        return element;
    }
	
	public static WebElement Login_Enabled(WebDriver driver)
	{

		element = driver.findElement(By.id("editAgent_loginEnabled"));
        return element;
    }
	
	public static WebElement Edit_AgentName_Txt(WebDriver driver)
	{

		element = driver.findElement(By.name("name"));
        return element;
    }
	
	public static WebElement Edit_First_Name_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("editAgent_firstName"));
        return element;
    }
	
	public static WebElement Edit_Last_Name_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("editAgent_lastName"));
        return element;
    }
	
	public static WebElement Edit_Login_Name_Txt(WebDriver driver)
	{

		element = driver.findElement(By.id("editAgent_loginName"));
        return element;
    }
	
	public static WebElement Edit_Profile_Legend(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[contains(.,'Profile')]"));
        return element;
    }
	
	public static WebElement Edit_SkillGroup_Legend(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[@ng-click='toggleSkillGroupSection()']"));
        return element;
    }
	
	public static WebElement Edit_AgentTeam_Legend(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[@ng-click='toggleTeamSection()']"));
        return element;
    }
	
	public static WebElement Edit_Attribute_Legend(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//div[@ng-click='toggleAttrSection()']"));
        return element;
    }
	
	public static WebElement Edit_Audit_Legend(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@ng-click='toggleAuditSection()']"));
        return element;
    }
	
	public static WebElement Link_SkillGroup(WebDriver driver, String SkillGroup)
	{
		element = driver.findElement(By.xpath("//div[contains(.,'" +SkillGroup+"')]"));
        return element;
    }
	
	public static WebElement Link_SkillGroup_Search(WebDriver driver)
	{
		element = driver.findElement(By.id("editAgent_skillSearchText"));
        return element;
    }
	
	public static WebElement Select_SkillGroup(WebDriver driver)
	{
		element = driver.findElement(By.id("editAgent_skillRowSelect"));
        return element;
    }
	
	public static WebElement Link_AgentTeam_Search(WebDriver driver)
	{
		element = driver.findElement(By.id("editAgent_teamSearchText"));
        return element;
    }
	
	public static WebElement Select_AgentTeam(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='editAgent_teamRowSelect']/div[1]"));
        return element;
    }
	
	public static WebElement Select_AgentTeam_Member(WebDriver driver)
	{
		element = driver.findElement(By.id("editAgent_teamRowSelect_member"));
        return element;
    }
	
	public static WebElement Select_AgentTeam_Supervisor(WebDriver driver)
	{
		element = driver.findElement(By.id("editAgent_teamRowSelect_supervisor"));
        return element;
    }
	
	public static WebElement Link_Attribute_Search(WebDriver driver)
	{
		element = driver.findElement(By.id("editAgent_attrSearchText"));
        return element;
    }
	
	public static WebElement Select_Attribute(WebDriver driver)
	{
		element = driver.findElement(By.id("editAgent_attrRowSelect_attrValue"));
        return element;
    }
	
	public static WebElement Select_Attribute_Value(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector("#editAgent_attrRowSelect_attrValue"));
        return element;
    }
	
	public static WebElement Update_Button(WebDriver driver)
	{

		element = driver.findElement(By.id("editAgent_save"));
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
