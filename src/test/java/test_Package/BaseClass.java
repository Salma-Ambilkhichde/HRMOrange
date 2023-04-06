package test_Package;
import java.io.IOException;
import java.time.Duration;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import test_Utility.StaticBrowser;
import test_Utility.Take_Screenshot;

public class BaseClass {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentHtmlReporter extend;
	static ExtentTest Logger;
	@Parameters({"browserName"})
	@BeforeTest
	public void beforeTest(String browserName) throws InterruptedException,IOException
	{		
		report= new ExtentReports();	//here we have created object of Extend class
		extend = new ExtentHtmlReporter("test-output"+File.separator+"report"+File.separator+"HRMOrange"+System.currentTimeMillis()+".html");
		report.attachReporter(extend);
		WebDriver driver=StaticBrowser.openBrowser(browserName, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
		
	@AfterMethod
	
		public void captureScreenshot(ITestResult result) throws IOException, InterruptedException
		{
		Thread.sleep(1000);
		if(result.getStatus()==ITestResult.FAILURE)
		{
		String path=Take_Screenshot.captureScreenshot(driver);
		Logger.fail("Test case is failed ", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			
			//with the help of mediaEntityBuilder we are taking screenshot from path with the help of createScreenCaptureFromPath 
			//method and passing argument path in this and with build method we are building overall procedure .
			
		}
		Logger.pass("Test case is passed");
		report.flush();	
}
	
			@AfterTest
			public void afterTest ()
			{
				driver.quit();
			}
	



			
	}


