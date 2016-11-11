package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.Site_Page_Objects;
import Utility.ExcelUtils;
import Utility.Reporter;

public class Site_Page_Actions 
{

	public static void SiteDelete(WebDriver driver, String SiteName) throws Exception
	
	{
		try {
			Site_Page_Objects.Left_Menu_Site(driver).click();
			Site_Page_Objects.waitFor2000();
			Site_Page_Objects.Search_Site(driver).sendKeys(SiteName);
			Site_Page_Objects.waitFor1000();
			Site_Page_Objects.SelectAll_Site(driver).click();
			Site_Page_Objects.waitFor1000();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			String disabledVal = Site_Page_Objects.Delete_Site(driver).getAttribute("disabled");
			Site_Page_Objects.waitFor2000();
			
			if(disabledVal != null)
			{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Site_Page_Objects.Search_Site(driver).clear();
			Reporter.reportStep("No Site Records to Delete", "PASS");
			}
			
			else
			{		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Site_Page_Objects.Delete_Site(driver).click();
			Site_Page_Objects.waitFor1000();
			Site_Page_Objects.Delete_Ok(driver).click();
			Site_Page_Objects.waitFor2000();
			Site_Page_Objects.DeleteSuccessMsg(driver).getText().equalsIgnoreCase("Site(s) deleted successfully");
			Site_Page_Objects.waitFor1000();
			Site_Page_Objects.Search_Site(driver).clear();
			Reporter.reportStep("Site Deleted Successfully", "PASS");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Site Delete Failed", "FAIL");
		}
	}
	
	public static void SiteCreate(WebDriver driver) throws Exception
	
	{
		try {
			Site_Page_Objects.Left_Menu_Site(driver).click();
			Site_Page_Objects.waitFor1000();
			Site_Page_Objects.Add_Site(driver).click();
			Site_Page_Objects.waitFor1000();	
			Site_Page_Objects.SiteName_Add_Drop(driver).click();
			Site_Page_Objects.waitFor2000();
			driver.findElement(By.linkText(ExcelUtils.getCellData(2, 0))).click();
			Site_Page_Objects.waitFor1000();
			Site_Page_Objects.SiteName_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 0));
			Site_Page_Objects.waitFor1000();
			Site_Page_Objects.SiteName_Add_Button(driver).click();
			Site_Page_Objects.waitFor1000();
			Assert.assertEquals(Site_Page_Objects.SiteName_SaveSuccessMsg(driver).getText(), "Site created successfully");
			Site_Page_Objects.waitFor1000();
			Site_Page_Objects.FolderName_Add_Drop(driver).click();
			Site_Page_Objects.waitFor2000();
			driver.findElement(By.linkText(ExcelUtils.getCellData(2, 1))).click();
			Site_Page_Objects.waitFor1000();
			Site_Page_Objects.FolderName_Txt(driver).sendKeys(ExcelUtils.getCellData(1, 1));
			Site_Page_Objects.waitFor1000();
			Site_Page_Objects.FolderName_Add_Button(driver).click();
			Site_Page_Objects.waitFor2000();
			Assert.assertEquals(Site_Page_Objects.FolderName_SaveSuccessMsg(driver).getText(), "Folder created successfully");
			Site_Page_Objects.waitFor2000();
			Site_Page_Objects.Close_Icon(driver).click();
			Site_Page_Objects.waitFor2000();
			
			Site_Page_Objects.Add_Site(driver).click();
			Site_Page_Objects.waitFor1000();	
			Site_Page_Objects.SiteName_Add_Drop(driver).click();
			Site_Page_Objects.waitFor2000();
			driver.findElement(By.linkText(ExcelUtils.getCellData(1, 0))).click();
			Site_Page_Objects.waitFor1000();
			Site_Page_Objects.FolderName_Add_Drop(driver).click();
			Site_Page_Objects.waitFor2000();
			driver.findElement(By.partialLinkText(ExcelUtils.getCellData(1, 1))).click();
			Site_Page_Objects.waitFor1000();
			Site_Page_Objects.Save_Button(driver).click();
			Site_Page_Objects.waitFor2000();
			Site_Page_Objects.SaveSuccessMsg(driver).getText().equalsIgnoreCase("Site added successfully");
			Site_Page_Objects.waitFor1000();
			Reporter.reportStep("Site Create Passed", "PASS");
		} catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Site Create Failed", "FAIL");
		}
	}
	
	public static void SiteValidation(WebDriver driver) throws Exception
	
	{
		try {
			Site_Page_Objects.Left_Menu_Site(driver).click();
			Site_Page_Objects.waitFor2000();
			Site_Page_Objects.Add_Site(driver).click();
			Site_Page_Objects.waitFor2000();
			Site_Page_Objects.SiteName_Add_Drop(driver).click();
			Site_Page_Objects.waitFor2000();
			driver.findElement(By.linkText(ExcelUtils.getCellData(2, 0))).click();
			Site_Page_Objects.waitFor1000();
			Site_Page_Objects.SiteName_Txt(driver).sendKeys(ExcelUtils.getCellData(3, 0));
			Site_Page_Objects.waitFor2000();
			Site_Page_Objects.FolderName_Add_Drop(driver).click();
			Site_Page_Objects.waitFor2000();
			driver.findElement(By.linkText(ExcelUtils.getCellData(2, 1))).click();
			Site_Page_Objects.waitFor1000();
			Site_Page_Objects.FolderName_Txt(driver).sendKeys(ExcelUtils.getCellData(3, 1));
			Site_Page_Objects.waitFor1000();
			
			
			//************ Validation Check ******************//
			
			Assert.assertEquals(Site_Page_Objects.SiteNameInvalid(driver).getText(), "Only alphanumeric characters, dot(.) is valid. First character must be alphanumeric.");
			Assert.assertEquals(Site_Page_Objects.SiteNameMaxlength(driver).getText(), "Please enter no more than 64 characters.");
			Assert.assertEquals(Site_Page_Objects.Folder_Name_Invalid(driver).getText(), "Only alphanumeric characters, _ or . are valid. First character must be alphanumeric.");
			Assert.assertEquals(Site_Page_Objects.Folder_Name_Maxlength(driver).getText(), "Please enter no more than 64 characters.");
			
			Site_Page_Objects.waitFor1000();
			Site_Page_Objects.SiteName_Txt(driver).clear();
			Site_Page_Objects.FolderName_Txt(driver).clear();
			Site_Page_Objects.waitFor1000();
			
			//************ Mandatory Validation Check ******************//
			
			Assert.assertEquals(Site_Page_Objects.SiteNameMandatory(driver).getText(),"Site name is required.");
			Assert.assertEquals(Site_Page_Objects.Folder_Name_Mandatory(driver).getText(),"Folder name is required.");
			Site_Page_Objects.waitFor1000();
			Site_Page_Objects.Close_Icon(driver).click();
			Site_Page_Objects.waitFor2000();
			Reporter.reportStep("Site Validation Passed", "PASS");
		} catch (Exception e) {
			
			e.printStackTrace();
			Reporter.reportStep("Site Validation Failed", "FAIL");
		}
	}
	
}
