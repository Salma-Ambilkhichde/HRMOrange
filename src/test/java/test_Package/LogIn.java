package test_Package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import pom_Package.Login_page;			//we have imported Pom_Class
import test_Utility.Excel_method;		//We have imported Excel class
import test_Utility.Take_Screenshot;
public class LogIn extends BaseClass {
	Login_page login;
	SoftAssert s= new SoftAssert();
	Excel_method r;
	
	@Test(priority=0)
	public void verifyFunctionalityWithIncorrectData1() throws InterruptedException, IOException
	{
		Logger=report.createTest("Verify Login page with Invalid Details");
		 login=new Login_page(driver);
		 login.sendUsername(r.fetchDataFromExcel(2, 0));	//Row 1 , 0 column
		 login.sendPassword(r.fetchDataFromExcel(2, 1));	//Row 1 , 1 column
		 login.ClickOnLoginButton();
		 String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		 String CurrentURL=driver.getCurrentUrl();
		s.assertEquals(CurrentURL,ExpectedURL);
		s.assertAll();
	}
@Test(priority=1)
public void verifyFunctionalityWithIncorrectData2() throws InterruptedException, IOException
{
	Logger= report.createTest("Verify Login Page with Invalid Details");
	 login=new Login_page(driver);
	 login.sendUsername(r.fetchDataFromExcel(3, 0));	//Row 3 , 0 column
	 login.sendPassword(r.fetchDataFromExcel(3, 1));	//Row 1 , 3 column
	 login.ClickOnLoginButton();
	 String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	 String CurrentURL=driver.getCurrentUrl();
	s.assertEquals(CurrentURL,ExpectedURL);
	s.assertAll();
}
	
	@Test(priority=2)
	public void VerifyLoginPage() 
	{
		Logger=report.createTest("Verify login Page");		//
		Assert.fail();		//To forcefully fail the test case
	}
	
	@Test(priority=3)
  public void verifyFunctionalityCorrectData() throws InterruptedException, IOException
  {			Logger=report.createTest("Verify Login page with correct details");
		 login=new Login_page(driver);
		 login.sendUsername(r.fetchDataFromExcel(1, 0));	//Row 1 , 0 column
		 login.sendPassword(r.fetchDataFromExcel(1, 1));	//Row 1 , 1 column
		 login.ClickOnLoginButton();
		 String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		 String CurrentURL=driver.getCurrentUrl();
		 s.assertEquals(CurrentURL,ExpectedURL);
		s.assertAll();
		
  }
	

}