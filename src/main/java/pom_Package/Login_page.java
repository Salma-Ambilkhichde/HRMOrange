package pom_Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_page {

	

			WebDriver driver;
		WebDriverWait wait;
		
		@FindBy(xpath="//input[@name='username']")
		private WebElement username;
		
		@FindBy (xpath="//input[@name='password']")
		private WebElement password;
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement login;
		
	
		public  Login_page(WebDriver driver)//Constructor create to avoid stale element exception  
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);	//initElement will store karte h
			wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		}
		public void sendUsername(String uName)
		{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='username']")));	
		username.sendKeys(uName);
		}
		public void sendPassword(String pwd)
		{	
			//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='password']")));	
			password.sendKeys(pwd);
		}
		public void ClickOnLoginButton()
		{
			login.click();
		}
		
	

}
