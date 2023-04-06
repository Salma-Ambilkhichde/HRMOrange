package pom_Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard{
		WebDriver driver;
		WebDriverWait wait;
	
		@FindBy(xpath="//span")
		private WebElement AdminTab;
		
		@FindBy(xpath="//li[@class='oxd-main-menu-item-wrapper']")
		private WebElement PIMTab;
		
		@FindBy(xpath="//span[text()='Leave']")
		private WebElement LeaveTab;

		@FindBy(xpath="//span[text()='Time']")
		private WebElement TimeTab;

		@FindBy(xpath="//span[text()='Recruitment']")
		private WebElement RecruitmentTab;

		@FindBy(xpath="//span[text()='My Info']")
		private WebElement MyInfoTab;

		@FindBy(xpath="//span[text()='Performance']")
		private WebElement PerformaneTab;
		
		@FindBy(xpath="//span[text()='Dashboard']")
		private WebElement DashboardTab;
		@FindBy(xpath="//span[text()='Directory']")
		private WebElement DirectoryTab;
		@FindBy(xpath="//span[text()='Maintenance']")
		private WebElement MaintenanceTab;
		
		@FindBy(xpath="//span[Text()='Buzz']")
		private WebElement BuzzTab;


public void Dashboard(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
}
 public boolean CheckVisibilityOfAdminTab()
 {
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span")));
	 return AdminTab.isDisplayed();
	 
 }
 public boolean CheckVisibilityOfPIMTab()
 {
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span")));
	 return PIMTab.isDisplayed();
	 
 }
 public boolean CheckVisibilityOfLeaveTab()
 {
	 
	 return LeaveTab.isDisplayed();
	 
 }
 public boolean CheckVisibilityOfTimeTab()
 {
	 
	 return TimeTab.isDisplayed();
	 
 }
 public boolean CheckVisibilityOfRecruitmentTab()
 {
	 
	 return RecruitmentTab.isDisplayed();
	 
 }
 public boolean CheckVisibilityOfMyInfoTab()
 {
	 
	 return MyInfoTab.isDisplayed();
	 
 }
 public boolean CheckVisibilityOfPerformaneTab()
 {
	 
	 return PerformaneTab.isDisplayed();
	 
 }
 public boolean CheckVisibilityOfDashboardTab()
 {
	 
	 return DashboardTab.isDisplayed();
 }
 public boolean CheckVisibilityOfDirectoryTab()
 {
	 
	 return DirectoryTab.isDisplayed();
	 
 }
 public boolean CheckVisibilityOfMaintenanceTab()
 {
	 
	 return MaintenanceTab.isDisplayed();
	 
 }

 public boolean CheckVisibilityOfBuzzTab()
 {
	 
	 return BuzzTab.isDisplayed();
	 
 }


 }
























