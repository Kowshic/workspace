package google;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(dataProvider = "dp") 
  public void f(Integer n, String s) {
	  System.out.println(n+" "+s);
  }
  @BeforeMethod (alwaysRun = true)
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod 
  public void afterMethod() {
	  System.out.println("Aftermethod");
  }

  @Test (dependsOnGroups = {"smoke"})
    public void dependsongrp()
	  {
		  System.out.println("this method is depends on group");
	  }
  
  
  @Test (groups={"regression"})
  public void show()
  {
	  System.out.println("this is show method belong to group slow");
  }
  @Test (groups={"smoke"})
  public void dance()
  {
	  int a = 10;
	  int b = 20;
	  
	  if(a==b)
	  {
		  System.out.println(a+" "+b);
	  }
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite");
  }

}
