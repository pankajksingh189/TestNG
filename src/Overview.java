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

public class Overview {
  @Test(dataProvider = "dp")
  public void Test3(Integer n, String s) {
	  System.out.println(n+"--"+s);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }

  @AfterMethod
  public void afterMethod() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }
  @BeforeClass
  public void beforeClass() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }

  @AfterClass
  public void afterClass() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }

  @BeforeTest
  public void beforeTest() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
   }

  @AfterTest
  public void afterTest() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }

  @BeforeSuite
  public void beforeSuite() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }

  @AfterSuite
  public void afterSuite() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }

  
  @Test
  public void Test1() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }
  
  @Test
  public void Test2() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  }
