package test_Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Take_Screenshot {

	public static String captureScreenshot(WebDriver driver) throws IOException
	
	{	String path="C:\\Users\\salma\\eclipse-workspace\\OrangeHRM\\test-output\\Screenshots\\Screenshot.png";
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest= new File(path);
	
		
		FileHandler.copy(src, dest);
		
		return path;
	
	
	}

}
