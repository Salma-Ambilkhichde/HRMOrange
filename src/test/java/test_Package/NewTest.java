package test_Package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {

	  @BeforeTest
	  public void beforeTest(String browserName) 
	  {
		  if (browserName.equals("chrome"));
		  {
			  System.out.println("Opening the Chrome browser");
		  }
		   if(browserName.equals("firefox"))
		  {
			  System.out.println("Opening the Firefox browser");
		  }
		  else if (browserName.equals("edge"))
		  {
			  System.out.println("OPening the edge browser");
		  }
	  }
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }


  @AfterTest
  public void afterTest() {
  }

}
