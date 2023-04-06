package test_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticBrowser {

  static WebDriver driver;
	
	
	public static WebDriver openBrowser(String browserName, String URL)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver(options);
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
				{
					WebDriverManager.firefoxdriver().setup();
					driver=new FirefoxDriver();
					
				}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;		//driver launch to kar sakte hain hm in other class
							// but ab driver ka variable dusre classes me bhi lagega
							
	}

}
