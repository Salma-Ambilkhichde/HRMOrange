package test_Package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom_Package.Dashboard;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Dashboard_TestClass extends BaseClass {
	
	SoftAssert s;
	Dashboard dashboard;
	
	 @BeforeClass
	  public void beforeClass() 
	 {		
		 s= new SoftAssert();
	 }

	  @BeforeMethod
	  public void beforeMethod()
	  {
		
	  }

  @Test
  public void VerifyTabsPresentOnDashboardPage() {
	  dashboard= new Dashboard();
	  dashboard.CheckVisibilityOfAdminTab();
	  boolean result=dashboard.CheckVisibilityOfAdminTab();
	  s.assertTrue(result);
  }

  @AfterMethod
  public void afterMethod() {
  }

 
  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
